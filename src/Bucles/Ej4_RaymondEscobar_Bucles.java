package Bucles;

import java.util.Scanner;

/**
 * U5T4: Contar con for
 * Raymond José Escobar Gallego
 * 2026-11-13
 * Este Algoritmo muestra los números desde el 1
 * hasta un número N que se introduce por teclado.
 */

public class Ej4_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        int numUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numUsuario = sc.nextInt();

        for (int i = 1; i <= numUsuario; i++) {
            System.out.print(i + " ");
        }
    }
}
