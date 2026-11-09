import java.util.Scanner;

/**
 * U4T8: Calificaciones
 * Raymond José Escobar Gallego
 * 2026-10-30
 * Este Algoritmo lee una calificación numérica entre 0 y 10 y la transforma en calificación alfabética.
 */

public class Ej8_RaymondEscobar_v2 {
    public static void main(String[] args) {

        String texto;
        float calificacion;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la calificación (0 al 10):");
        calificacion = sc.nextFloat();

        //SOLUCIÓN CON SWITCH (ADMITE DECIMALES)

        texto = switch (calificacion) {
            case double n when n >= 0 && n < 3 -> "Muy deficiente";
            case double n when n >= 3 && n < 5 -> "Insuficiente";
            case double n when n >= 5 && n < 6 -> "Bien";
            case double n when n >= 6 && n < 9 -> "Notable";
            case double n when n >= 9 && n <= 10 -> "Sobresaliente";
            default -> "No existe";
        };
        System.out.println(texto);
    }
}