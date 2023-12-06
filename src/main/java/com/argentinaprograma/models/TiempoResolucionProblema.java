package com.argentinaprograma.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tiempo_resProblema")
public class TiempoResolucionProblema implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long tiempResProblema;


    private TipoProblema tipoDeProblema;

    @Column(name = "tiempo_estimado", nullable = false)
    private int tiempoEstimado;
}
