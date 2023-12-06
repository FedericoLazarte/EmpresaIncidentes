package com.argentinaprograma.models;

import java.io.Serializable;

public class NotificacionMensaje implements Serializable {
    private String titulo;
    private String campoMensaje;
    private Incidente incidente;
    private boolean enviado;
}
