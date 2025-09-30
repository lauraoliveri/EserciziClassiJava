package Esercizio2;

import java.util.Scanner;

public class Computatore {


    // metodo per leggere un valore
    public int leggiIntero(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero intero e ti dirò se è pari o dispari");

        return scan.nextInt();
    }

    // visualizzare se il numero è pari o dispari
    public void pariDispari() {
        boolean continua;
        do {
            int n = leggiIntero();

            if (n % 2 == 0) {
                System.out.println("Il numero " + n + " è pari");
            } else {
                System.out.println("Il numero " + n + " è dispari");
            }

            System.out.println("Vuoi continuare?");

            Scanner scan = new Scanner(System.in);
            String scelta = scan.nextLine();

            continua = false;
            if (scelta.toLowerCase().equals("si")) {
                continua = true;
            }

        } while (continua);


    }
}
