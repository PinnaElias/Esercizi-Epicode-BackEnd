package it.epicode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] settore = new String[3];
        settore[0] = "PRODUZIONE";
        settore[1] = "AMMINISTRAZIONE";
        settore[2] = "VENDITE";

        Dipendente Gianni = new Dipendente("0123", 2093.00, new Dipartimento(settore[1]) );
        Dipendente Marcella = new Dipendente("0069", 1025.00, new Dipartimento(settore[2]));
        Dipendente Fabio = new Dipendente("1010", 560.50, new Dipartimento(settore[0]));
    }

}
