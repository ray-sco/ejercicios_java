package Bucles;

import java.util.Scanner;

/**
 * U5T6: Series de números
 * Raymond José Escobar Gallego
 * 2026-11-13
 * Este Algoritmo lee 10 números y después muestra un mensaje
 * que dice si se ha introducido algún número negativo o no.
 */

public class Ej6_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        int numLecturas = 10;
        int[] numUsuario = new int[numLecturas];
        boolean negativo = false;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numLecturas; i++) {
            System.out.print("Introduce un número: ");
            numUsuario[i] = sc.nextInt();
            if (numUsuario[i] < 0) {
                negativo = true;
            }
        }
        System.out.printf(negativo ? "Se han introducido números negativos" : "No se han introducido números negativos");
    }
}