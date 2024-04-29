package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws invalidNumber, stringLength, InvalidPeriodicity {

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

        Scanner isbnScan = new Scanner(System.in);
        String searchCode = isbnScan.nextLine().trim();

        Stampato risultato = set.stream()
                .filter(e -> e.getISBN().equals(searchCode) && searchCode.length() == 10)
                .findAny().orElse(null);

        if (risultato != null) {
            System.out.println("Elemento trovato: " + risultato);
        } else {
            System.out.println("Nessun elemento trovato.");
        }

    }


    public static void addToCatalogue(HashSet<Stampato> set) throws invalidNumber, stringLength, InvalidPeriodicity {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi aggiungere un libro o una rivista? (scrivi 'libro' o 'rivista'): ");
        String scelta = scanner.nextLine().toLowerCase();

        if ("libro".equals(scelta)) {
            System.out.println("Inserisci l'ISBN del libro:");
            String isbn = scanner.nextLine();
            checkStringLength(isbn);

            System.out.println("Inserisci il titolo del libro:");
            String titolo = scanner.nextLine();

            System.out.println("Inserisci l'anno di pubblicazione del libro:");
            int anno = validateInput(scanner);

            System.out.println("Inserisci la lunghezza del libro:");
            int lunghezza = validateInput(scanner);

            System.out.println("Inserisci l'autore del libro:");
            String autore = scanner.nextLine();

            System.out.println("Inserisci il genere del libro:");
            String genere = scanner.nextLine();

            Libri libro = new Libri(isbn, titolo, anno, lunghezza, autore, genere);
            set.add(libro);

        } else if ("rivista".equals(scelta)) {
            System.out.println("Inserisci l'ISBN della rivista:");
            String isbn = scanner.nextLine();
            checkStringLength(isbn);

            System.out.println("Inserisci il titolo della rivista:");
            String titolo = scanner.nextLine();

            System.out.println("Inserisci l'anno di pubblicazione della rivista:");
            int anno = validateInput(scanner);

            System.out.println("Inserisci la lunghezza della rivista:");
            int lunghezza = validateInput(scanner);

            System.out.println("Inserisci la periodicità della rivista (SETTIMANALE, MENSILE o SEMESTRALE):");
            String periodicità = scanner.nextLine();
            if (!periodicità.equals("SETTIMANALE") && !periodicità.equals("MENSILE") && !periodicità.equals("SEMESTRALE")) {
                throw new InvalidPeriodicity("Periodicità non esistente.");
            }

            Riviste rivista = new Riviste(isbn, titolo, anno, lunghezza, periodicità);
            set.add(rivista);
        } else {
            System.out.println("Qualcosa è andato storto.");
        }
        System.out.println(set);
        scanner.close();
    }

    public static int validateInput(Scanner scanner) throws invalidNumber {
        if (!scanner.hasNextInt()) {
            throw new invalidNumber("Non hai inserito un numero!.");
        }
        return scanner.nextInt();
    }

    public static void checkStringLength(String str) throws stringLength {
        if (str.length() != 10) {
            throw new stringLength("ISBN non valido");
        }
    }

    public static void remove(HashSet<Stampato> set, String isbn) {
        set.removeIf(stampato -> stampato.getISBN().equals(isbn));
        System.out.println("Elemento con ISBN " + isbn + " rimosso con successo.");
    }

    public static void searchByYear(HashSet<Stampato> set, int year) {
        boolean found = false;
        for (Stampato stampato : set) {
            if (stampato.getYear() == year) {
                System.out.println("Elemento trovato: " + stampato);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nessun elemento trovato per l'anno " + year);
        }
    }

    public static void searchByAuthor(HashSet<Stampato> set, String author) {
        boolean found = false;
        for (Stampato stampato : set) {
            if (stampato instanceof Libri libro) {
                if (libro.getAuthor().equals(author)) {
                    System.out.println("Elemento trovato: " + libro);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Nessun libro trovato per l'autore " + author);
        }
    }

    public static void saveLibrary(HashSet<Stampato> set, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            set.forEach(stampato -> {
                try {
                    writer.write(stampato.toString());
                    writer.newLine();
                } catch (IOException e) {
                    System.err.println("Errore durante la scrittura del file: " + e.getMessage());
                }
            });
            System.out.println("Archivio scritto su file con successo.");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
}


