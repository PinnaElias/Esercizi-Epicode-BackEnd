package it.epicode.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity //@ = annotations
@Table(name = "eventi")
public class Evento {

    @Id
    @GeneratedValue
    @TableGenerator(name = "eventi_id_table", initialValue = 0, allocationSize = 1)
    private int id; //dovrebbe generare id incrementali


    private String title;
    private LocalDate eventDate;
    private String description;

    @Column(name = "tipo_evento") //mantieni lo snake case
    @Enumerated(EnumType.STRING) //fa capire al db che deve trattare tipoevento come una stringa
    private TipoEvento tipoEvento;

    private int maxNumberOfPartecipants;

    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> partecipazioni;
    private Location location;

    public Evento(int id, String title, LocalDate eventDate, String description, TipoEvento tipoEvento, int maxNumberOfPartecipants, List<Partecipazione> partecipazioni, Location location) {
        this.id = id;
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.tipoEvento = tipoEvento;
        this.maxNumberOfPartecipants = maxNumberOfPartecipants;
        this.partecipazioni = partecipazioni;
        this.location = location;
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
