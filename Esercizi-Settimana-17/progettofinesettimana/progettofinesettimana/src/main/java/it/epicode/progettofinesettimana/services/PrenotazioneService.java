package it.epicode.progettofinesettimana.services;

import it.epicode.progettofinesettimana.entities.Postazione;
import it.epicode.progettofinesettimana.entities.Prenotazione;
import it.epicode.progettofinesettimana.entities.Utente;
import it.epicode.progettofinesettimana.repositories.PostazioneRepository;
import it.epicode.progettofinesettimana.repositories.PrenotazioneRepository;
import it.epicode.progettofinesettimana.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository bookingRepo;

    @Autowired
    private UtenteRepository userRepo;

    @Autowired
    private PostazioneRepository locationRepo;


    public List<Prenotazione> getAllBookings(){
        return this.bookingRepo.findAll();
    }

    public Prenotazione getBookingById(UUID id){
        return this.bookingRepo.findById(id).orElse(null);
    }

    public Prenotazione saveBooking(UUID locationId, String userUserName, LocalDate date){

            Utente utente = userRepo.findById(String.valueOf(userUserName)).orElseThrow(() -> new RuntimeException("Utente non trovato"));

            Postazione postazione = locationRepo.findById(locationId).orElseThrow(() -> new RuntimeException("Postazione non trovata"));

            if (!bookingRepo.findByLocationAndDate(postazione, date).isEmpty()) {
                throw new RuntimeException("La postazione è già prenotata per questa data");
            }

            if (!bookingRepo.findByUserAndDate(utente, date).isEmpty()) {
                throw new RuntimeException("Hai già una prenotazione per questa data!");
            }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setGuest(utente);
        prenotazione.setLocation(postazione);
        prenotazione.setDate(date);
        return bookingRepo.save(prenotazione);
    }

    public void deleteBookingById(UUID id){
        this.bookingRepo.deleteById(id);
    }
}
