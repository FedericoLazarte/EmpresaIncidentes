package com.argentinaprograma.models;

import com.argentinaprograma.estado.Estado;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Incidente implements Serializable {
    private int idIncidente;
    private String descripcion;
    private Estado estado;
    private LocalDate fechaCreacion;
    private LocalDate fechaResolucion;
    private List<Problema> problemas;
    private Tecnico tecnicoAsignado;
    private boolean incideteCerrado;
    private boolean esUnIndicenteComplejo;


    public void asignarTecnico(Tecnico tecnico) {

    }

    public void marcarResuelto(String consideraciones) {

    }

    public void notificarCliente(Cliente cliente) {

    }

}
