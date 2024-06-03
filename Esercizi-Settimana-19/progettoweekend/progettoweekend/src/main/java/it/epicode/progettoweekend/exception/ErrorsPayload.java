package it.epicode.progettoweekend.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorsPayload {
    private String message;
    private LocalDateTime timestamp;

    public ErrorsPayload(String message, LocalDateTime timestamp) {
    }
}
