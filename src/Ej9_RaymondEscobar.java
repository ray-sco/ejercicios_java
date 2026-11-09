import java.util.Scanner;

/**
 * U4T9: Suma 1 Segundo
 * Raymond José Escobar Gallego
 * 2026-11-05
 * Este Algoritmo lee una hora expresada en horas, minutos y segundos, y calcula y muestra la hora que será un segundo después.
 */

public class Ej9_RaymondEscobar {
    public static void main(String[] args) {

        int hora, min, seg;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe la hora: ");
        hora = sc.nextInt();
        System.out.print("Escribe el minuto: ");
        min = sc.nextInt();
        System.out.print("Escribe el segundo: ");
        seg = sc.nextInt();

        if (hora > 23 || min > 59 || seg > 59) {
            System.out.println("La hora introducida es inválida");
            System.exit(0);
        }

        if (seg == 59) {
            seg = 0;
            min += 1;
        } else {
            seg += 1;
        }

        if (min == 59 || min == 60) {
            min = 0;
            hora += 1;
        }

        if (hora == 24) {
            hora = 0;
        }

        System.out.printf("Un segundo después son las %02d:%02d:%02d", hora, min, seg);
    }
}