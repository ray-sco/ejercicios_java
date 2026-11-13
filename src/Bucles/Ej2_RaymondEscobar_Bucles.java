package Bucles;

/**
 * U5T2: Contar con for
 * Raymond José Escobar Gallego
 * 2026-11-12
 * Este Algoritmo muestra los números pares comprendidos entre el 1 y el 200.
 * Utiliza un contador y suma de 2 en 2.
 */

public class Ej2_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        final int ULTIMO = 200;
        int vueltas = 0;

        for (int i = 2; i <= ULTIMO; i += 2) {
            System.out.print(i + " ");
            vueltas += 1;
        }
        System.out.printf("%nSe han realizado %d vueltas en el bucle", vueltas);
    }
}
