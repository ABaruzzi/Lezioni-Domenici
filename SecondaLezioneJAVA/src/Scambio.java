
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
public class Scambio {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci Prima Variabile");
        int op1 = s.nextInt();

        System.out.println("Inserisci Seconda Variabile");
        int op2 = s.nextInt();

        int op3 = op1;
        op1 = op2;
        op2 = op3;

        System.out.println("Prima Variabile vale " + op1 + " Seconda Variabile vale " + op2);
        System.out.println(String.format("vale %s %s vale %s", op1,op2,op1 ));

    }
}
