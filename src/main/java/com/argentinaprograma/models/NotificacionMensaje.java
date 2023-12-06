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
@Table(name = "notificacion_mensaje")
public class NotificacionMensaje implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idNotificacionMensaje;

    @Column(name = "titulo")
    private String titulo;

    @Column(name ="campo_mensaje")
    private String campoMensaje;


    private Incidente incidente;
    private boolean enviado;
}
