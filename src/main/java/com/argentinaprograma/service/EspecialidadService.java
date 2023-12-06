package com.argentinaprograma.service;

import com.argentinaprograma.dao.EspecialidadDAO;
import com.argentinaprograma.models.Especialidad;

import java.util.List;

public class EspecialidadService {
    private EspecialidadDAO dao = new EspecialidadDAO();

    public Especialidad buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<Especialidad> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(Especialidad entity) {
        dao.crear(entity);
    }

    public Especialidad actualizar(Especialidad entity) {
        return dao.actualizar(entity);
    }

    public void borrar(Especialidad entity) {
        dao.borrar(entity);
    }
}
