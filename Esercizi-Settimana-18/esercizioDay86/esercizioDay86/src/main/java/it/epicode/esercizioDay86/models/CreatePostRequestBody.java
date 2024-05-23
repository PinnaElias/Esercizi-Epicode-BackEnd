package it.epicode.esercizioDay86.models;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.UUID;

@Data
public class CreatePostRequestBody {
//  questo NON è il post ma il modello da rispettare per poter creare il post.
//  per questo non necessita di un costruttore personalizzato o di un id specifico,
//  è il corrispettivo di un interfaccia di typeScript

    @NotEmpty
    private String categoria;

    @NotEmpty
    @Size(min = 1, max = 50)
    private String titolo;

//    @NotBlank
//    @URL //controlla che qui ci sia un url valido
//    private String cover;

    @NotEmpty
    private String contenuto;

    @NotEmpty
    @Min(1) //@min e @max si usano per gli integer/long al posto di @Size
    @Max(60)
    private int tempoDiLettura;

    @NotEmpty
    private UUID autoreId;

}
