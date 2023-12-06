package com.argentinaprograma.service;

import com.argentinaprograma.dao.TecnicoDAO;
import com.argentinaprograma.models.Tecnico;

import java.util.List;

public class TecnicoService {
    private TecnicoDAO dao = new TecnicoDAO();

    public Tecnico buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<Tecnico> buscarTodos() {
        return dao.buscarTodos();
    }

    public void crear(Tecnico entity) {
        dao.crear(entity);
    }

    public Tecnico actualizar(Tecnico entity) {
        return dao.actualizar(entity);
    }

    public void borrar(Tecnico entity) {
        dao.borrar(entity);
    }
}
