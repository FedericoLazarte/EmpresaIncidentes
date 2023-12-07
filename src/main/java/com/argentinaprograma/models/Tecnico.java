package com.argentinaprograma.models;

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
    @Column(name="id_tecnico")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTecnico;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaDeNacimiento;

    @ManyToMany
    @JoinTable(
        name = "tecnico_especialidad",
        joinColumns = @JoinColumn(name = "id_tenico"),
        inverseJoinColumns = @JoinColumn(name = "id_especialidad")
    )
    private Set<Especialidad> especialidades;

    @Column(name = "disponibilidad", nullable = false)
    private boolean estaDisponible;

    @OneToMany(mappedBy = "tecnicoAsignado")
    private List<Incidente> incidentesAsignados;

     public boolean agregarEspecialidad(Especialidad especialidad) {
        if (especialidad == null) {
            throw new IllegalArgumentException("La especialidad no puede ser nula");
        }

        return agregarEspecialidadSiNoExiste(especialidad);
    }

    private boolean agregarEspecialidadSiNoExiste(Especialidad especialidad) {
        if (!contieneEspecialidad(especialidad)) {
            this.especialidades.add(especialidad);
            return true;
        }
        return false;
    }

    private boolean contieneEspecialidad(Especialidad especialidad) {
        return this.especialidades.contains(especialidad);
    }

    public boolean agregarIncidente(Incidente incidente) {
        if (incidente == null) {
            throw new IllegalArgumentException("El incidente no puede ser nulo");
        }

        return agregarIncidenteSiNoExiste(incidente);
    }

    private boolean agregarIncidenteSiNoExiste(Incidente incidente) {
        if (!contieneIncidente(incidente)) {
            this.incidentesAsignados.add(incidente);
            incidente.setTecnicoAsignado(this);
            return true;
        }
        return false;
    }

    private boolean contieneIncidente(Incidente incidente) {
        return this.incidentesAsignados.contains(incidente);
    }



}
