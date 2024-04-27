package org.example;

abstract class Stampato {

    protected String ISBN;
    protected String title;
    protected int year;
    protected int length;

    public Stampato(String ISBN, String title, int year, int length) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.length = length;
    }

    public String getISBN() {
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

    public void setISBN(String ISBN) {
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

    @Override
    public String toString() {
        return
                "ISBN: " + ISBN +
                ", title: " + title +
                ", year: " + year +
                ", number of pages:" +
                " " + length ;
    }
}