package it.epicode.dao;

import it.epicode.entities.Location;
import it.epicode.entities.Partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;

public class LocationDao {
    private EntityManager em;

    public LocationDao(EntityManager em) {
        this.em = em;
    }

    public void save (Location location) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(location);
        et.commit();
    }

    public Partecipazione getById(UUID id) {
        Partecipazione e = em.find(Partecipazione.class, id);
        return e;
    }

    public void delete (Location location) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(location);
        et.commit();
    }
}
