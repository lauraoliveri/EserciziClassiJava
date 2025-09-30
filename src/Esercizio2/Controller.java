package Esercizio2;

import Esercizio2.Computatore;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        //creo l oggetto computatore
        Computatore c = new Computatore();

        Scanner s = new Scanner(System.in);

        System.out.println("Scegli un algoritmo:\n" +
                "1 – pariDispari\n" +
                "2 – maggioreMinore\n" +
                "3 – contatoreVerticale\n" +
                "4 – contaOrizzontale\n" +
                "5 – semaforo\n" +
                "6 – totalizzatore\n" +
                "7 – stampaVettore\n" +
                "8 – nominativi\n" +
                "9 – ordinamento\n" +
                "10 – cercaNelVettore\n" +
                "11 – stampaTabellina\n" +
                "12 – meteo\n" +
                "13 – ESCI");

        int scelta = s.nextInt();

        switch(scelta){
            case 1:
                c.pariDispari();
                break;
            case 2:
                c.maggioreMinore();
                break;
            case 3:
                c.contatoreVerticale();
                break;
            case 4:
                c.contaOrizzontale();
                break;
            case 5:
                c.leggiStringa();
                break;
            case 6:
                c.totalizzatore();
                break;
            case 7:
                c.stampaVettore();
                break;
            case 8:
                c.nominativi();
                break;
            case 9:
                c.ordinamento();
                break;
        }


    }
}


/*
1) Classe Controller: il metodo main deve contenere un menu (switch-case)
->l’utente deve scegliere quale algoritmo visualizzare
->ogni opzione può essere rieseguita subito con un do-while
(domanda “ripetere l’operazione? s/n” con “no” torno al menu)
->do-while per rimanere/uscire nel programma
(Opzione ESCI”)

2)Classe Computatore: che raccoglie una serie di metodi ognuno
col suo algoritmo
-> deve contenere i seguenti metodi con relativi algoritmi:

1 – pariDispari
Creare un metodo leggiIntero() per leggere i valori interi.
Visualizzare se il valore dato in input è pari o dispari.
Chiedere se continuare con l’inserimento dei valori.

2 – maggioreMinore
Visualizzare se i 2 valori dati in input sono uguali oppure indicare quello maggiore.
Chiedere se continuare con l’inserimento dei valori.

3 – contatoreVerticale
Chiedere fino a quanto contare e visualizza i numeri in verticale.

4 – contaOrizzontale
Chiedere fino a quanto contare e visualizza i numeri in orizzontale, separati da virgola con il punto finale.

5 – semaforo
Creare il metodo leggiStringa().
Chiedere il colore del semaforo:
se rosso visualizzare ALT
se verde visualizzare VAI
se arancione visualizzare ATTENZIONE
qualunque altro colore NON SEI AL SEMAFORO.

6 – totalizzatore
Fornire valori fino a quando si vuole continuare.
Terminato l’inserimento visualizzare il totale e la media dei valori dati.

7 – stampaVettore
Creare un vettore di 10 interi e riempirlo.
Chiedere se visualizzare i valori per riga o colonna e visualizzarli.

8 – nominativi
Creare un vettore di 10 nominativi e riempirlo.
Visualizzare i valori in modo verticale indicando per ogni nominativo il progressivo.

9 – ordinamento
Creare un vettore di 10 nominativi e riempirlo.
ordinarlo con un algoritmo di sort e visualizzare i valori ordinati.

10 – cercaNelVettore
Creare un vettore di 10 nominativi.
Chiedere all’utente un nominativo da cercare.
Se il nominativo viene trovato, visualizzare nominativo e posizione,
altrimenti visualizzare nominativo non trovato.

11 – stampaTabellina
Visualizzare la tabellina del 10.

12 – meteo
Creare una matrice che deve contenere le temperature di tutti i giorni della settimana, rilevate ogni 6 ore.

P.S. Con la 13_esima scelta il programma termina.
 */