package com.argentinaprograma.service;

import com.argentinaprograma.dao.TipoProblemaDAO;
import com.argentinaprograma.models.TipoProblema;

import java.util.List;

public class TipoProblemaService {
    private TipoProblemaDAO dao = new TipoProblemaDAO();

    public TipoProblema buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<TipoProblema> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(TipoProblema entity) {
        dao.crear(entity);
    }

    public TipoProblema actualizar(TipoProblema entity) {
        return dao.actualizar(entity);
    }

    public void borrar(TipoProblema entity) {
        dao.borrar(entity);
    }
}
