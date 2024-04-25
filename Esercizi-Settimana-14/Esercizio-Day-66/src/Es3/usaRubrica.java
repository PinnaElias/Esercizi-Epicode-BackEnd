package Es3;

import java.util.Scanner;

public class usaRubrica extends rubrica {
    public static void main(String[] args) {

        rubrica Rubrica = new rubrica();
        Rubrica.inserisciContatto("Carlo", "000 111 2222");
        Rubrica.inserisciContatto("Marco", "234 999 2222");
        Rubrica.inserisciContatto("Giulia", "234 999 1122");
        Rubrica.inserisciContatto("Mirko", "234 111 2222");
        Rubrica.inserisciContatto("Vincenzina", "000 111 6969");
        Rubrica.inserisciContatto("Amelia", "000 888 6969");
        Rubrica.inserisciContatto("Ugo", "000 888 2222");
        Rubrica.inserisciContatto("Gigi", "000 111 6666");
        Rubrica.inserisciContatto("Ennio", "000 123 2222");
        Rubrica.inserisciContatto("Emma", "000 111 9876");

        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();

        String result = Rubrica.cercaPerNome(nome);
        System.out.println(result);
    }
}
