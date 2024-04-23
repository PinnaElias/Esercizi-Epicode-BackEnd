package esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class es1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> parole = new HashSet<>(); //insieme non ordinato di elementi unici.
        HashSet<String> duplicati = new HashSet<>();
        System.out.println("dammi la quantità di parole");

        int n = scanner.nextInt();
        int i = 0;
        //scanner a vuoto per svuotare il buffer
        scanner.nextLine();

        while (i<n){
            System.out.println("dammi una parola");
            String parola = scanner.nextLine();
            i++;
            if(!parole.add(parola));{
                duplicati.add(parola);
            }
        }
        System.out.println("Lista duplicati: ");
        System.out.println(duplicati);


    }
}
