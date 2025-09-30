package Esercizio2;

import java.util.Scanner;

public class Computatore {

    // variabile per chiedere se l'utente vuole continuare
    boolean continua;

    // metodo per leggere un valore per il metodo pariDispari
    public int leggiIntero(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero intero e ti dirò se è pari o dispari");

        return scan.nextInt();
    }

    // visualizzare se il numero è pari o dispari
    public void pariDispari() {
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

    // visualizzare se i numeri dati in input sono uguali o qual è il maggiore

    public void maggioreMinore(){

        do{
            Scanner scan = new Scanner(System.in);

            System.out.println("Inserisci un numero intero");

            int n = scan.nextInt();

            System.out.println("Inserisci un altro numero intero");

            int x = scan.nextInt();
            scan.nextLine(); // consuma l'invio dopo nextInt


            if ( n == x) {
                System.out.println("I numeri sono uguali");
            } else if ( n > x ) {
                System.out.println("Il numero maggiore è: " + n );
            }else if ( x > n ) {
                System.out.println("Il numero maggiore è: " + x );
            }

            System.out.println("Vuoi continuare?");

            String scelta = scan.nextLine();

            continua = false;
            if (scelta.toLowerCase().equals("si")) {
                continua = true;
            }

        }while(continua);
    }
}
