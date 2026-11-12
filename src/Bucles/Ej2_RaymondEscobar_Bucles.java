package Bucles;

public class Ej2_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        final int ULTIMO = 200;
        int vueltas = 0;

        for (int i = 2; i <= ULTIMO; i += 2) {
            System.out.print(i + " ");
            vueltas += 1;
        }
        System.out.printf("%nSe han realizado %d vueltas en el bucle", vueltas);
    }
}
