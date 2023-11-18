package com.argentinaprograma.models;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter @Setter
public class Cliente {
    private int idCliente;
    private String razonSocial;
    private String cuit;
    private List<Servicio> serviciosContratados;
    private List<Incidente> incidentesReportados;

    public void agregarServicio(Servicio servicios){}

    public void reportarIncidente(Incidente incidente){}

    public List<Incidente> obtenerIncidentesPorEstado(Incidente estado) {
        List<Incidente> ejemplo = new ArrayList<>();
        return ejemplo;
    }
}
