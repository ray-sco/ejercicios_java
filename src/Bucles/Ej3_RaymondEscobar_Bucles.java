package Bucles;

/**
 * U5T3: Contar con for
 * Raymond José Escobar Gallego
 * 2026-11-12
 * Este Algoritmo muestra los números pares comprendidos entre el 1 y el 200.
 * Utiliza un contador que sube de 1 en 1 y comprueba cada número.
 */

public class Ej3_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        final int ULTIMO = 200;
        int vueltas = 0;

        for (int i = 1; i <= ULTIMO; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            vueltas += 1;
        }
        System.out.printf("%nSe han realizado %d vueltas en el bucle", vueltas);
    }
}
