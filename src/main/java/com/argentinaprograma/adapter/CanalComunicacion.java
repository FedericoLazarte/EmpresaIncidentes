package com.argentinaprograma.adapter;


import com.argentinaprograma.models.NotificacionMensaje;

public interface CanalComunicacion {
    void enviarNotificacion(NotificacionMensaje mensaje, String numeroCel);
}
