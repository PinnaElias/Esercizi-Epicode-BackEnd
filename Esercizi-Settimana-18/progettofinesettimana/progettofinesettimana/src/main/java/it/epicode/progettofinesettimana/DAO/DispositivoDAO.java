package it.epicode.progettofinesettimana.DAO;

import it.epicode.progettofinesettimana.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DispositivoDAO extends JpaRepository<Dispositivo, UUID> {
}
