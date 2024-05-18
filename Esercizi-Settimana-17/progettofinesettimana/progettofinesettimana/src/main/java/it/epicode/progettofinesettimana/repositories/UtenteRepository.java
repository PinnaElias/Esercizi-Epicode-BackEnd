package it.epicode.progettofinesettimana.repositories;

import it.epicode.progettofinesettimana.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
    Optional<Utente> findByUsername(String username);
    public void deleteUserByUsername(String username);
}
