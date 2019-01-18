
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class Pari {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci Prima Variabile");
        int op1 = s.nextInt();
        int risultato = op1 / 2;

        System.out.println("Il numero diviso 2 è: " + risultato);

        // Metodo 1
        if ((op1 % 2) == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }

        // Metodo 2
        if ((op1 & 1) == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }

        // Metodo 3
        int resto = op1 % 2;
        if (resto == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }

    }

}
