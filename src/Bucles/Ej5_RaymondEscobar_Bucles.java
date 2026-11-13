package Bucles;

import java.util.Scanner;

/**
 * U5T5: Factorial
 * Raymond José Escobar Gallego
 * 2026-11-13
 * Este Algoritmo lee un número entero positivo N
 * y calcula y muestra su factorial.
 */

public class Ej5_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        int numUsuario;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número: ");
            numUsuario = sc.nextInt();
        } while (numUsuario < 0);

        for (int i = 1; i <= numUsuario; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial de %d es: %d", numUsuario, factorial);
    }
}

// Si se introduce el número 21, el resultado arroja un número negativo, ya que excede la longitud de la variable tipo long.