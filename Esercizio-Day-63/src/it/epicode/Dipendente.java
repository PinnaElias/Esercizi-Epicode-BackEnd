package it.epicode;

public abstract class Dipendente {

    protected String matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {

        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = new Dipartimento(dipartimento.getSettore());

    }


    abstract public double salary();
}
