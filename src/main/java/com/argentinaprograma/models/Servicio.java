package com.argentinaprograma.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "servicio")
public class Servicio implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idServicio;

    @Column(name = "nombre_servicio")
    private String nombreServicio;

    @Column(name = "descripcion_srvicio")
    private String descripcionServicio;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<TipoProblema> tiposProblemas;
}
