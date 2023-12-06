package com.argentinaprograma.service;

import com.argentinaprograma.dao.ProblemaDAO;
import com.argentinaprograma.models.Problema;

import java.util.List;

public class ProblemaService {
    private ProblemaDAO dao = new ProblemaDAO();

    public Problema bucarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<Problema> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(Problema entity) {
        dao.crear(entity);
    }

    public Problema actualizar(Problema entity) {
        return dao.actualizar(entity);
    }

    public void borrar(Problema entity) {
        dao.borrar(entity);
    }
}
