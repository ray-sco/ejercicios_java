package Bucles;

import java.util.Scanner;

/**
 * U5T8: Series de números
 * Raymond José Escobar Gallego
 * 2026-11-19
 * Este Algoritmo lee una secuencia de números hasta que se introduzca
 * un 0 y después muestra si se ha leído algún número negativo, cuántos
 * son positivos y cuántos negativos.
 */

public class Ej8_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        int numUsuario, positivos = 0, negativos = 0;
        boolean hayNegativo = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numUsuario = sc.nextInt();

        while (numUsuario != 0) {
            if (numUsuario > 0) {
                positivos += 1;
            } else {
                negativos += 1;
                hayNegativo = true;
            }
            System.out.print("Introduce un número: ");
            numUsuario = sc.nextInt();
        }

        System.out.printf(hayNegativo ? "Se ha leído al menos un número negativo.%n" : "No se ha leído ningún número negativo.%n");
        System.out.printf(hayNegativo ? "Hay %d números positivos y %d números negativos." : "Hay %d números positivos", positivos, negativos);
    }
}