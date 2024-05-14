package it.epicode.EsercizioDay80.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Bevanda extends MenuVoice{

    private String nome;
    private int gradoAlcolico;

}
