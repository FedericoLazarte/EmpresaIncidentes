package com.argentinaprograma;

import com.argentinaprograma.models.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente cliente = new Cliente();
        cliente.setRazonSocial("Bancamos");

        em.persist(cliente);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}