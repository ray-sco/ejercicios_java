import java.util.Scanner;

/**
 * U4T5: Cálculo de Millas Marinas
 * Raymond José Escobar Gallego
 * 2026-10-29
 * Este Algoritmo lee una distancia en millas marinas y la muestra en metros, sabiendo que una milla marina equivale a 1852 metros.
 */

public class Ej5_RaymondEscobar {
    public static void main(String[] args) {

        final double EQUIVALENCIA = 1852;
        double millaMarina, metros;
        Scanner scMilla = new Scanner(System.in);

        System.out.print("Escribe la distancia en millas marinas: ");
        millaMarina = scMilla.nextDouble();

        metros = millaMarina * EQUIVALENCIA;

        System.out.printf("%.2f millas marinas son %.2f metros", millaMarina, metros);
    }
}
