package Bucles;

import java.util.Scanner;

/**
 * U5T10: Una nota de diez
 * Raymond José Escobar Gallego
 * 2026-11-19
 * Este Algoritmo lee una secuencia de notas,
 * con valores de 0 a 10, * termina con el valor −1,
 * y dice si hubo o no alguna nota con valor 10.
 */

public class Ej10_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        double nota;
        boolean huboDiez = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota (valor del 0 al 10): ");
        nota = sc.nextDouble();

        while (nota != -1) {
            if (nota < 0 || nota > 10) {
                System.out.println("Nota fuera de rango");
            } else if (nota == 10) {
                huboDiez = true;
            }
            System.out.print("Introduce una nota (valor del 0 al 10): ");
            nota = sc.nextDouble();
        }
        System.out.printf("%s nota con valor 10", huboDiez ? "Hubo alguna" : "No hubo ninguna");
    }
}
