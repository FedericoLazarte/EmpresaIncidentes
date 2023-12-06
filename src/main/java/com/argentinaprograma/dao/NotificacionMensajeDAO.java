package com.argentinaprograma.dao;

import com.argentinaprograma.models.NotificacionMensaje;

public class NotificacionMensajeDAO extends GenericJpaDao<NotificacionMensaje> {
    public NotificacionMensajeDAO() {
        setClase(NotificacionMensaje.class);
    }
}
