
package com.garijotatiana.atomacademy.model;

import jakarta.persistence.*;
import java.io.Serializable;
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
@Table(name = "Nota")
public class Nota implements Serializable{
    
    @Id //Indicamos que ID es clave primaria
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="notaID") //De esta forma mapeamos la columna con la propiedad
    private Integer id;
    @Column (name="nota")
    private float nota;
    @Column (name="evaluacion")
    private String evaluacion;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cursoID")
    private Curso curso;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "alumnoID")
    private Alumno alumno;
    
}
