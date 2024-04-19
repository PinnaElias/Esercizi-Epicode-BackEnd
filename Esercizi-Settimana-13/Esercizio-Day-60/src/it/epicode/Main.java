package it.epicode;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Es1 primaIstanza = new Es1();
        int pippo = 15, pluto = 200;
        System.out.println(primaIstanza.moltiplicazione(pippo,pluto));
        String ciccio = "blaze it ";
        int ciaccio = 420;
        System.out.println(primaIstanza.concat(ciccio,ciaccio));
        String[] parole = {"ARR", "HW", "SB", "SHB", "EW"};
        String nuovo = "DWT";
        System.out.println(Arrays.toString(primaIstanza.arrayModifier(parole, nuovo)));
    }
}