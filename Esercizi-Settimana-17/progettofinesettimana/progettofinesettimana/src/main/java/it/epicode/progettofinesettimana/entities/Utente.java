package it.epicode.progettofinesettimana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Utente {

    @Id
    private String username;

    private String name;
    private String surname;
    private String email;

    @OneToMany(mappedBy = "utente")
    private List <Prenotazione> reservations;
}
