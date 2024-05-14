package it.epicode.EsercizioDay80.bean;

import lombok.Data;

import java.util.List;

@Data
public class Pizza extends MenuVoice{
    private String nome;
    private List<Ingrediente> ingredienti;
}
