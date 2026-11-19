package Bucles;

/**
 * U5T9: Suma y producto
 * Raymond José Escobar Gallego
 * 2026-11-19
 * Este Algoritmo calcula y muestra la suma y el
 * producto de los 10 primeros números naturales.
 */

public class Ej9_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        int suma = 0, multiplicacion = 1, num = 10;

        for (int i = 1; i <= num; i++) {
            suma += i;
            multiplicacion *= i;
        }
        System.out.printf("Resultado Suma:%13d %nResultado Multiplicación: %3d%n", suma, multiplicacion);
        // System.out.println("Comprobación: " + num * (num + 1) / 2);
    }
}
