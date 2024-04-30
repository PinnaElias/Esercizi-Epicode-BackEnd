package it.epicode.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity //@ = annotations
@Table(name = "eventi")
public class Evento {

    @Id
    @GeneratedValue
    private int id; //dovrebbe generare id incrementali, il c

    private String title;
    private LocalDate eventDate;
    private String description;

    @Column(name = "tipo_evento") //mantieni lo snake case
    @Enumerated(EnumType.STRING) //fa capire al db che deve trattare tipoevento come una stringa
    private TipoEvento tipoEvento;

    private int maxNumberOfPartecipants;


    public Evento(int id, String title, LocalDate eventDate, String description,
                  TipoEvento tipoEvento, int maxNumberOfPartecipants) {
        this.id = id;
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.tipoEvento = tipoEvento;
        this.maxNumberOfPartecipants = maxNumberOfPartecipants;
    }

    public Evento() {
        //costruttore da tenere vuoto
    }

    public int getid() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getDescription() {
        return description;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public int getMaxNumberOfPartecipants() {
        return maxNumberOfPartecipants;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setMaxNumberOfPartecipants(int maxNumberOfPartecipants) {
        this.maxNumberOfPartecipants = maxNumberOfPartecipants;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", title='" + title + '\'' + ", eventDate=" + eventDate + ", description='" + description + '\'' + ", tipoEvento=" + tipoEvento + ", maxNumberOfPartecipants=" + maxNumberOfPartecipants + '}';
    }

}
