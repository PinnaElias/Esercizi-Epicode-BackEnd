package it.epicode.progettofinesettimana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Prenotazione {

    @Id
    @GeneratedValue
    private UUID id;
    private Postazione location; //Location sarà poi collegata a edificio; one to one?
    private LocalDate date;
    private Utente guest;

}
