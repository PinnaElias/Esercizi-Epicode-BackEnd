package org.example;

import java.sql.Array;

public class Riviste extends Stampato {
    public Riviste(String ISBN, String title, Long year, Long lenght) {
        super(ISBN, title, year, lenght);
    }

    String[] periodicity = {"SETTIMANALE", "MENSILE", "SEMESTRALE"};

    public String[] getPeriodicity() {
        return periodicity;
    }

    //fai il setter appropriato
}
