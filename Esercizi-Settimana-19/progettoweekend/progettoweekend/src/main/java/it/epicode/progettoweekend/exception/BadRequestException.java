package it.epicode.progettoweekend.exception;

import lombok.Data;
import org.springframework.validation.ObjectError;

import java.util.List;

@Data
public class BadRequestException extends RuntimeException {
    private List<ObjectError> errorsList;

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(List<ObjectError> errorsList) {
        super("payload incorretto.");
        this.errorsList = errorsList;
    }
}
