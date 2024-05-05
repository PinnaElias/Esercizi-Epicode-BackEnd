package it.epicode.dao;

import it.epicode.entities.Libri;
import it.epicode.entities.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

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

    public void delete(UUID ISBN) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Libri libro = em.find(Libri.class, ISBN);
        if (libro != null) {
            em.remove(libro);
        }
        transaction.commit();
    }

    public Libri getByISBN(UUID isbn) {
        return em.find(Libri.class, isbn);
    }

    public List<Libri> searchByYear(int anno) {
        TypedQuery<Libri> query = em.createQuery("SELECT l FROM Libri l WHERE l.year = :anno", Libri.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<Libri> searchByAuthor(String autore) {
        TypedQuery<Libri> query = em.createQuery("SELECT l FROM Libri l WHERE l.author = :autore", Libri.class);
        query.setParameter("autore", autore);
        return query.getResultList();
    }

    public List<Libri> searchByTitle(String titolo) {
        TypedQuery<Libri> query = em.createQuery("SELECT l FROM Libri l WHERE l.title LIKE :titolo", Libri.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }


}
