package it.epicode.progettofinesettimana.exceptions;

import lombok.Data;

import java.util.UUID;

@Data
public class NotFoundException extends RuntimeException{
    public NotFoundException(UUID id){
        super("l'id "+ id + " non è stato trovato");
    }
}