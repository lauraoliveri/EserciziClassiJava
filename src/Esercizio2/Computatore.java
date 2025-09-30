package Esercizio2;

import java.util.Scanner;

public class Computatore {

    // variabile per chiedere se l'utente vuole continuare
    boolean continua;

    // metodo per leggere un valore per il metodo pariDispari
    public int leggiIntero(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");

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

    public void contatoreVerticale(){

        System.out.println("Conterò fino a quel numero. Vedrai i numeri in verticale");

        // chiamo il metodo per prendere il valore da input
        int n = leggiIntero();

        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
    }

    public void contaOrizzontale(){

        System.out.println("Conterò fino a quel numero. Vedrai i numeri in orizzontale");

        // chiamo il metodo per prendere il valore da input
        int n = leggiIntero();

        for (int i = 1; i <= n ; i++) {
            if ( i == n )
            System.out.print(i + ".");
            else
                System.out.print(i + ", ");
        }
    }
}
