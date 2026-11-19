package Bucles;

/**
 * U5T11: Pares e Impares
 * Raymond José Escobar Gallego
 * 2026-11-19
 * Este Algoritmo suma por separado los números pares y los
 * impares comprendidos entre 100 y 200, luego muestra las
 * dos sumas.
 */

public class Ej11_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        final int NUM_MIN = 100, NUM_MAX = 200;
        int sumaPar = 0, sumaImpar = 0;

        for (int i = NUM_MIN; i <= NUM_MAX; i++) {
            if (i % 2 == 0) {
                sumaPar += i;
            } else {
                sumaImpar += i;
            }
        }
        System.out.printf("Suma de Pares: %6d %nSuma de Impares: %d", sumaPar, sumaImpar);
    }
}
