package it.epicode.progettofinesettimana.entities;

import it.epicode.progettofinesettimana.enums.TipoDispositivo;
import jakarta.persistence.*;
import lombok.*;

import java.util.Random;
import java.util.UUID;

@Entity
@Data
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String tipo;

    @Enumerated(EnumType.STRING)
    private TipoDispositivo tipoDispositivo;

    public Dispositivo(String tipo, TipoDispositivo tipoDispositivo) {
        this.tipo = tipo;
        this.tipoDispositivo = tipoDispositivo;
    }

}