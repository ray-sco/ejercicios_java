package Bucles;

import java.util.Scanner;

/**
 * U5T7: Series de números
 * Raymond José Escobar Gallego
 * 2026-11-13
 * Este Algoritmo lee 10 números y después muestra
 * cuántos son positivos y cuántos negativos.
 */

public class Ej7_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        int numLecturas = 10, positivos = 0, negativos = 0;
        int[] numUsuario = new int[numLecturas];
        boolean hayCero = false;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numLecturas; i++) {
            System.out.print("Introduce un número: ");
            numUsuario[i] = sc.nextInt();
            if (numUsuario[i] < 0) {
                negativos += 1;
            } else if (numUsuario[i] > 0) {
                positivos += 1;
            } else {
                hayCero = true;
            }
        }

        System.out.printf("Se introdujeron %d números positivos y %d números negativos. ", positivos, negativos);
        System.out.printf(hayCero ? "Se introdujo al menos un número 0." : "");
    }
}