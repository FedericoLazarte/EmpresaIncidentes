package com.argentinaprograma.mensaje;

import com.argentinaprograma.models.NotificacionMensaje;

public interface AdapterRemitenteWhatsApp {
    void notificacionWspp(NotificacionMensaje notificacion, String numeroCel);
}
