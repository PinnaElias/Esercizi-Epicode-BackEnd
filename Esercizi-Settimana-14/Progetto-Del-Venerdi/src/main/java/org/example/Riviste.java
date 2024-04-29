package org.example;

import java.util.Arrays;

public class Riviste extends Stampato {
    public Riviste(String ISBN, String title, int year, int length, String periodicity) {
        super(ISBN, title, year, length);
        setPeriodicity(periodicity);
    }

    protected String[] possiblePeriodicity = {"SETTIMANALE", "MENSILE", "SEMESTRALE"};
    protected String periodicity;

    public String[] getPossiblePeriodicity() {
        return possiblePeriodicity;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicityInput) {
        for (String prd : possiblePeriodicity) {
            if (prd.equalsIgnoreCase(periodicityInput)) {
                this.periodicity = periodicityInput;
                return;
            }
        }
        System.out.println("Invalid input");
    }


    @Override
    public String toString() {
        return "Rivista {" +
                "ISBN: " + ISBN + ", " + "Titolo: " + title + ", " + "Anno di uscita: " + year
                + ", " + "Lunghezza in pagine: " + length + ", " +
                "periodicità: " + periodicity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Riviste rivista = (Riviste) o;
        return ISBN.equals(rivista.ISBN);
    }
}
