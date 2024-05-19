package it.epicode.progettofinesettimana.repositories;

import it.epicode.progettofinesettimana.entities.Postazione;
import it.epicode.progettofinesettimana.entities.Prenotazione;
import it.epicode.progettofinesettimana.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
    List<Prenotazione> findByLocationAndDate(Postazione postazione, LocalDate data);
    List<Prenotazione> findByUserAndDate(Utente utente, LocalDate data);
}
