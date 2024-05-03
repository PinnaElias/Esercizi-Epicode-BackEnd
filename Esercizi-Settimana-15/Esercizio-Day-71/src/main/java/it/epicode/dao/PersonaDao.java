package it.epicode.dao;

import it.epicode.entities.Partecipazione;
import it.epicode.entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;

public class PersonaDao {
    private EntityManager em;

    public PersonaDao(EntityManager em) {
        this.em = em;
    }

    public void save (Persona persona) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(persona);
        et.commit();
    }

    public Partecipazione getById(UUID id) {
        Partecipazione e = em.find(Partecipazione.class, id);
        return e;
    }

    public void delete (Persona persona) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(persona);
        et.commit();
    }
}
