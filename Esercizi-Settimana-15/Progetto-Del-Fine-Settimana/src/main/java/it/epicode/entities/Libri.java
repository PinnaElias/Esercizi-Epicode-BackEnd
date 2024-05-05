package it.epicode.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.UUID;

@Entity
public class Libri extends Stampato {

    public Libri(UUID ISBN, String title, int year, int length, String author, Generi genre) {
        super(ISBN, title, year, length);
        this.author = author;
        this.genre = genre;
    }

    public Libri(){
        super();
    }

    @Column(nullable = false)
    protected String author;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    protected Generi genre;

    public String getAuthor() {
        return author;
    }

    public Generi getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Generi genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "author='" + author + '\'' +
                ", genre=" + genre +
                ", ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libri libro = (Libri) o;
        return ISBN.equals(libro.ISBN);
    }
}
