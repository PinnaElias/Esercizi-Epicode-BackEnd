package it.epicode.EsercizioDay80.bean;

import java.util.List;

public class Menu {

    private List<Ingrediente> ingredienti;
    private List<Bevanda> bevande;
    private List<Pizza> pizze;

    public void stampaMenu(){
        System.out.println("Menù: ");
        System.out.println("Bevande: ");
//        bevande.forEach(bevanda -> System.out.println(bevanda.getNome));
    }

}
