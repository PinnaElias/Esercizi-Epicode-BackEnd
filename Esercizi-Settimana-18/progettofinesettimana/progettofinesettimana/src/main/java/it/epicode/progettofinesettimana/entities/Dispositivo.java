package it.epicode.progettofinesettimana.entities;

import it.epicode.progettofinesettimana.enums.TipoDispositivo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tipo;
    @Enumerated(EnumType.STRING)
    private TipoDispositivo tipoDispositivo;

    public Dispositivo(String tipo, TipoDispositivo tipoDispositivo) {
        this.tipo = tipo;
        this.tipoDispositivo = tipoDispositivo;
    }

}