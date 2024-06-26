package it.epicode.esercizioday83.repositories;


import it.epicode.esercizioday83.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, UUID> {

    public List<Drink> findByName(String name);

}
