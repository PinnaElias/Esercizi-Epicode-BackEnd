package it.epicode.entities;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public abstract class Stampato {

    @Id
    @Column(nullable = false, unique = true)
    protected UUID ISBN;

    @Column(nullable = false)
    protected String title;

    @Column(nullable = false)
    protected int year;

    @Column(nullable = false)
    protected int length;

    @OneToMany(mappedBy = "stampato")
    protected List<Prestito> prestiti;

    public Stampato(UUID ISBN, String title, int year, int length) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.length = length;
    }

    public Stampato() {

    }

    public UUID getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public void setISBN(UUID ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

}