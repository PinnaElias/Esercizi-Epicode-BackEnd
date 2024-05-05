package it.epicode.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Prestito {

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @Column(nullable = false)
    private ElementoPrestito elementoPrestito;

    @ManyToOne
    @JoinColumn(name = "stampato_id", nullable = false)
    private Stampato stampato;

    @Column(nullable = false)
    private LocalDate dataInizioPrestito;


    @Column(nullable = false)
    private LocalDate dataRestituzioneEffettiva;

    public Prestito(Utente utente, ElementoPrestito elementoPrestito, Stampato stampato,
                    LocalDate dataInizioPrestito, LocalDate dataRestituzioneEffettiva, LocalDate dataRestituzionePrevista) {
        this.utente = utente;
        this.elementoPrestito = elementoPrestito;
        this.stampato = stampato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    @Column(nullable = false)
    private LocalDate dataRestituzionePrevista = dataInizioPrestito.plusDays(30);

    public Prestito() {
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public ElementoPrestito getElementoPrestito() {
        return elementoPrestito;
    }

    public void setElementoPrestito(ElementoPrestito elementoPrestito) {
        this.elementoPrestito = elementoPrestito;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public Stampato getStampato() {
        return stampato;
    }

    public void setStampato(Stampato stampato) {
        this.stampato = stampato;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", elementoPrestito=" + elementoPrestito +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva +
                '}';
    }
}
