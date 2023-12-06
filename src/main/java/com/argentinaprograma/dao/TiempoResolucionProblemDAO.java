package com.argentinaprograma.dao;

import com.argentinaprograma.models.TiempoResolucionProblema;

public class TiempoResolucionProblemDAO extends GenericJpaDao<TiempoResolucionProblema> {
    public TiempoResolucionProblemDAO() {
        setClase(TiempoResolucionProblema.class);
    }
}
