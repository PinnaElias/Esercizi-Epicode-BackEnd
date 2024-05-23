package it.epicode.esercizioDay86.repositories;

import it.epicode.esercizioDay86.models.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, UUID> {
}
