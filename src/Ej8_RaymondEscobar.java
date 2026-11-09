import java.util.Scanner;

/**
 * U4T8: Calificaciones
 * Raymond José Escobar Gallego
 * 2026-10-30
 * Este Algoritmo lee una calificación numérica entre 0 y 10 y la transforma en calificación alfabética.
 */

public class Ej8_RaymondEscobar {
    public static void main(String[] args) {

        float calificacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la calificación (0 al 10):");
        calificacion = sc.nextFloat();

        if (calificacion < 0 || calificacion > 10) System.out.println("No existe");
        else if (calificacion < 3) System.out.println("Muy deficiente");
        else if (calificacion < 5) System.out.println("Insuficiente");
        else if (calificacion < 6) System.out.println("Bien");
        else if (calificacion < 9) System.out.println("Notable");
        else if (calificacion <= 10) System.out.println("Sobresaliente");
    }
}