/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tss
 */
public class Array {

    public static void stampa(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int kk = array[i];
            System.out.println(String.format((i + 1) + " # Valore %s", kk));
        }

    }

    public static void main(String[] args) {

        //dichiarazione array di interi
        int[] numeri;
        //creazione di un array di 100 numneri
        numeri = new int[100];

        // forma abbrievata
        int[] numeri1 = new int[100];
        
        // altra forma abbraviata
        int[] numeri2 = {10,12,12};

        for (int i = 0; i < numeri1.length; i++) {
            numeri1[i] = i + 1;
        }
        stampa(numeri1);
        stampa(numeri2);
    }
}
