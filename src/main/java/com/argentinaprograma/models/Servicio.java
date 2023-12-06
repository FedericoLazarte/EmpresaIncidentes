package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter @Setter
public class Servicio implements Serializable {
    private int idServicio;
    private String nombreServicio;
    private String descripcionServicio;
    private List<TipoProblema> tiposProblemas;
}
