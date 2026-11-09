import java.util.Scanner;

/**
 * U4T6: Mayoría de edad (Versión 2)
 * Raymond José Escobar Gallego
 * 2026-10-30
 * Este Algoritmo pide la edad por teclado y muestra el mensaje «Eres mayor de edad» o el mensaje «Eres menor de edad», según corresponda.
 */

public class Ej6_RaymondEscobar_v2 {
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        edad = sc.nextInt();

        if (edad < 0 || edad > 127) {
            System.out.println("La edad introducida no es válida");
            System.exit(0); // Finaliza el programa si se cumple el if
        }

        System.out.printf("Eres %s de edad", edad < 18 ? "menor" : "mayor");
    }
}
