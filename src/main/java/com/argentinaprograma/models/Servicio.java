package com.argentinaprograma.models;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servicio implements Serializable {
    private int idServicio;
    private String nombreServicio;
    private String descripcionServicio;
    private List<TipoProblema> tiposProblemas;
}
