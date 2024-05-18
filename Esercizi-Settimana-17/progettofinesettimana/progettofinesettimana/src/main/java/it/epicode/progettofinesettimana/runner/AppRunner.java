package it.epicode.progettofinesettimana.runner;

import it.epicode.progettofinesettimana.entities.Edificio;
import it.epicode.progettofinesettimana.entities.Postazione;
import it.epicode.progettofinesettimana.enums.CategoriaPostazioneEnum;
import it.epicode.progettofinesettimana.repositories.EdificioRepository;
import it.epicode.progettofinesettimana.services.EdificioService;
import it.epicode.progettofinesettimana.services.PostazioneService;
import it.epicode.progettofinesettimana.services.PrenotazioneService;
import it.epicode.progettofinesettimana.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
    }
}
