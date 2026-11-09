import java.util.Scanner;

/**
 * U4T7: Ordena números
 * Raymond José Escobar Gallego
 * 2026-10-30
 * Este Algoritmo lee tres números y los muestra en orden ascendente.
 */

public class Ej7_RaymondEscobar_v2 {
    public static void main(String[] args) {

        int num1, num2, num3, menor, medio, mayor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tres números:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        mayor = Math.max(num1, Math.max(num2, num3));
        menor = Math.min(num1, Math.min(num2, num3));
        medio = num1 + num2 + num3 - mayor - menor;

        System.out.println(menor + " " + medio + " " + mayor);
    }
}
