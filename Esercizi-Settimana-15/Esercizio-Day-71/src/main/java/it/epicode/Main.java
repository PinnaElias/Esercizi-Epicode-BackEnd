package it.epicode;

import it.epicode.dao.EventoDao;
import it.epicode.dao.LocationDao;
import it.epicode.dao.PartecipazioneDao;
import it.epicode.entities.*;

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
        e1.setEventDate(LocalDate.of(2024, 12, 25));
        //e1.setid() non si mette, il database se lo andrà a generare da solo
        e1.setMaxNumberOfPartecipants(2);

        dao.save(e1);

        Persona p1 = new Persona();
        p1.setNome("Franco");
        p1.setCognome("Onesto");
        p1.setEmail("f.onesto@gmail.it");
        p1.setDataDiNascita(LocalDate.of(1983, 2, 30));

        PartecipazioneDao partecipazioneDao = new PartecipazioneDao(em);
        Partecipazione par1 = new Partecipazione();
        par1.setEvento(e1);
        par1.setStatoPartecipazione(StatoPartecipazione.CONFERMATA);
        par1.setPersona(p1);

        LocationDao loc1 = new LocationDao(em);
        Location location = new Location();
        location.setCittà("Rimini");
        location.setNome("Mostra rinascimento");


    }
}
