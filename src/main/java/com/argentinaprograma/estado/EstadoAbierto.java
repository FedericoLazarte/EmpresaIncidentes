package com.argentinaprograma.estado;

import com.argentinaprograma.models.Incidente;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estado_abierto")
public class EstadoAbierto extends Estado {

    @Override
    public void marcarResuelto(Incidente incidente, String consideraciones) {
        System.out.println("No se puede marcar como resuelto, el incidente está abierto.");
    }

    @Override
    public void cambiarEstado(Incidente incidente) {
        incidente.setEstado(new EstadoEnProgreso());
    }
}
