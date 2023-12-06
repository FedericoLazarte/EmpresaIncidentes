package com.argentinaprograma.models;

import com.argentinaprograma.adapter.ServicioMensaje;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tecnico implements Serializable {
    private int idTecnico;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Set<Especialidad> especialidades;
    private List<NotificacionMensaje> notificaciones;
    private ServicioMensaje medioNotificacionPreferido;
    private List<TiempoResolucionProblema> tiempoEstimadoDeResolucion;

}
