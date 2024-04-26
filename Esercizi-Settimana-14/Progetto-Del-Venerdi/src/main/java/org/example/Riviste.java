package org.example;

import java.sql.Array;

public class Riviste extends Stampato {
    public Riviste(String ISBN, String title, Long year, Long lenght, String selectedPeriodicity) {
        super(ISBN, title, year, lenght);
    }

    protected String[] periodicity = {"SETTIMANALE", "MENSILE", "SEMESTRALE"};
    protected String selectedPeriodicity;

    public String[] getPeriodicity() {
        return periodicity;
    }

    public String getSelectedPeriodicity() {
        return selectedPeriodicity;
    }

    //fai il setter appropriato

    public void setPeriodicity(String Periodicity) {
        for (String prd : periodicity){
            if (prd.equals(Periodicity)) {
                this.selectedPeriodicity = Periodicity;
                return;
            }  else {
                System.out.println("Invalid input");
            }
        }
    }
}
