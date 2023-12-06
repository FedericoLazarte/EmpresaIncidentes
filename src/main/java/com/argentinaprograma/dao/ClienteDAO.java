package com.argentinaprograma.dao;

import com.argentinaprograma.models.Cliente;

public class ClienteDAO extends GenericJpaDao<Cliente>{
    public ClienteDAO() {
        setClase(Cliente.class);
    }
}
