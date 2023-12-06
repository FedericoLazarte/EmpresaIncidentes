package com.argentinaprograma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TiempoResolucionProblema implements Serializable {
    private TipoProblema tipoDeProblema;
    private int tiempoEstimado;
}
