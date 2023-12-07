package com.argentinaprograma.estado;

import com.argentinaprograma.models.Incidente;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estado_en_progreso")
public class EstadoEnProgreso extends Estado {
    @Override
    public void marcarResuelto(Incidente incidente, String consideraciones) {
        System.out.println("No se puede marcar como resuelto desde el estado En Progreso.");
    }

    @Override
    public void cambiarEstado(Incidente incidente) {
        incidente.setEstado(new EstadoResuelto());
    }
}
