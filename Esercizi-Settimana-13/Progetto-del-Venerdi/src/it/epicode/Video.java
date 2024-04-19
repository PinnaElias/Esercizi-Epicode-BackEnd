package it.epicode;

public class Video extends FileMultimediale implements playerEnabled {

    protected int volume;
    private int lunghezzaTraccia;
    protected int brightness;

    public Video (String titolo, int volume, int lunghezzaTraccia, int brightness) {

        super(titolo);
        this.volume = volume;
        this.lunghezzaTraccia = lunghezzaTraccia;
        this.brightness = brightness;
    }

    public int getLunghezzaTraccia() {
        return lunghezzaTraccia;
    }

    public void setLunghezzaTraccia(int lunghezzaTraccia) {
        this.lunghezzaTraccia = lunghezzaTraccia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolumeMinus(int incremento) {
        this.volume += incremento;
    }
    public void setVolumePlus(int decremento) {
        this.volume -= decremento;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightnessPlus(int incremento) {
        this.brightness += incremento;
    }
    public void setBrightnessMinus(int decremento) {
        this.brightness -= decremento;
    }




    @Override
    public void play() {
        if (this.volume>0) {
            for (int i = 0; i < this.lunghezzaTraccia; i++) {
                String newTitle = this.titolo;
                for (int j = 0; j < this.volume; j++) {
                    newTitle += " !";
                }

                for (int w = 0; w < this.lunghezzaTraccia; w++) {
                    newTitle += "*";
                }

                System.out.println(newTitle);
            }
        }
    }

    @Override
    public void esegui() {
        this.play();
    }
    /*
  public void setVolume(int volume) {
        this.volume = volume;
    }



     public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

   */

}
