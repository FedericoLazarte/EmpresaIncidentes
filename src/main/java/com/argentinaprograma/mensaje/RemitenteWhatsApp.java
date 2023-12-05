package com.argentinaprograma.mensaje;

import com.argentinaprograma.models.NotificacionMensaje;

public class RemitenteWhatsApp implements ServicioMensaje{
    AdapterRemitenteWhatsApp adapter;


    @Override
    public void enviarNotificacion(NotificacionMensaje mensaje, String numeroCel) {
        adapter.notificacionWspp(mensaje, numeroCel);
    }
}
