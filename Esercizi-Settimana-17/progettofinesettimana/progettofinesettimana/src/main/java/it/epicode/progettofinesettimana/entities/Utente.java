package it.epicode.progettofinesettimana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Utente {

    @Id
    private String username;

    private String name;
    private String surname;
    private String email;
    private Prenotazione reservation;
}
