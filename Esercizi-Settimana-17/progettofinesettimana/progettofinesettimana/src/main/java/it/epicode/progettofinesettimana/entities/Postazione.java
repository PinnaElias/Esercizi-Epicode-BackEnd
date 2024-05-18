package it.epicode.progettofinesettimana.entities;

import it.epicode.progettofinesettimana.enums.CategoriaPostazioneEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Postazione {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String description;
    private CategoriaPostazioneEnum type;
    private int maxCapacity;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio building;
}
