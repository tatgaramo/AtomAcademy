
package com.garijotatiana.atomacademy.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "Pago")
public class Pago implements Serializable{
    
    //Creamos Propiedades
    @Id //Indicamos que ID es clave primaria
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="pagoID") //De esta forma mapeamos la columna con la propiedad
    private Integer id;
    @Column (name="fecha")
    private LocalDate fecha;
    @Column (name="periodo")
    private String periodo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="alumnoID")
    private Alumno alumno;
      
    
}
