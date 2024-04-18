package it.epicode;

public class PartTime extends Dipendente{

    public PartTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double salary() {
        return this.stipendio * 0.4;
    }

}
