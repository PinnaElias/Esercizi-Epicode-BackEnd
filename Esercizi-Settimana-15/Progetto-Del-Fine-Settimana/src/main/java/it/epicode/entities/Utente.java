package it.epicode.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "utente")
public class Utente {

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String surname;

    @Column(nullable = false)
    LocalDate date_of_birth;

    @Id
    @GeneratedValue
    UUID membership_id;

    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti;

    public Utente(String name, String surname, LocalDate date_of_birth, UUID membership_id) {
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.membership_id = membership_id;
    }

    public Utente() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public UUID getMembership_id() {
        return membership_id;
    }

    public void setMembership_id(UUID membership_id) {
        this.membership_id = membership_id;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", membership_id=" + membership_id +
                '}';
    }
}
