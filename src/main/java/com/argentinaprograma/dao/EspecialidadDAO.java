package com.argentinaprograma.dao;

import com.argentinaprograma.models.Especialidad;

public class EspecialidadDAO extends GenericJpaDao<Especialidad>{
    public EspecialidadDAO() {
        setClase(Especialidad.class);
    }
}
