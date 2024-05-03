package it.epicode.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private Sesso sesso;
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazioni;

    public Persona (UUID Id, String nome, String cognome, String email, LocalDate dataDiNascita, Sesso sesso) {
        this.id = Id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
    }

    public Persona(){}

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", sesso=" + sesso +
                ", listaPartecipazioni=" + listaPartecipazioni +
                '}';
    }
}
