package com.argentinaprograma.models;

import com.argentinaprograma.adapter.ServicioMensaje;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tecnico")
public class Tecnico implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idTecnico;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaDeNacimiento;

    private Set<Especialidad> especialidades;

    @Column(name = "disponibilidad", nullable = false)
    private boolean estaDisponible;

    private List<NotificacionMensaje> notificaciones;

    private ServicioMensaje medioNotificacionPreferido;

    private List<TiempoResolucionProblema> tiempoEstimadoDeResolucion;

}
