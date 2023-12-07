package com.argentinaprograma.estado;

import com.argentinaprograma.models.Incidente;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estado_resuelto")
public class EstadoResuelto extends Estado{

    @Override
    public void cambiarEstado(Incidente incidente) {
        System.out.println("El incidente ya está resuelto, no se puede cambiar el estado.");
    }

    @Override
    public void marcarResuelto(Incidente incidente, String consideraciones) {
        System.out.println("El incidente ya está marcado como resuelto.");
    }
}
