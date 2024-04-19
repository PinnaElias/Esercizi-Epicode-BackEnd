package it.epicode;

public class FullTime extends Dipendente{

    public FullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double salary() {
    return this.stipendio * 1.1;
    }
}
