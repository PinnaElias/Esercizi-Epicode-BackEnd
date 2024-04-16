//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        es1 primoEs = new es1();
        String PD = "by my guiding hand, perfected they stand";
        System.out.println(primoEs.stringaPD(PD));
        Random random = new Random();
        int Anno = random.nextInt(9999)+1;
        System.out.println(Anno);
        System.out.println(primoEs.annoBisestile(Anno));

        es234 restoCompito = new es234();
        int numero = random.nextInt(5)+1;
        System.out.println(restoCompito.stringifier(numero));
    }
}