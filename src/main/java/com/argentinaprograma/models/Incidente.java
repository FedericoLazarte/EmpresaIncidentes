package com.argentinaprograma.models;

import com.argentinaprograma.estado.Estado;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "incidente")
public class Incidente implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idIncidente;


    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @Column(name = "fecha_creacion",nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "fecha_resolucion", nullable = false)
    private LocalDate fechaResolucion;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "incidente", cascade = CascadeType.ALL)
    private List<Problema> problemas;

    @ManyToOne
    @JoinColumn(name = "id_tecnico_asignado")
    private Tecnico tecnicoAsignado;


    @Column(name = "complejo", nullable = false)
    private boolean esComplejo;

    @Column(name = "incidente_cerrado")
    private boolean incidenteCerrado;


    public boolean agregarProblema(Problema problema) {
        if (problema == null) {
            throw new IllegalArgumentException("El problema no puede ser nulo");
        }

        return agregarProblemaSiNoExiste(problema);
    }

    private boolean agregarProblemaSiNoExiste(Problema problema) {
        if (!contieneProblema(problema)) {
            this.problemas.add(problema);
            problema.setIncidente(this);
            return true;
        }
        return false;
    }

    private boolean contieneProblema(Problema problema) {
        return this.problemas.contains(problema);
    }



}
