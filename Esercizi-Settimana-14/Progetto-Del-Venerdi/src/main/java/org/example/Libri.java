package org.example;

public class Libri extends Stampato {

    public Libri(String ISBN, String title, int year, int length) {
        super(ISBN, title, year, length);
    }

    protected String author;
    protected String genre;

    public String getAuthor(){
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
