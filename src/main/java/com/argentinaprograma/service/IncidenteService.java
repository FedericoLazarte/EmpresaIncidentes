package com.argentinaprograma.service;

import com.argentinaprograma.dao.IncidenteDAO;
import com.argentinaprograma.models.Incidente;

import java.util.List;

public class IncidenteService {
    private IncidenteDAO dao = new IncidenteDAO();

    public Incidente buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<Incidente> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(Incidente entity) {
        dao.crear(entity);
    }

    public Incidente actualizar(Incidente entity) {
        return dao.actualizar(entity);
    }

    public void borrar(Incidente entity) {
        dao.borrar(entity);
    }
}
