package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter @Setter
public class Operador {
    private int idOperador;
    private String nombre;
    private List<Incidente> indicentesGestionados;

    public void gestionarIncidente(Incidente incidente){}

    public List<Incidente> obtenerIncidentesPorTecnico(Tecnico tecnico) {
        return new ArrayList<>();
    }
}
