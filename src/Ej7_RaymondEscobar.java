import java.util.Scanner;

/**
 * U4T7: Ordena números
 * Raymond José Escobar Gallego
 * 2026-10-30
 * Este Algoritmo lee tres números y los muestra en orden ascendente.
 */

public class Ej7_RaymondEscobar {
    public static void main(String[] args) {

        int num1, num2, num3, menor, medio, mayor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tres números:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;

            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }

        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;

            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }

        } else {
            menor = num3;

            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        System.out.println(menor + " " + medio + " " + mayor);
    }
}
