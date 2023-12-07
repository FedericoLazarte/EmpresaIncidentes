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
    @Column(name="id_servicio")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idServicio;

    @Column(name = "nombre_servicio")
    private String nombreServicio;

    @Column(name = "descripcion_srvicio")
    private String descripcionServicio;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<Problema> problemas;

    @ManyToMany(mappedBy = "serviciosContratados")
    private List<Cliente> clientes;

    public boolean agregarProblema(Problema problema) {
        if (problema == null) {
            throw new IllegalArgumentException("El problema no puede ser nulo");
        }

        return agregarProblemaSiNoExiste(problema);
    }

    public boolean agregarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }

        return agregarClienteSiNoExiste(cliente);
    }   

    private boolean agregarClienteSiNoExiste(Cliente cliente) {
        if (!contieneCliente(cliente)) {
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }

    private boolean contieneCliente(Cliente cliente) {
        return this.clientes.contains(cliente);
    }


    private boolean agregarProblemaSiNoExiste(Problema problema) {
        if (!contieneProblema(problema)) {
            this.problemas.add(problema);
            problema.setServicio(this);
            return true;
        }
        return false;
    }

    private boolean contieneProblema(Problema problema) {
        return this.problemas.contains(problema);
    }



}
