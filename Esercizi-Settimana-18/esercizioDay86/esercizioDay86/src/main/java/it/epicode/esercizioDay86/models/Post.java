package it.epicode.esercizioDay86.models;

import lombok.Data;

        //questo è un POJO: Plain Old Java Object.
@Data   // Continene solo attributi, getters e setters
public class Post {

    private int id;
    private static int contatore; //in quanto statico non ha bisogno di essere inizializzato nel costruttore
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

            public Post(String categoria, String titolo, String cover, String contenuto, int tempoDiLettura) {

//              queste due righe tengono conto di quante volte viene chiamato il costruttore Post,
//              ergo di quanti blog vengono creati in generale. Assegnando id=contatore dopo la dichiarazione del
//              contatore, ogni id viene generato univocamente e in maniera incrementale
                Post.contatore++;
                this.id = contatore;

                this.categoria = categoria;
                this.titolo = titolo;
                this.cover = cover;
                this.contenuto = contenuto;
                this.tempoDiLettura = tempoDiLettura;
            }
        }
