package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter @Setter
public class TipoProblema implements Serializable {
    private int idTipoProblema;
    private String nombre;
    private String descripcion;
    private int tiempoMaxResolucion;



}
