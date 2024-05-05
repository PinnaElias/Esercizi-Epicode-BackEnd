package it.epicode.dao;

import it.epicode.entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LibriDAO {

    private EntityManager em;

    public LibriDAO(EntityManager em){
        this.em = em;
    }

    public void save (Libri libri) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(libri);
        et.commit();
    }

}
