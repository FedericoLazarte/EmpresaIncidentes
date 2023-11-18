package com.argentinaprograma.models;

import com.argentinaprograma.estado.Estado;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Incidente {
    private int idIncidente;
    private String descripcion;
    private Estado estado;
    private Date fechaCreacion;
    private Date fechaResolucion;
    private Tecnico tecnicoAsignado;
    private TipoProblema tipoProblema;
    private Operador operador;

    public void asignarTecnico(Tecnico tecnico) {

    }

    public void marcarResuelto(String consideraciones) {

    }

    public void notificarCliente(Cliente cliente) {

    }

}
