package it.epicode.esercizioDay86.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "autori")
public class Autore {

    @Id
    @GeneratedValue
    private UUID id;
//    private static int contatore;

    private String nome;
    private String cognome;
    private String email;

    @Column(name = "data_nascita")
    private LocalDate dataNascita;
    private String avatar;

    @OneToMany(mappedBy = "autore")
    private List<Post> posts;

    @Override
    public String toString() {
        return "Autore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascita=" + dataNascita +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    //    public Autore(String nome, String cognome, String email, LocalDate dataNascita) {
//        Autore.contatore++;
//        this.id = contatore;
//        this.nome = nome;
//        this.cognome = cognome;
//        this.email = email;
//        this.dataNascita = dataNascita;
//
////      avatar sarà l'url di questa specifica entry
//        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
//    }
}
