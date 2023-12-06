package com.argentinaprograma.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class Especialidad implements Serializable {
    private int idEspecialidad;
    private String nombre;
   private String descripcion;
}
