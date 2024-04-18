package it.epicode;

public class Chief extends Dipendente {
    public Chief(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double salary() {
        return this.stipendio * 2.1;
    }

}
