package com.argentinaprograma;

import com.argentinaprograma.models.Cliente;
import com.argentinaprograma.service.ClienteService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        ClienteService cliente = new ClienteService();
        cliente.crear(new Cliente());
    }
}