package it.epicode.progettofinesettimana.repositories;

import it.epicode.progettofinesettimana.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
}
