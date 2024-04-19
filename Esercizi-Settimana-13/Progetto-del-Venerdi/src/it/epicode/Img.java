package it.epicode;

public class Img extends FileMultimediale{

    protected int brightness;

    public Img(String titolo, int brightness) {
        super(titolo);
        this.brightness = brightness;
    }

    public int getBrightness () {
        return brightness;
    }

    public void setBrightnessPlus(int incremento) {
        this.brightness += incremento;
    }
    public void setBrightnessMinus(int decremento) {
        this.brightness -= decremento;
    }

    public void show () {
        String currentTitle = this.titolo;
        for (int i = 0; i < brightness; i++) {
            currentTitle += "*";
        }
        System.out.println(currentTitle);
    }

    @Override
    public void esegui() {
        this.show();
    }
}
