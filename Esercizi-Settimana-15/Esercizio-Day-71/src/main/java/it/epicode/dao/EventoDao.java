package it.epicode.dao;

import it.epicode.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDao {
    private EntityManager em;

    public EventoDao(EntityManager em) {
        this.em = em;
    }

    public void save(Evento e) {
        EntityTransaction et = em.getTransaction(); //restituisci la transazione col db
        et.begin(); //inizia la comunicazione
        em.persist(e); //salva nel database l'oggetto evento e
        et.commit(); //self explanatory
    }

    public void delete(Evento e) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(e); //stessa identica logica del save ma l'ordine è di rimozione
        et.commit();
    }

    public Evento getById(int id){
        return this.em.find(Evento.class, id); //nell'argomento si specifica l'oggetto che si vuole ricevere al ritorno.
        // in questo caso si gli si chiede di far tornare sotto forma di Evento l'oggetto che corrisponde a quel id
    }
}
