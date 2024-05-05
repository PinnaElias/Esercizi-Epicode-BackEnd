package it.epicode.dao;

import it.epicode.entities.Libri;
import it.epicode.entities.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

public class PrestitoDAO {

    private EntityManager em;

    public PrestitoDAO(EntityManager em){
        this.em = em;
    }

    public void save (Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(prestito);
        et.commit();
    }

    public void delete(Prestito prestito) {
        em.getTransaction().begin();
        em.remove(prestito);
        em.getTransaction().commit();
    }
}

    public List<Prestito> searchByMembershipId(int membership_id) {
        TypedQuery<Prestito> query = EntityManager.createQuery(
                "SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :numeroTessera", Prestito.class);
        query.setParameter("numeroTessera", membership_id);
        return query.getResultList();
    }
}
