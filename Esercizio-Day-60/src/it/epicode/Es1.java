package it.epicode;

public class Es1 {

    public int moltiplicazione(int num1,int num2) {

        return num1 * num2;

    }

    public String concat(String frase, int numero) {

        return frase + numero;

    }

    public String[] arrayModifier(String[] parole, String nuovo) {
        String[] newArray = new String[6];
        newArray[0] = parole[0];
        newArray[1] = parole[1];
        newArray[2] = nuovo;
        newArray[3] = parole[2];
        newArray[4] = parole[3];
        newArray[5] = parole[4];
        return newArray;
    }
}