package com.argentinaprograma.dao;
import com.argentinaprograma.configuracion.ConfiguracioBD;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;

public abstract class GenericJpaDao<T extends Serializable> {
    private Class<T> clase;

    EntityManager entityManager = ConfiguracioBD.getEntityManager();

    public final void setClase(Class<T> claseSet) {
        this.clase = claseSet;
    }

    public T buscarUnElemento(int id) {
        return entityManager.find(clase, id);
    }

    public List<T> buscarTodos() {
        return entityManager.createQuery("de " + clase.getName())
                .getResultList();
    }

    public void crear(T entity) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public T actualizar(T entity) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        T entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void borrar(T entity) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }
}
