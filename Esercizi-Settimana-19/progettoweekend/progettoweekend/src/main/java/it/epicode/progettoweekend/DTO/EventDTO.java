package it.epicode.progettoweekend.DTO;

public record EventDTO(
        String title,
        String description,
        String date,
        String place,
        int maxPosti
) {
}
