import java.util.Scanner;

/**
 * U4T10: Impuestos
 * Raymond José Escobar Gallego
 * 2026-11-05
 * Este Algoritmo calcula el salario neto semanal de un trabajador en función de las horas trabajadas y de la tarifa por hora.
 */

// VERSIÓN 2: SE CAMBIAN LOS VALORES POR CONSTANTES

public class Ej10_RaymondEscobar_v2 {
    public static void main(String[] args) {

        final double PERCENT_TRAMO1 = 0.25, PERCENT_TRAMO2 = 0.45, TARIFA_EXTRA = 1.5, HORAS_ORDINARIAS = 35, LIMITE_EXENTO = 500, LIMITE_TRAMO1 = 900;

        String nombre;
        double horasTrabajadas, precioHora, bruto, impuestos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del trabajador: ");
        nombre = sc.next();
        System.out.print("Introduce la cantidad de horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();
        System.out.print("Introduce la tarifa: ");
        precioHora = sc.nextDouble();

        if (horasTrabajadas <= HORAS_ORDINARIAS) {
            bruto = horasTrabajadas * precioHora;
        } else {
            bruto = (HORAS_ORDINARIAS * precioHora) + ((horasTrabajadas - HORAS_ORDINARIAS) * (precioHora * TARIFA_EXTRA));
        }

        if (bruto <= LIMITE_EXENTO) {
            impuestos = 0;
        } else if (bruto <= LIMITE_TRAMO1) {
            impuestos = (bruto - LIMITE_EXENTO) * PERCENT_TRAMO1;
        } else {
            impuestos = (400 * PERCENT_TRAMO1) + ((bruto - LIMITE_TRAMO1) * PERCENT_TRAMO2);
        }

        System.out.printf("Trabajador: %s \n", nombre);
        System.out.printf("Salario bruto: %.2f € \n", bruto);
        System.out.printf("Impuestos: %.2f € \n", impuestos);
        System.out.printf("Salario neto: %.2f € \n", bruto - impuestos);
    }
}