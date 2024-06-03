package it.epicode.progettoweekend.DAO;

import it.epicode.progettoweekend.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventsDAO extends JpaRepository<Events, UUID> {
}