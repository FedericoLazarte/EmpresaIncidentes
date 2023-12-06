package com.argentinaprograma.service;

import com.argentinaprograma.dao.ServicioDAO;
import com.argentinaprograma.models.Servicio;

import java.util.List;

public class ServicioService {
    private ServicioDAO dao = new ServicioDAO();

    public Servicio buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<Servicio> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(Servicio entity) {
        dao.crear(entity);
    }

    public Servicio actualizar(Servicio entity) {
        return dao.actualizar(entity);
    }

    public void borrar(Servicio entity) {
        dao.borrar(entity);
    }
}
