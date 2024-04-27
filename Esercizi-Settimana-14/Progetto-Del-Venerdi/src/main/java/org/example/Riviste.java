package org.example;

public class Riviste extends Stampato {
    public Riviste(String ISBN, String title, int year, int length, String periodicity) {
        super(ISBN, title, year, length);
    }

    protected String[] possiblePeriodicity = {"SETTIMANALE", "MENSILE", "SEMESTRALE"};
    protected String periodicity;

    public String[] getPossiblePeriodicity() {
        return possiblePeriodicity;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPossiblePeriodicity(String Periodicity) {
        for (String prd : possiblePeriodicity){
            if (prd.equals(Periodicity)) {
                this.periodicity = Periodicity;
                return;
            }  else {
                System.out.println("Invalid input");
            }
        }
    }
}
