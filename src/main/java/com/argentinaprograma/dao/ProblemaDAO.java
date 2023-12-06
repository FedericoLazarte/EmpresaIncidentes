package com.argentinaprograma.dao;

import com.argentinaprograma.models.Problema;

public class ProblemaDAO extends GenericJpaDao<Problema> {
    public ProblemaDAO() {
        setClase(Problema.class);
    }
}
