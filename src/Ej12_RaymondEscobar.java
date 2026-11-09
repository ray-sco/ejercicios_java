import java.util.Scanner;

/**
 * U4T12: Triángulos
 * Raymond José Escobar Gallego
 * 2026-11-06
 * Este Algoritmo lee las longitudes de los tres lados de un triángulo, como números reales
 * e indica si forma un triángulo, de ser afirmativo indica el tipo de triángulo y si es rectángulo.
 */

public class Ej12_RaymondEscobar {

    public static void main(String[] args) {

        final double EPSILON = 1e-9;   // tolerancia para comparar reales

        double lado1, lado2, lado3, mayor, menor, mediano;
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica el valor del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Indica el valor del segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Indica el valor del tercer lado: ");
        lado3 = sc.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println("No forman un triángulo");
            System.exit(0);
        }

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("Es escaleno");
        } else {
            System.out.println("Es isósceles");
        }

        mayor = Math.max(lado1,Math.max(lado2,lado3));
        menor = Math.min(lado1,Math.min(lado2,lado3));
        mediano = lado1 + lado2 + lado3 - menor - mayor;

        if (Math.abs(menor * menor + mediano * mediano - mayor * mayor) < EPSILON) {
            System.out.println("Es rectángulo");
        } else {
            System.out.println("No es rectángulo");
        }
    }
}