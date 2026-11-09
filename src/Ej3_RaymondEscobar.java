/**
 * U4T3: Cálculos sobre círculos, circunferencias y esferas
 * Raymond José Escobar Gallego
 * 2026-10-26
 * Este Algoritmo lee la longitud de un radio y muestra la longitud de la circunferencia, el área del círculo y el volumen de la esfera que corresponden a ese radio.
 */

import java.util.Scanner;

public class Ej3_RaymondEscobar {
    public static void main(String[] args) {

        double radio, longitud, area, volumen;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el valor del radio de una circunferencia: ");
        radio = entrada.nextDouble();

        longitud = 2 * radio * Math.PI;
        area = Math.PI * Math.pow(radio, 2);
        volumen = (double) 4 / 3 * Math.PI * Math.pow(radio, 3);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);

    }
}
