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



}
