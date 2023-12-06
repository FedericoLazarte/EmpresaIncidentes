package com.argentinaprograma.service;

import com.argentinaprograma.dao.NotificacionMensajeDAO;
import com.argentinaprograma.models.NotificacionMensaje;

import java.util.List;

public class NotificacionMensajeService {
    private NotificacionMensajeDAO dao = new NotificacionMensajeDAO();

    public NotificacionMensaje buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<NotificacionMensaje> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(NotificacionMensaje entity) {
        dao.crear(entity);
    }

    public NotificacionMensaje actualizar(NotificacionMensaje entity) {
        return dao.actualizar(entity);
    }

    public void borrar(NotificacionMensaje entity) {
        dao.borrar(entity);
    }
}
