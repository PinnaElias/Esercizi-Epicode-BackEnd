package it.epicode;

public class Main {

    public static void main(String[] args) {
        String[] settore = new String[3];
        settore[0] = "PRODUZIONE";
        settore[1] = "AMMINISTRAZIONE";
        settore[2] = "VENDITE";

        FullTime Gianni = new FullTime("0123", 2093.00, new Dipartimento(settore[1]) );
        Chief Marcella = new Chief("0069", 1025.00, new Dipartimento(settore[2]));
        PartTime Fabio = new PartTime("1010", 560.72, new Dipartimento(settore[0]));
        FullTime Andrea = new FullTime("1111", 1200, new Dipartimento(settore[2]));

        Dipendente[] servitu = {Gianni,Marcella,Fabio,Andrea};

        double totale = 0;

        for (int i = 0; i < servitu.length; i++ ) {
        totale += servitu[i].salary();
    }
        System.out.println(totale);
    }
}
