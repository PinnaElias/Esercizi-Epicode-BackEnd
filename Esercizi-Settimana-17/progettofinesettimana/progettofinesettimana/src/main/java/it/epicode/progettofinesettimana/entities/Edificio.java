package it.epicode.progettofinesettimana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Edificio {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany(mappedBy = "edificio")
    private List<Postazione> locations;

    private String name;
    private String adress;
    private String city;
}
