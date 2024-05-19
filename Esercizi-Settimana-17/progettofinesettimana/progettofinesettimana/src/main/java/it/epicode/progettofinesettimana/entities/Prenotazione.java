package it.epicode.progettofinesettimana.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Prenotazione {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private Postazione location;//Location sarà poi collegata a edificio; one to one?

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "utente_username")
    private Utente guest;

    private boolean isValid;
    private LocalDate prenotationDate;

}
