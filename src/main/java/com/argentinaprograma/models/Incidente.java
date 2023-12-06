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
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idIncidente;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private Estado estado;

    @Column(name = "fecha_creacion",nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "fecha_resolucion", nullable = false)
    private LocalDate fechaResolucion;

    @OneToMany(mappedBy = "incidente", cascade = CascadeType.ALL)
    private List<Problema> problemas;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_tecnico_asignado", nullable = false)
    private Tecnico tecnicoAsignado;

    private Servicio servicioReportado;

    @Column(name = "incidente_cerrado", nullable = false)
    private boolean incideteCerrado;

    @Column(name = "complejo", nullable = false)
    private boolean esUnIndicenteComplejo;


    public void agregarProblema(Problema problema){}

    public void notificarTecnico(NotificacionMensaje mensaje){}

}
