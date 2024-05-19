package it.epicode.progettofinesettimana.runner;

import it.epicode.progettofinesettimana.entities.Edificio;
import it.epicode.progettofinesettimana.entities.Postazione;
import it.epicode.progettofinesettimana.entities.Prenotazione;
import it.epicode.progettofinesettimana.entities.Utente;
import it.epicode.progettofinesettimana.enums.CategoriaPostazioneEnum;
import it.epicode.progettofinesettimana.repositories.EdificioRepository;
import it.epicode.progettofinesettimana.services.EdificioService;
import it.epicode.progettofinesettimana.services.PostazioneService;
import it.epicode.progettofinesettimana.services.PrenotazioneService;
import it.epicode.progettofinesettimana.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    private UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {

        Edificio ed1 = new Edificio();
        ed1.setAdress("Via Trincea Dei Razzi, 8");
        ed1.setCity("Cagliari");
        ed1.setName("Palazzo parrocchetto");
        edificioService.saveBuilding(ed1);

        Postazione pos1 = new Postazione();
        pos1.setBuilding(ed1);
        pos1.setType(CategoriaPostazioneEnum.SALA_RIUNIONI);
        pos1.setMaxCapacity(50);
        pos1.setName("Sala conferenze");
        pos1.setDescription("Sala grandicella ma non troppo");
        postazioneService.saveStation(pos1);

        Utente user1 = new Utente();
        user1.setName("Elias");
        user1.setSurname("Pinna");
        user1.setUsername("E.P.");
        user1.setEmail("e.pinnw@mail.com");
        utenteService.saveUser(user1);

        Prenotazione booking1 = new Prenotazione();
        prenotazioneService.saveBooking(pos1.getId(),user1.getUsername(), LocalDate.now());
    }
}
