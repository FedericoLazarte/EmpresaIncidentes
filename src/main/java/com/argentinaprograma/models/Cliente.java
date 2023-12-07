package com.argentinaprograma.models;

import com.argentinaprograma.adapter.CanalComunicacion;
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
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "cuit", nullable = false)
    private String cuit;

    @Column(name = "numero_celular", nullable = false)
    private String numeroCelular;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Incidente> incidentes;

    @Transient
    private CanalComunicacion canalComunicacion;

    @ManyToMany
    @JoinTable(
            name = "cliente_servicio",
            joinColumns = @JoinColumn(name = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_servicio")
    )
    private List<Servicio> serviciosContratados;


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<NotificacionMensaje> notificaciones;


    public void registrarServicio(Servicio servicio) {
        if (agregarServicio(servicio)) {
            System.out.println("Servicio registrado correctamente");
        } else {
            System.out.println("El servicio ya se encuentra registrado");
        }
    }

    public void registrarIncidente(Incidente incidente) {
        if (incidenteCerrado(incidente)) {
            System.out.println("El incidente que se trata de registrar ya fue solucionado");
        } else {
            agregarIncidente(incidente);
            System.out.println("Incidente registrado");
        }
    }

    private boolean agregarServicio(Servicio servicio) {
        if (!serviciosContratados.contains(servicio)) {
            serviciosContratados.add(servicio);
            return true;
        }
        return false;
    }

    private boolean incidenteCerrado(Incidente incidente) {
        return incidente.isIncidenteCerrado();
    }

    private void agregarIncidente(Incidente incidente) {
        incidentes.add(incidente);
    }



}
