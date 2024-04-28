package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Riviste uno = new Riviste("8898050933", "Rolling Stone Italia", 2024, 272, "MENSILE");
        Libri due = new Libri("6698057933", "Dawn of The Golden Witch", 2009, 350,
                "Tohya Hachijo", "Mistery");
        Riviste tre = new Riviste("1111111111", "Shonen Jump", 2024, 100, "SETTIMANALE");
        Libri quattro = new Libri("6698057935", "Banquet of The Golden Witch", 2008, 300,
                "Tohya Hachijo", "Mistery");
        Riviste cinque = new Riviste("8894450913", "Vogue Italia", 2021, 200, "MENSILE");
        Riviste sei = new Riviste("8994420913", "La Rassegna Della Letteratura Italiana", 2019, 300, "SEMESTRALE");



        HashSet<Stampato> set = new HashSet<>();
        set.add(uno);
        set.add(due);
        set.add(tre);
        set.add(quattro);
        set.add(cinque);
        set.add(sei);



        addToCatalogue(set);
        System.out.println(set);
    }


    public static void addToCatalogue(HashSet<Stampato> set) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi aggiungere un libro o una rivista? (scrivi 'libro' o 'rivista'): ");
        String scelta = scanner.nextLine().toLowerCase();

        if ("libro".equals(scelta)) {

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
        } else if ("rivista".equals(scelta)) {
            System.out.println("Inserisci l'ISBN della rivista:");
            String isbn = scanner.nextLine();
            System.out.println("Inserisci il titolo della rivista:");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci l'anno di pubblicazione della rivista:");
            int anno = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere newline dopo nextInt
            System.out.println("Inserisci la lunghezza della rivista:");
            int lunghezza = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere newline dopo nextInt
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



