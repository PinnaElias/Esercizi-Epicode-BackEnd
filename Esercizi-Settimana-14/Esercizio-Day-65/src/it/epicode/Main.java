package it.epicode;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[5];

        for (int i = 0; i < 5; i++) {
        numeri[i] = new Random().nextInt(1,11);
    }

        for (int numero: numeri ) { //for avanzato
            System.out.println(numero);
        }

        public static void inserisciArray(int[] array) {
            Scanner scan = new Scanner(
                    System.in
            );
            System.out.println("gimme a number");
            System.out.println("posizione nell'array: ");
            int pos = scanner.nextInt();
            array[pos] = numero;
        }


    }
}