package it.epicode.progettofinesettimana.DAO;

import it.epicode.progettofinesettimana.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface DipendenteDAO extends JpaRepository<Dipendente, UUID> {
    Optional<Dipendente> findByEmail(String email);
}
