package it.epicode.progettofinesettimana.repositories;

import it.epicode.progettofinesettimana.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
}
