package it.epicode.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

public abstract class Stampato {

    @Id
    @GeneratedValue
    protected UUID ISBN;

    protected String title;
    protected int year;
    protected int length;

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