package it.epicode.esercizioday84.repositories;


import it.epicode.esercizioday84.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, UUID> {

    public List<Drink> findByName(String name);

}
