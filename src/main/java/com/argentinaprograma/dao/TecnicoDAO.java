package com.argentinaprograma.dao;

import com.argentinaprograma.models.Tecnico;

public class TecnicoDAO extends GenericJpaDao<Tecnico>{
    public TecnicoDAO() {
        setClase(Tecnico.class);
    }
}
