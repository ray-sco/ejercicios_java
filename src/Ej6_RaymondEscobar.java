import java.util.Scanner;

/**
 * U4T6: Mayoría de edad
 * Raymond José Escobar Gallego
 * 2026-10-30
 * Este Algoritmo pide la edad por teclado y muestra el mensaje «Eres mayor de edad» o el mensaje «Eres menor de edad», según corresponda.
 */

public class Ej6_RaymondEscobar {
    public static void main(String[] args) {

        int edad;
        Scanner scEdad = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        edad = scEdad.nextInt();

        if (edad < 0 || edad > 127) {
            System.out.println("La edad introducida no es válida");
        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
