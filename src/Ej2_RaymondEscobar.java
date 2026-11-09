/**
 * U4T2: Cálculo de área de un cuadrado 2
 * Raymond José Escobar Gallego
 * 2026-10-26
 * Este Algoritmo Lee el valor del lado de un cuadrado y calcula su área.
 */

import java.util.Scanner;

public class Ej2_RaymondEscobar {
    public static void main(String[] args) {

        double ladoCuadrado;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el valor del lado del cuadrado: ");
        ladoCuadrado = entrada.nextDouble();

        System.out.println("El área del cuadrado es igual a: " + ladoCuadrado * ladoCuadrado);

    }
}
