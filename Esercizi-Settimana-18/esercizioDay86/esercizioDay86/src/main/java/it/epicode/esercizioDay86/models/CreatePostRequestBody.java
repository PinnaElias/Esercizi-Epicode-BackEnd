package it.epicode.esercizioDay86.models;

import lombok.Data;

@Data
public class CreatePostRequestBody {
//  questo NON è il post ma il modello da rispettare per poter creare il post.
//  per questo non necessita di un costruttore personalizzato o di un id specifico,
//  è il corrispettivo di un interfaccia di typeScript
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

}
