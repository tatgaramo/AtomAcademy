package com.garijotatiana.atomacademy.model;

import jakarta.persistence.*;
import java.io.Serializable;
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
@Table(name = "Curso")
public class Curso implements Serializable {

    //Creamos Propiedades
    @Id //Indicamos que ID es clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cursoID") //De esta forma mapeamos la columna con la propiedad
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "horario")
    private String horario;
    @Column(name = "capacidad")
    private int capacidad;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cuota")
    private int cuota;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profesorID")
    private Profesor profesor;

    @ManyToMany(mappedBy = "cursos", fetch = FetchType.EAGER)
    private List<Alumno> alumnos = new ArrayList<>();
    

    public boolean isCompleto() {
        // Actualizar el número de alumnos
        int numAlu = alumnos.size();

        // Comprobar si el curso está completo
        boolean completo= ! (capacidad>numAlu);
        
        return completo;
    }
    
    public int getNumAlu(){
        return alumnos.size();
    }

}
