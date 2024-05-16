package it.epicode.esercizioday84.repositories;

import it.epicode.esercizioday84.entities.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, UUID> {
}
