package Bucles;

public class Ej3_RaymondEscobar_Bucles {
    public static void main(String[] args) {

        final int ULTIMO = 200;
        int vueltas = 0;

        for (int i = 1; i <= ULTIMO; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            vueltas += 1;
        }
        System.out.printf("%nSe han realizado %d vueltas en el bucle", vueltas);
    }
}
