package it.epicode.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Location {
    private String id;
    private String nome;
    private String città;

    public Location(String id, String nome, String città) {
        this.id = id;
        this.nome = nome;
        this.città = città;
    }

    public  Location() {}

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCittà() {
        return città;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCittà(String città) {
        this.città = città;
    }
}
