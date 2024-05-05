package it.epicode.dao;

import it.epicode.entities.Libri;
import it.epicode.entities.Riviste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

public class RivisteDAO {
    private EntityManager em;

    public RivisteDAO(EntityManager em){
        this.em = em;
    }

    public void save (Riviste riviste) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(riviste);
        et.commit();
    }

    public void delete(UUID ISBN) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Riviste rivista = em.find(Riviste.class, ISBN);
        if (rivista != null) {
            em.remove(rivista);
        }
        transaction.commit();
    }

    public Riviste getByISBN(UUID isbn) {
        return em.find(Riviste.class, isbn);
    }

    public List<Riviste> searchByYear(int anno) {
        TypedQuery<Riviste> query = em.createQuery("SELECT l FROM Riviste l WHERE l.year = :anno", Riviste.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<Riviste> searchByAuthor(String autore) {
        TypedQuery<Riviste> query = em.createQuery("SELECT l FROM Riviste l WHERE l.author = :autore", Riviste.class);
        query.setParameter("autore", autore);
        return query.getResultList();
    }

    public List<Riviste> searchByTitle(String titolo) {
        TypedQuery<Riviste> query = em.createQuery("SELECT l FROM Riviste l WHERE l.title LIKE :titolo", Riviste.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }
}
