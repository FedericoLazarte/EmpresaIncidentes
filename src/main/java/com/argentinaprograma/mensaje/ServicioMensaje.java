package com.argentinaprograma.mensaje;


import com.argentinaprograma.models.NotificacionMensaje;

public interface ServicioMensaje {
    void enviarNotificacion(NotificacionMensaje mensaje, String numeroCel);
}
