package it.epicode.entities;

import javax.swing.plaf.PanelUI;
import java.util.UUID;

public class Riviste extends Stampato {
    public Riviste(UUID ISBN, String title, int year, int length, Periodicità periodicity) {
        super(ISBN, title, year, length);
        setPeriodicity(periodicity);
    }

    public Riviste() {
    }

    protected Periodicità periodicity;

    public Periodicità getPeriodicity() {
        return periodicity;
    }


    public void setPeriodicity(Periodicità periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicity=" + periodicity +
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
        Riviste rivista = (Riviste) o;
        return ISBN.equals(rivista.ISBN);
    }
}
