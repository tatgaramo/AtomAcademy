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
@EqualsAndHashCode
@Entity
@Table(name = "Alumno")
public class Alumno implements Serializable {

    //Creamos Propiedades
    @Id //Indicamos que ID es clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumnoID") //De esta forma mapeamos la columna con la propiedad
    private Integer id;
    @Column(name = "documento")
    private String documento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "email")
    private String email;
    @Column(name = "fechaNac")
    private LocalDate fechaNac;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "alumno", fetch = FetchType.EAGER)
    private List<Nota> notas = new ArrayList<>();

    @OneToMany(mappedBy = "alumno", fetch = FetchType.EAGER)
    private List<Pago> pagos = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "CursoAlumno",
            joinColumns = @JoinColumn(name = "alumnoID"),
            inverseJoinColumns = @JoinColumn(name = "cursoID")
    )
    private List<Curso> cursos = new ArrayList<>();

    //devuelve la cuota acumulada de todos los cursos a los que está inscrito el alumno
    public int getCuota() {
        int cuotaTotal = 0;
        if (cursos != null && !cursos.isEmpty()) {
            for (Curso curso : cursos) {
                cuotaTotal += curso.getCuota();
            }
        }
        return cuotaTotal;
    }

    //devuelve una cadena con los nombres de los cursos a los que pertenece el alumno
    public String getNombreCursos() {
        StringBuilder cursosTotales = new StringBuilder();
        if (cursos != null && !cursos.isEmpty()) {
            for (Curso curso : cursos) {
                cursosTotales.append(curso.getNombre()).append(", ");
            }
            cursosTotales.setLength(cursosTotales.length() - 2);
        }
        return cursosTotales.toString();
    }

}
