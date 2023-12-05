package com.argentinaprograma.models;

import com.argentinaprograma.mensaje.ServicioMensaje;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import java.util.List;
import java.util.Set;

@Getter @Setter
public class Tecnico {
    private int idTecnico;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Set<Especialidad> especialidades;
    private List<NotificacionMensaje> notificaciones;
    private ServicioMensaje medioNotificacionPreferido;
    private List<TimepoResolucionProblema> tiempoEstimadoDeResolucion;

}
