package it.epicode.entities;

import javax.persistence.*;
import java.util.UUID;

public class Partecipazione {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id") //viene generata una colonna di nome "persona_id"
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id", referencedColumnName = "id")
    private Evento evento;
    private StatoPartecipazione statoPartecipazione;

    public Partecipazione(UUID id, Persona persona, Evento evento, StatoPartecipazione statoPartecipazione){
        this.id = id;
        this.persona = persona;
        this.evento = evento;
        this.statoPartecipazione = statoPartecipazione;
    }

    public Partecipazione(){}

    public UUID getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public StatoPartecipazione getStatoPartecipazione() {
        return statoPartecipazione;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setStatoPartecipazione(StatoPartecipazione statoPartecipazione) {
        this.statoPartecipazione = statoPartecipazione;
    }
}
