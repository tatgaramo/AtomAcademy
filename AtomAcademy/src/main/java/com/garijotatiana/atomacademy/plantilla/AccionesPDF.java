package com.garijotatiana.atomacademy.plantilla;

import com.garijotatiana.atomacademy.Auxiliar;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;

/**
 *
 * @author Tatiana
 */
public class AccionesPDF {

    //JTable table;
    Auxiliar aux;
    String fecha;
    //String headers[];

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public AccionesPDF() {
        documento = new Document();
        //establecer el formato y la fecha actual que se usará en la cabecera del documento
        LocalDateTime date = LocalDateTime.now();
        fecha = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public void crearPlantilla(String nomTitulo, JTable table, String[] headers) {

        titulo = new Paragraph(nomTitulo);
        String fileName;
        try {
            //menú para que el usuario decida el nombre y la ubicación del documento
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar archivo PDF");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PDF (*.pdf)", "pdf"));

            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {//si la elección del menú es aceptadapor el usuario
                fileName = fileChooser.getSelectedFile().getAbsolutePath();
                //comprobar si el usuario ha indicado en el nombre la extensión del archivo
                if (!fileName.endsWith(".pdf")) {
                    fileName = fileName + ".pdf";
                }
                archivo = new FileOutputStream(fileName);
                PdfWriter.getInstance(documento, archivo);
                documento.open();

                Image image = null;
                try {
                    image = Image.getInstance(getClass().getClassLoader().getResource("titulo.png"));
                    image.scaleToFit(documento.getPageSize().getWidth(), 100);//ajustar el tamaño de la imagen con el de la página
                    image.setAlignment(1);

                } catch (Exception e) {
                    aux.mostrarMensaje("Error con la imagen del PDF", "Error", "Error al editar");
                }
                //añadir imagen al documento
                documento.add(image);
                documento.add(Chunk.NEWLINE);//salto de línea*/
                documento.add(Chunk.NEWLINE);
                titulo.setAlignment(1);//centrado
                documento.add(titulo);

                //nuevo párrafo con la fecha
                Paragraph pFecha = new Paragraph(fecha);
                pFecha.setAlignment(2);//alinear drch
                documento.add(pFecha);//añadir al documento
                documento.add(Chunk.NEWLINE);

                //utilizar el modelo de la tabla para crear la pdfTable
                TableModel model = table.getModel();
                int numColumnas = model.getColumnCount();//num de columnas del modelo de tabla
                PdfPTable pdfTabla = new PdfPTable(numColumnas);
                pdfTabla.setWidthPercentage(100);
                pdfTabla.setHorizontalAlignment(1);

                //añadir cabecera de tabla
                for (String head : headers) {
                    PdfPCell cell = new PdfPCell(new Phrase(head));

                    cell.setBackgroundColor(new BaseColor(140, 166, 219));
                    cell.setPhrase(new Phrase(head));
                    cell.setHorizontalAlignment(1);
                    cell.setPadding(5);
                    cell.setVerticalAlignment(1);

                    pdfTabla.addCell(cell);

                }

                //recorrer el modelo de tabla y pasar los datos a la ppdfTable
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < numColumnas; j++) {
                        Object valorCampo = model.getValueAt(i, j);
                        PdfPCell cell = new PdfPCell(new Phrase(valorCampo == null ? "" : valorCampo.toString()));
                        cell.setHorizontalAlignment(1);
                        cell.setPadding(5);
                        cell.setVerticalAlignment(1);
                        pdfTabla.addCell(cell);
                    }
                }

                documento.add(pdfTabla);
                documento.add(Chunk.NEWLINE);

                documento.close();

            } else {
                aux.mostrarMensaje("Acción Exportar Cancelado", "Error", "Cancelado");
            }
        } catch (Exception ex) {
            aux.mostrarMensaje("Error al Exportar", "Error", "Error");
        }
    }

    public void exportarPDFInfo() {
        try (InputStream is = AccionesPDF.class.getResourceAsStream("/readme.pdf")) {

            if (is != null) {
                //menú para que el usuario decida el nombre y la ubicación del documento
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Descargar archivo PDF");
                fileChooser.setSelectedFile(new File ("AtomAcademy_Info.pdf"));
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                int userSelection = fileChooser.showSaveDialog(null);

                if (userSelection == JFileChooser.APPROVE_OPTION) {//si la elección del menú es aceptadapor el usuario
                     try {
                         
                         Path dir = fileChooser.getSelectedFile().toPath();
                         Path out= dir.resolve("AtomAcademy_Info.pdf" );
                    
                    if (Files.exists(dir)) {
                   
                        Files.copy(is, out, StandardCopyOption.REPLACE_EXISTING);
                    
                    }
                         
                    } catch (Exception ex) {
                        aux.mostrarMensaje("Error durante la descarga de la información", "Error", "Error");
                    }
                }
            } else {
                aux.mostrarMensaje("Error imposible descargar la información", "Error", "Error");
            }
        } catch (Exception ex) {
            aux.mostrarMensaje("Error", "Error", "Error");
        }

    }

}


