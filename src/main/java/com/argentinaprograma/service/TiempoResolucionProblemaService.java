package com.argentinaprograma.service;

import com.argentinaprograma.dao.TiempoResolucionProblemDAO;

import java.util.List;

public class TiempoResolucionProblemaService {
    private TiempoResolucionProblemDAO dao = new TiempoResolucionProblemDAO();

    public TiempoResolucionProblema buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<TiempoResolucionProblema> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(TiempoResolucionProblema entity) {
        dao.crear(entity);
    }

    public TiempoResolucionProblema actualizar(TiempoResolucionProblema entity) {
        return dao.actualizar(entity);
    }

    public void borrar(TiempoResolucionProblema entity) {
        dao.borrar(entity);
    }
}
