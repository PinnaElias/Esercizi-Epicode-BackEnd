package it.epicode;

public class Audio extends FileMultimediale implements playerEnabled {

    protected int volume;
    private int lunghezzaTraccia;

    public Audio (String titolo, int volume, int lunghezzaTraccia) {

        super(titolo);
        this.volume = volume;
        this.lunghezzaTraccia = lunghezzaTraccia;

    }

    public int getVolume() {
        return volume;
    }

    public int getLunghezzaTraccia() {
        return lunghezzaTraccia;
    }

    public void setLunghezzaTraccia(int lunghezzaTraccia) {
        this.lunghezzaTraccia = lunghezzaTraccia;
    }

    public void setVolumeMinus(int incremento) {
        this.volume += incremento;
    }
    public void setVolumePlus(int decremento) {
        this.volume -= decremento;
    }

    @Override
    public void play() {

        if (this.volume>0) {
            for (int i = 0; i < this.lunghezzaTraccia; i++) {
                String newTitle = this.titolo;
                for (int j = 0; j < this.volume; j++) {
                    newTitle += " !";
                }
                System.out.println(newTitle);
            }
        }

    }
    @Override
    public void esegui() {
        this.play();
    }

}
