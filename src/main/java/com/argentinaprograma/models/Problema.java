package com.argentinaprograma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Problema implements Serializable {
    private Servicio servicio;
    private TipoProblema tipoProblema;
    private LocalDate tiempoEstimadoResolucion;
    private int horasExtras;
    private LocalDate fechaDeResolucion;

}
