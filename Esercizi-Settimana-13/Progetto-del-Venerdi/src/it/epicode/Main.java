package it.epicode;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileMultimediale img_1 = new Img("IMG_20394002.jpg ", 8);
        FileMultimediale mp3_1 = new Audio("Creep ", 5, 4);
        FileMultimediale vid_1 = new Video("Capodanno_2022 ", 3, 5, 3);
        FileMultimediale mp3_2 = new Audio("QUEEN ", 8, 2);
        FileMultimediale mp3_3 = new Audio("Condorello ", 10, 4);

        Scanner scan = new Scanner(System.in);


        //array qui
        FileMultimediale[] playlist = {
                img_1, mp3_1, vid_1, mp3_2, mp3_3
        };

        int input;

        do {
            System.out.println("inserisci un numero da 1 a 5 e scegli cosa riprodurre, premi 0 per annullare.");
            input = scan.nextInt();


            if (input <1 || input >5) {
                System.out.println("Comando non valido.");
            } else {
                playlist[input - 1].esegui();
            }
          /*  switch (input) {
                case 1:
                    playlist[input - 1].esegui();
                    break;
                case 2:
                    playlist[input - 1].esegui();
                    break;
                case 3:
                    playlist[input - 1].esegui();
                    break;
                case 4:
                    playlist[input - 1].esegui();
                    break;
                case 5:
                    playlist[input - 1].esegui();
                    break;
                default:
                    System.out.println("Comando non valido.");
            } */

        } while (input != 0);

        scan.close(); //ho scoperto cercando su internet che si dovrebbe fare così
    }
}