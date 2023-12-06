package com.argentinaprograma.models;

import java.io.Serializable;
import java.time.LocalDate;

public class Problema implements Serializable {
    private Servicio servicio;
    private TipoProblema tipoProblema;
    private LocalDate tiempoEstimadoResolucion;
    private int horasExtras;
    private LocalDate fechaDeResolucion;

}
