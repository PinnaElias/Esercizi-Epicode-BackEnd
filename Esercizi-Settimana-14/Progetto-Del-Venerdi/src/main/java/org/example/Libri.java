package org.example;

public class Libri extends Stampato {

    public Libri(String ISBN, String title, int year, int length, String author, String genre) {
        super(ISBN, title, year, length);
        setAuthor(author);
        setGenre(genre);
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

    @Override
    public String toString() {
        return "Libro {" +
                "ISBN: " + ISBN + ", " + "Titolo: " + title + ", " + "Anno di uscita: " + year
                + ", " + "Lunghezza in pagine: " + length + ", " +
                "Autore: " + author+ ", " + "Genere: "+ genre +
                '}';
    }
}
