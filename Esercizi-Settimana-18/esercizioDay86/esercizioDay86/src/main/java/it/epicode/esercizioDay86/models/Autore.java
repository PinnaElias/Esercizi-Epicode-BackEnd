package it.epicode.esercizioDay86.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Autore {

    private int id;
    private static int contatore;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, LocalDate dataNascita) {
        Autore.contatore++;
        this.id = contatore;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;

//      avatar sarà l'url di questa specifica entry
        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
    }
}
