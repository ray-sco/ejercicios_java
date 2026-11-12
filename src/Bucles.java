public class Bucles {
    public void main(String[] args) {
        /* BUCLES */

        /*BUCLE FOR*/
        // Se saben la cantidad de repeticiones que tendrá el bucle

        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // La variable "i" solo existe dentro del bucle for si se define dentro de este.
        // Si queremos usarla fuera del bucle (por ejemplo en un println), debemos definirla afuera, junto a las otras variables

        for (int i = 20; i >= n; i--) {
            System.out.println(i);
        }

        /*BUCLE WHILE*/
        // Se comprueba el cumplimiento de la condición antes de entrar al bucle



        /*BUCLE DO WHILE*/
        // Se entra primero al bucle y se repite hasta que la condición sea verdadera.



    }
}
