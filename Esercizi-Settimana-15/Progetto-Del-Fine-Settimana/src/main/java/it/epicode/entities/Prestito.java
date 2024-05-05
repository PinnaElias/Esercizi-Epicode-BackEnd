package it.epicode.entities;

import java.time.LocalDate;

public class Prestito {

private Utente utente;
private ElementoPrestito elementoPrestito;
private LocalDate dataInizioPrestito;
private LocalDate dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
private LocalDate dataRestituzioneEffettiva;


}
