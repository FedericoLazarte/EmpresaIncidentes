package com.argentinaprograma;

import com.argentinaprograma.models.Cliente;
import com.argentinaprograma.service.ClienteService;


public class Main {
    public static void main(String[] args) {
        ClienteService cliente = new ClienteService();
        cliente.crear(new Cliente());
    }
}