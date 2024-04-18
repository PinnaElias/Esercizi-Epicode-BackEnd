package it.epicode;

public class Dipendente {

    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {

    this.matricola = matricola;
    this.stipendio = stipendio;
    this.dipartimento = new Dipartimento(dipartimento.getSettore());

}

}
