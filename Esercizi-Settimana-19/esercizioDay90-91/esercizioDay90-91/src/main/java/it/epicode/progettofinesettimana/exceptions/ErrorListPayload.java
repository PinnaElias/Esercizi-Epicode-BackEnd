package it.epicode.progettofinesettimana.exceptions;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

//ho provato a usare direttamente @Data, ma ottengo un errore
@Setter
@Getter
@ToString
public class ErrorListPayload extends ErrorsPayload{

    private List<String> errors;


    public ErrorListPayload(String message, LocalDateTime timestamp, List<String> errors) {
        super(message, timestamp);
        this.errors = errors;
    }

}
