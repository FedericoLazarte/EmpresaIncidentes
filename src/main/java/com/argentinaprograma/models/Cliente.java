package com.argentinaprograma.models;

import com.argentinaprograma.mensaje.ServicioMensaje;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Cliente {
    private int idCliente;
    private String razonSocial;
    private String cuit;
    private String numeroCelular;
    private List<Servicio> serviciosContratados;
    private ServicioMensaje servicioMensaje;
    private List<NotificacionMensaje> notificaciones;

    public void agregarServicio(Servicio servicios){}

    public void reportarIncidente(Incidente incidente){}

    public List<Incidente> obtenerIncidentesPorEstado(Incidente estado) {
        List<Incidente> ejemplo = new ArrayList<>();
        return ejemplo;
    }
}
