package it.epicode.progettofinesettimana.services;

import it.epicode.progettofinesettimana.entities.Prenotazione;
import it.epicode.progettofinesettimana.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository bookingRepo;

    public List<Prenotazione> getAllBookings(){
        return this.bookingRepo.findAll();
    }

    public Prenotazione getBookingById(UUID id){
        return this.bookingRepo.findById(id).orElse(null);
    }

    public Prenotazione saveBooking(Prenotazione prenotazione){
        return this.bookingRepo.save(prenotazione);
    }

    public void deleteBookingById(UUID id){
        this.bookingRepo.deleteById(id);
    }
}
