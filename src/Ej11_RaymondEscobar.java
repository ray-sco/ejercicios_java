import java.util.Scanner;

/**
 * U4T11: Ecuación de 2º Grado
 * Raymond José Escobar Gallego
 * 2026-11-06
 * Este Algoritmo lee los coeficientes a, b y c de la ecuación ax² + bx + c = 0 y muestra sus soluciones reales, con dos decimales.
 */

public class Ej11_RaymondEscobar {

    public static void main(String[] args) {

        double coefA, coefB, coefC, x1, x2, discr;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el valor de 'a': ");
        coefA = sc.nextDouble();
        System.out.print("Escribe el valor de 'b': ");
        coefB = sc.nextDouble();
        System.out.print("Escribe el valor de 'c': ");
        coefC = sc.nextDouble();

        discr = Math.pow(coefB, 2) - (4 * coefA * coefC);

        if (coefA != 0 && discr > 0) {
            x1 = (-coefB + Math.sqrt(discr)) / (2 * coefA);
            x2 = (-coefB - Math.sqrt(discr)) / (2 * coefA);
            System.out.printf("Hay dos soluciones: x1 = %.2f y x2 = %.2f", x1, x2);

        } else if (coefA != 0 && discr == 0) {
            System.out.printf("Hay una solución doble: %.2f", -coefB / 2 * coefA);

        } else if (coefA != 0 && discr < 0) {
            System.out.printf("No tiene soluciones reales");

        } else if (coefA == 0 && coefB != 0) {
            System.out.printf("Es de primer grado: x = %.2f", -coefC / coefB);

        } else if (coefA == 0 && coefB == 0 && coefC != 0) {
            System.out.printf("No tiene solución");

        } else if (coefA == 0 && coefB == 0 && coefC == 0) {
            System.out.printf("Cualquier número es solución");
        }
    }
}