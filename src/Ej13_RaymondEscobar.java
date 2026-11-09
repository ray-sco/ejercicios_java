import java.util.Scanner;

/**
 * U4T13: Calculadora de DNI
 * Raymond José Escobar Gallego
 * 2026-11-07
 * Este Algoritmo lee el número y la letra de un DNI y dice si la letra es correcta.
 * Si no lo es, muestra la letra que debería llevar.
 */

public class Ej13_RaymondEscobar {

    public static void main(String[] args) {

        final String CADENA = "TRWAGMYFPDXBNJZSQVHLCKE";
        final int MAXIMO = 99999999;
        int numUsuario, restoNum;
        char letraUsuario, letraCorrecta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe los números del DNI: ");
        numUsuario = sc.nextInt();

        System.out.print("Escribe la letra del DNI: ");
        letraUsuario = sc.next().toUpperCase().charAt(0);

        if (numUsuario < 1 || numUsuario > MAXIMO) {
            System.out.println("El número introducido es inválido");
        } else {
            restoNum = numUsuario % 23;
            letraCorrecta = CADENA.charAt(restoNum);

            if (letraUsuario == letraCorrecta) {
                System.out.println("La letra es correcta");
            } else {
                System.out.printf("La letra no es correcta: debería ser la %s", letraCorrecta);
            }
        }
    }
}