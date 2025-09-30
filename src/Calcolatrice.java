public class Calcolatrice {


    public void somma (int a, int b) {
        int s = a+b;
        System.out.println("La somma è:" + s);
    }

    public void sottrazione (int a, int b) {
        int s = a-b;
        System.out.println("La differenza è:" + s);
    }

    public void moltiplicazione (int a, int b) {
        int s = a*b;
        System.out.println("Il prodotto è:" + s);
    }

    public void divisione (int a, int b) {
        int s = a/b;
        System.out.println("La divisione è:" + s);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        Calcolatrice c = new Calcolatrice();

        c.somma(a, b);
        c.sottrazione(a, b);
        c.moltiplicazione(a, b);
        c.divisione(a, b);
    }
}



/*
Crea un programma con una classe chiamata Calcolatrice (in modo simile all'esercizio precedente, ma questa volta  NON DEVE avere gli attributi a, b).
La classe deve avere i seguenti metodi:
- somma: stampa la somma dei due numeri presi in ingresso al metodo
- moltiplicazione: stampa la moltiplicazione dei due numeri presi in ingresso al metodo
- divisione
-sottrazione

a e b li scegliamo noi nel main e richiamiamo tutte le 4 operazioni.
 */