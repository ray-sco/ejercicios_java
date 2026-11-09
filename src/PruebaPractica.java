import java.util.Scanner;

/**
 * U4: Prueba Práctica - Versión B
 * Alumno: Raymond José Escobar Gallego
 * Profesor: Ángel Cardiel
 * 2026-11-09
 * Este Algoritmo calcula lo que cuesta alquilar una bicicleta.
 */

public class PruebaPractica {
   public static void main(String[] args) {

        //Declaración de constantes y variables
        final int TARIFA_U = 6, TARIFA_M = 9, TARIFA_E = 15, RECARGO_T1 = 4, RECARGO_T2 = 10;
        final double SEGURO = 0.20;

        String nombreCliente;
        char tipoBicicleta, quiereSeguro;
        int horasAlquiler;
        boolean seguro = false;
        double tarifa = 0, recargoHoras, cargoSeguro = 0;

        Scanner sc = new Scanner(System.in);

        //Entrada de datos
        System.out.print("Introduce el nombre del cliente: ");
        nombreCliente = sc.nextLine();

        System.out.print("Introduce el tipo de bicicleta (U, M, E): ");
        tipoBicicleta = sc.next().toUpperCase().charAt(0);

        if (tipoBicicleta != 'U' && tipoBicicleta != 'M' && tipoBicicleta != 'E') {
            System.out.println("Tipo no válido");
            System.exit(0);
        }

        if (tipoBicicleta == 'U') {
            tarifa = TARIFA_U;
        }

        if (tipoBicicleta == 'M') {
            tarifa = TARIFA_M;
        }

        if (tipoBicicleta == 'E') {
            tarifa = TARIFA_E;
        }

        System.out.print("Introduce la cantidad de horas de alquiler: ");
        horasAlquiler = sc.nextInt();

        if (horasAlquiler < 1 || horasAlquiler > 24) {
            System.out.println("Duración no válida");
            System.exit(0);
        }

        System.out.print("Indique si desea contratar seguro (S): ");
        quiereSeguro = sc.next().toUpperCase().charAt(0);

        seguro = (quiereSeguro == 'S');

        recargoHoras = switch (horasAlquiler) {
            case 1, 2 -> 0;
            case 3, 4, 5, 6, 7, 8 -> RECARGO_T1;
            default -> RECARGO_T2;
        };

        if (seguro) {
            cargoSeguro = (tarifa + recargoHoras) * SEGURO;
        }

        //Salida de Datos
        System.out.printf("Alquiler para %s (tipo %s)%n", nombreCliente, tipoBicicleta);
        System.out.printf("%-16s%8d h%n", "Horas", horasAlquiler);
        System.out.printf("%-16s%8.2f €%n", "Tarifa base", tarifa);
        System.out.printf("%-16s%8.2f €%n", "Recargo horas", recargoHoras);
        System.out.printf("%-16s%8.2f €%n", "Seguro", cargoSeguro);
        System.out.printf("%-16s%8.2f €%n", "Total", tarifa + recargoHoras + cargoSeguro);

       System.out.println("Prueba de subida a Github");
        ;
    }
}
