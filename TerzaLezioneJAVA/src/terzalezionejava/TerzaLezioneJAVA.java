/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terzalezionejava;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class TerzaLezioneJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeri = {11, 21, 3, 44, 9, 1, 45, 198, 43};
        stampa(numeri);
        System.out.println("IL NUMERO MASSIMO È:");
        int numeroMassimo = max(numeri);
        System.out.println(numeroMassimo);

        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci Numero da Cercare");
        int numDaCercare = s.nextInt();

        System.out.println(cerca(numeri, numDaCercare));

        System.out.println("I numeri Pari sono:");
        stampa(pari(numeri));

        System.out.println("I numeri in ordine crescente sono:");
        stampa(ordina(numeri));

//max(numeri);
    }

    public static void stampa(int[] array) {
        for (int jjj : array) {
            System.out.println(jjj);
        }

    }

    //trovare il massimo
    public static int max(int[] array) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //ricercare di un numero
    public static boolean cerca(int[] array, int numero) {

        boolean esiste = false;

        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                esiste = true;
            }
        }
        return esiste;
    }

    //estrarre i numeri pari e usarli per creare un nuovo array
    public static int[] pari(int[] array) {

        int numPari = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numPari = numPari + 1;
            }

        }
        int[] arrayPari = new int[numPari];
        int contaPari = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPari[contaPari] = array[i];
                contaPari = contaPari + 1;
            }
        }
        return arrayPari;
    }
    
//ordina l'array in ordine crescente

    public static int[] ordina(int[] array) {

        int[] arrayOrd = array;

        for (int i = 0; i < array.length - 1; i++) {

            for (int k = 0; k < array.length - 1; k++) {

                if (arrayOrd[k] > arrayOrd[k + 1]) {

                    int nulla;
                    nulla = arrayOrd[k];
                    arrayOrd[k] = arrayOrd[k + 1];
                    arrayOrd[k + 1] = nulla;
                }
            }
        }
        return arrayOrd;
    }
}


prova di branch
