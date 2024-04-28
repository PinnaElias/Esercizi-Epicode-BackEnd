package org.example;

import java.util.HashSet;
import java.util.Scanner;

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


    public static void addToCatalogue(HashSet<Stampato> set) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi aggiungere un libro o una rivista? ");
        String scelta = scanner.nextLine();

        if (scelta.equals("libro")) {
            System.out.println("Inserisci l'ISBN del libro:");
            String isbn = scanner.nextLine();
            System.out.println("Inserisci il titolo del libro:");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci l'anno di pubblicazione del libro:");
            int anno = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere newline dopo nextInt
            System.out.println("Inserisci la lunghezza del libro:");
            int lunghezza = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere newline dopo nextInt
            System.out.println("Inserisci l'autore del libro:");
            String autore = scanner.nextLine();
            System.out.println("Inserisci il genere del libro:");
            String genere = scanner.nextLine();

            Libri libro = new Libri(isbn, titolo, anno, lunghezza, autore, genere);
            set.add(libro);
        } else if (scelta.equals("rivista")) {
            System.out.println("Inserisci l'ISBN della rivista: ");
            String isbn = scanner.nextLine();
            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci l'anno di pubblicazione: ");
            int anno = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci la lunghezza: ");
            int lunghezza = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci la periodicità della rivista (SETTIMANALE, MENSILE o SEMESTRALE):");
            String periodicità = scanner.nextLine();

            Riviste rivista = new Riviste(isbn, titolo, anno, lunghezza, periodicità);
            set.add(rivista);
        } else {
            System.out.println("Scelta non valida.");
        }

        scanner.close();
    }

}