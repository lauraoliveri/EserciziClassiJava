package Esercizio2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Computatore {

    // scanner input

    private Scanner scan = new Scanner(System.in);
    // variabile per chiedere se l'utente vuole continuare
    boolean continua;

    // metodo per leggere un valore per il metodo pariDispari
    public int leggiIntero() {

        System.out.println("Inserisci un numero intero");

        return scan.nextInt();

    }

    // visualizzare se il numero è pari o dispari
    public void pariDispari() {
        do {
            int n = leggiIntero();
            scan.nextLine(); // consuma l'invio dopo nextInt

            if (n % 2 == 0) {
                System.out.println("Il numero " + n + " è pari");
            } else {
                System.out.println("Il numero " + n + " è dispari");
            }

            System.out.println("Vuoi continuare?");

            String scelta = scan.nextLine();

            continua = false;
            if (scelta.toLowerCase().equals("si")) {
                continua = true;
            }

        } while (continua);


    }

    // visualizzare se i numeri dati in input sono uguali o qual è il maggiore

    public void maggioreMinore() {

        do {

            System.out.println("Inserisci un numero intero");

            int n = scan.nextInt();

            System.out.println("Inserisci un altro numero intero");

            int x = scan.nextInt();
            scan.nextLine(); // consuma l'invio dopo nextInt


            if (n == x) {
                System.out.println("I numeri sono uguali");
            } else if (n > x) {
                System.out.println("Il numero maggiore è: " + n);
            } else if (x > n) {
                System.out.println("Il numero maggiore è: " + x);
            }

            System.out.println("Vuoi continuare?");

            String scelta = scan.nextLine();

            continua = false;
            if (scelta.toLowerCase().equals("si")) {
                continua = true;
            }

        } while (continua);
    }

    public void contatoreVerticale() {

        System.out.println("Conterò fino a quel numero. Vedrai i numeri in verticale.");

        // chiamo il metodo per prendere il valore da input
        int n = leggiIntero();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public void contaOrizzontale() {

        System.out.println("Conterò fino a quel numero. Vedrai i numeri in orizzontale.");

        // chiamo il metodo per prendere il valore da input
        int n = leggiIntero();

        for (int i = 1; i <= n; i++) {
            if (i == n) System.out.print(i + ".");
            else System.out.print(i + ", ");
        }
    }

    // semaforo

    public void leggiStringa() {

        System.out.println("Inserisci un colore del semaforo.");
        String colore = scan.nextLine().toLowerCase();

        switch (colore) {
            case "rosso":
                System.out.println("ALT");
                break;
            case "arancione":
                System.out.println("ATTENZIONE");
                break;
            case "verde":
                System.out.println("VAI");
                break;
            default:
                System.out.println("NON SEI AL SEMAFORO.");
                break;

        }
    }

    // totalizzatore

    public void totalizzatore(){

        System.out.println("Inserisci un numero, se ti vuoi fermare scrivi stop.");

        boolean continua = true;

        int conteggio = 0;
        int totale = 0;

        do{
            String valore = scan.nextLine();
            if (valore.equals("stop")){
                continua = false;

            }else{
                int numero = Integer.parseInt(valore); // converto la stringa in numero
                totale += numero;
                conteggio++;
            }

        }while(continua);

        if (!continua){
            int media = totale / conteggio;
            System.out.println("Il totale è: " + totale);
            System.out.println("La media è: " + media);
        }



    }

    // creo, riempio e stampo un array(di numeri)
    public void stampaVettore(){

        int[] myArr = new int[10];

        // popolo l array
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int)(Math.random() * 101);
        }

        System.out.println("Vuoi visualizare i numeri per riga o colonna?(scrivi 'riga' o 'colonna')");

        String scelta = scan.nextLine().toLowerCase();

        for (int i = 0; i < myArr.length; i++) {
           switch(scelta){


               case "riga": //stampa i numeri in riga
                   if (i != myArr.length - 1) {
                       System.out.print(myArr[i] + ", ");
                   }else{
                       System.out.print(myArr[i] + ".");
                   }
                   break;

               case "colonna": //stampa i numeri in colonna
                   System.out.println(myArr[i]);
                   break;
           }
        }
    }

    // creo, riempio e stampo un array(di nomi)
    public void nominativi(){
       String[] nomi = {
               "Marco",
               "Luca",
               "Anna",
               "Giulia",
               "Francesco",
               "Elisa",
               "Paolo",
               "Chiara",
               "Davide",
               "Sara"
       };

        for (int i = 0; i < nomi.length ; i++) {
            System.out.println(i+1 + ") " + nomi[i]);
        }
    }

    // creo, riempio e stampo un array(di nomi) in ordine
    public void ordinamento(){
        String[] nomi = {
                "Marco",
                "Luca",
                "Anna",
                "Giulia",
                "Francesco",
                "Elisa",
                "Paolo",
                "Chiara",
                "Davide",
                "Sara"
        };

        Arrays.sort(nomi);

        // stampo l'array ordinato
        for (int i = 0; i < nomi.length ; i++) {
            if ( i == nomi.length -1){
                System.out.println(nomi[i] + ".");
            }else{
                System.out.println(nomi[i] + ", ");
            }

        }
    }



   //
    public void cercaNelVettore(){
        String[] nomi = {
                "Marco",
                "Luca",
                "Anna",
                "Giulia",
                "Francesco",
                "Elisa",
                "Paolo",
                "Chiara",
                "Davide",
                "Sara"
        };

        System.out.println("Inserisci un nome e ti dirò se è presente.");

        String nome = scan.nextLine();

        boolean trovato = false;

        for (int i = 0; i < nomi.length; i++) {


            if (nomi[i].equalsIgnoreCase(nome)){ //ignora il case
                trovato = true;
                break; // quando e se trova il nome interrompe il ciclo
            }
        }

        if(trovato) {
            System.out.println("Nome trovato.");
        }else{
            System.out.println("Nome non trovato.");
        }
    }

    // stampa tabellina del 10
    public void stampaTabellina(){
        int dieci = 10;

        for (int i = 0; i <= dieci; i++) {
            int moltiplicazione = i*10;
            System.out.println(i + " x " + dieci + " = " + moltiplicazione);
        }
    }
}
