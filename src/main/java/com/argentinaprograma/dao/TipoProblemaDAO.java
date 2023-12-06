package com.argentinaprograma.dao;

import com.argentinaprograma.models.TipoProblema;

public class TipoProblemaDAO extends GenericJpaDao<TipoProblema> {
    public TipoProblemaDAO() {
        setClase(TipoProblema.class);
    }
}
