package it.epicode.esercizioDay86.models;

import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Data
public class CreatePostRequestBody {
//  questo NON è il post ma il modello da rispettare per poter creare il post.
//  per questo non necessita di un costruttore personalizzato o di un id specifico,
//  è il corrispettivo di un interfaccia di typeScript

    @NonNull
    private String categoria;

    @NonNull
    private String titolo;

    @NonNull
    private String cover;

    @NonNull
    private String contenuto;

    @NonNull
    private int tempoDiLettura;

}
