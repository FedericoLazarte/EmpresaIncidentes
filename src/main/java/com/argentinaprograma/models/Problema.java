package com.argentinaprograma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "problema")
public class Problema implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProblema;


    private Servicio servicio;

    private TipoProblema tipoProblema;

    @Column(name = "tiempo_resolucion", nullable = false)
    private LocalDate tiempoEstimadoResolucion;

    @Column(name = "horas_extras", nullable = false)
    private int horasExtras;

    @Column(name = "fecha_resolucion", nullable = false)
    private LocalDate fechaDeResolucion;

}
