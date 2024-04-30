package it.epicode;

import it.epicode.dao.EventoDao;
import it.epicode.entities.Evento;
import it.epicode.entities.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi"); //designPattern. si copincolla spudoratamente
        EntityManager em = emf.createEntityManager();
        EventoDao dao = new EventoDao(em); //istanzia l'eventoDao, fa il segretario in pratica


        Evento e1 = new Evento();
        e1.setDescription("Riunione alcolisti anonimi");
        e1.setTipoEvento(TipoEvento.PUBBLICO);
        e1.setTitle("FESTA ALCOLICA");
        e1.setEventDate(LocalDate.of(2024,12,25));
        //e1.setid() non si mette, il database se lo andrà a generare da solo
        e1.setMaxNumberOfPartecipants(2);

        dao.save(e1);
    }
}
