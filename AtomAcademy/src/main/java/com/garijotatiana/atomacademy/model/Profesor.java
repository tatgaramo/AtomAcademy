
package com.garijotatiana.atomacademy.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.*;
/**
 *
 * @author Tatiana
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Profesor")
public class Profesor implements Serializable {
    
    //Creamos Propiedades
    @Id //Indicamos que ID es clave primaria
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="profesorID") //De esta forma mapeamos la columna con la propiedad
    private Integer id;
    @Column (name="documento")
    private String documento;
    @Column (name="nombre")
    private String nombre;
    @Column (name="apellidos")
    private String apellidos;
    @Column (name="direccion")
    private String direccion;
    @Column (name="telefono")
    private String telefono;
    @Column (name="fechaNac")
    private LocalDate fechaNac;
    @Column (name="email")
    private String email;
    
    @OneToMany(mappedBy = "profesor",fetch = FetchType.EAGER)
    private List<Curso> cursos=new ArrayList<>();
    
    public String getNombreCursos() {
       StringBuilder cursosTotales = new StringBuilder();
       if (cursos != null&& !cursos.isEmpty()) {
            for (Curso curso : cursos) {
                cursosTotales.append(curso.getNombre()).append(", ");
            }
            cursosTotales.setLength(cursosTotales.length()-2);
        }
        return cursosTotales.toString();
    }
    
    public String getNombreCompleto(){
        return this.nombre+" "+ this.apellidos;
    }
}
