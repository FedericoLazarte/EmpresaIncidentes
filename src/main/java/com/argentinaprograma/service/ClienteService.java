package com.argentinaprograma.service;

import com.argentinaprograma.dao.ClienteDAO;
import com.argentinaprograma.models.Cliente;

import java.util.List;

public class ClienteService {
    private ClienteDAO dao = new ClienteDAO();

    public Cliente buscarUnElemento(int id) {
        return dao.buscarUnElemento(id);
    }

    public List<Cliente> buscarTodos() {
        return dao.buscarTodos();
    }
    public void crear(Cliente entity) {
        dao.crear(entity);
    }

    public Cliente actualizar(Cliente entity) {
        return dao.actualizar(entity);
    }

    public void borrar(Cliente entity) {
        dao.borrar(entity);
    }


}
