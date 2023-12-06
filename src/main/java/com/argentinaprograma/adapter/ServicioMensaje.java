package com.argentinaprograma.adapter;


import com.argentinaprograma.models.NotificacionMensaje;

public interface ServicioMensaje {
    void enviarNotificacion(NotificacionMensaje mensaje, String numeroCel);
}
