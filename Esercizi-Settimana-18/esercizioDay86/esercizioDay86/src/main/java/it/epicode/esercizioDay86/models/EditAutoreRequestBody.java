package it.epicode.esercizioDay86.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Data
public class EditAutoreRequestBody {

    private String nome;

    private String cognome;

    @Email
    private String email;

    private LocalDate dataNascita;

    @URL
    private String avatar;
}
