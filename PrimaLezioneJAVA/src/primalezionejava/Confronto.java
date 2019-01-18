/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primalezionejava;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Confronto {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci Primo Numero");
        int op1 = s.nextInt();

        System.out.println("Inserisci Secondo Numero");
        int op2 = s.nextInt();

        if (op1 == op2) {
            System.out.println("I numeri sono Uguali");

        } else {
            if (op1 > op2) {
                System.out.println("Il numero maggiore é: " + op1);
            } else {
                System.out.println("Il numero maggiore é: " + op2);
            }
        }

    }
}
