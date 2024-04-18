package it.epicode;

public class Dipartimento {

    private String settore;

    public Dipartimento(String settore) {
        if ((!settore.equals("PRODUZIONE")) && (!settore.equals("AMMINISTRAZIONE")) && (!settore.equals("VENDITE"))) {
            throw new IllegalArgumentException("Nome non valido.");
        }
        this.settore = settore;
    }

    public void setSettore (String settore) {
        if ((!settore.equals("PRODUZIONE")) && (!settore.equals("AMMINISTRAZIONE")) && (!settore.equals("VENDITE"))) {
            throw new IllegalArgumentException("Nome non valido.");
        }
        this.settore = settore;
    }

    public String getSettore () {
        return this.settore;
    }

    }
