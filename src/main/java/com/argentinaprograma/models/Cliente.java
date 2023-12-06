package com.argentinaprograma.models;

import com.argentinaprograma.adapter.ServicioMensaje;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idCliente;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "cuit")
    private String cuit;

    @Column(name = "numero_celular")
    private String numeroCelular;

    @Column(name = "servicios_contratados")
    private List<Servicio> serviciosContratados;

    @Column(name = "servicio_mensaje")
    private ServicioMensaje servicioMensaje;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<NotificacionMensaje> notificaciones;

    public void agregarServicio(Servicio servicios){}

    public void reportarIncidente(Incidente incidente){}

    public List<Incidente> obtenerIncidentesPorEstado(Incidente estado) {
        List<Incidente> ejemplo = new ArrayList<>();
        return ejemplo;
    }

    public void setRazonSocial(String nombre) {
        this.razonSocial = nombre;
    }

}
