package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter @Setter
public class Tecnico {
    private int idTecnico;
    private String nombre;
    private List<Especialidad> especialidades;
    private String medioNotificacionPreferido;

    public void agregarEspecialidad(Especialidad esp){}

    public void resolverIncidente(Incidente incidente){}
    public int obtenerCantidadIncidentesResueltosEnPeriodo(Date fechaInicio, Date fechaFin) {
        return 0;
    }
}
