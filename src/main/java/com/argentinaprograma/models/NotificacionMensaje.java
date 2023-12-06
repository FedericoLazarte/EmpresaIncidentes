package com.argentinaprograma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificacionMensaje implements Serializable {
    private String titulo;
    private String campoMensaje;
    private Incidente incidente;
    private boolean enviado;
}
