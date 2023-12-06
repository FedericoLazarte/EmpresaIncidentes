package com.argentinaprograma.dao;

import com.argentinaprograma.models.Incidente;

public class IncidenteDAO extends GenericJpaDao<Incidente>{
    public IncidenteDAO() {
        setClase(Incidente.class);
    }
}
