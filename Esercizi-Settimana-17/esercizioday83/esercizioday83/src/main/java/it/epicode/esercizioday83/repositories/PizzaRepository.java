package it.epicode.esercizioday83.repositories;

import it.epicode.esercizioday83.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, UUID> {
}
