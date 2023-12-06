package com.argentinaprograma.dao;

import com.argentinaprograma.models.Servicio;

public class ServicioDAO extends GenericJpaDao<Servicio> {
    public ServicioDAO() {
        setClase(Servicio.class);
    }
}
