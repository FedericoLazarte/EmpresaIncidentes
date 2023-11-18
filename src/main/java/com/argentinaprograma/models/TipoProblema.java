package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class TipoProblema {
    private int idTipoProblema;
    private String nombreTipoProblema;
    private List<Especialidad> especialidades;
    private int tiempoMaxResolucion;

    public void agregarEspecialidad(Especialidad especialidad){}

    public Tecnico obtenerTecnicoMasRapidoReSolviendoIncidentesEnUltimosNDias(int dias) {
        return null;
    }
}
