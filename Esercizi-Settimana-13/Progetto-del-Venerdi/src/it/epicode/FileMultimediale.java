package it.epicode;

abstract class FileMultimediale {

    protected String titolo;

    public FileMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public void setFileMultimediale (String titolo) {
    this.titolo = titolo;
    }

    public String getFileMultimediale (String titolo) {
    return this.titolo;
    }

    abstract public void esegui();
}
