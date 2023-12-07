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
    @Column(name="id_problema")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProblema;

    @ManyToOne
    @JoinColumn(name = "id_incidente")
    private Incidente incidente;

    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_tipo_problema")
    private TipoProblema tipoProblema;

/*    @Column(name = "tiempo_resolucion", nullable = false)
    private LocalDate tiempoEstimadoResolucion;

    @Column(name = "horas_extras", nullable = false)
    private int horasExtras;

    @Column(name = "fecha_resolucion", nullable = false)
    private LocalDate fechaDeResolucion; */

}
