package it.epicode.progettofinesettimana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Edificio {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String adress;
    private String city;
}
