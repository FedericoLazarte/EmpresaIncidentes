package com.argentinaprograma.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidad")
public class Especialidad implements Serializable {
    @Id
    @Column(name="id_especialidad")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEspecialidad;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
   private String descripcion;
}
