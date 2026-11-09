import java.util.Scanner;

/**
 * U4T4: Cálculo de descuento
 * Raymond José Escobar Gallego
 * 2026-10-29
 * Este Algoritmo muestra el porcentaje de descuento que se ha aplicado a un artículo
 */

public class Ej4_RaymondEscobar {
    public static void main(String[] args) {

        double precioOriginal, precioVenta, descuento;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el precio original del artículo: ");
        precioOriginal = sc.nextDouble();

        System.out.print("Escribe el precio de venta real del artículo: ");
        precioVenta = sc.nextDouble();

        descuento = 100 - (precioVenta * 100 / precioOriginal);

        System.out.printf("Descuento aplicado: %.2f %%",descuento);

    }
}
