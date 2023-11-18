package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Especialidad {
    private int idEspecialidad;
    private String nombreEspecialidad;
    private TipoProblema tipoProblema;
}
