package org.example;

abstract class Stampato {

    protected String ISBN;
    protected String title;
    protected Long year;
    protected Long lenght;

    public Stampato(String ISBN, String title, Long year, Long lenght) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.lenght = lenght;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public Long getYear() {
        return year;
    }

    public Long getLenght() {
        return lenght;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setLenght(Long lenght) {
        this.lenght = lenght;
    }
}