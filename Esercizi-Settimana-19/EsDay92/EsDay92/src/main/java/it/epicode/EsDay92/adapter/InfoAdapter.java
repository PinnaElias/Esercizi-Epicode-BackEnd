package it.epicode.EsDay92.adapter;

import java.util.Date;
import java.util.Locale;

//classe che implementa il target e traduce le chiamate a info
public class InfoAdapter implements DataSource{

    private Info info; //chiama la classe da tradurre

    public InfoAdapter(Info info){
        this.info = info;
    }

    @Override //si va a prendere i metodi di DataSource e li adatta, appunto
    public String getNomeCompleto(){
        return info.getNome() + " " + info.getCognome(); //e ora ho il nome completo
    }

    //come prima
    public int getEta(){
        Date date = new Date();
        long ageInMillis = date.getTime() - info.getDataDiNascita().getTime();
        int ageInYears = (int) (ageInMillis / 1000 / 60 / 60 / 24 / 365.25);
        return ageInYears;
    }
}
