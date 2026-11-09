import java.util.Scanner;

public class Peppos {
    public static void main(String[] args) {

        int diaSemana;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del día de la semana: ");

        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1, 2, 3, 4, 5:
                System.out.println(2/0);
                break;
            case 6, 7:
                System.out.println("Es finde, a emborracharse!");
                break;
            default:
                System.out.println("No has introducido un día válido");
        }

        System.out.println(diaSemana <= 5 ? "Toca madrugar" : "Se duerme hasta tarde");
    }
}