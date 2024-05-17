package it.epicode.progettofinesettimana.entities;

import it.epicode.progettofinesettimana.enums.CategoriaPostazioneEnum;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public class Edificio {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String description;
    private CategoriaPostazioneEnum type;
    private int maxCapacity;
    private Postazione location;
}
