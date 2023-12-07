package com.argentinaprograma.estado;

import com.argentinaprograma.models.Incidente;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Estado {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public abstract void cambiarEstado(Incidente incidente);
    public abstract void marcarResuelto(Incidente incidente, String consideraciones);

}
