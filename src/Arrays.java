import java.util.Scanner;

public class Arrays {
    public void main(String[] args) {
        //* ARRAYS *//

        // Un Array (Arreglo) es una variable que agrupa bajo un mismo nombre
        // una colección de valores del mismo tipo y los almacena en distintas posiciones de memoria.
        // Un String es una especie de Array de caracteres char.

        int cantidadExamenes;
        int[] calificaciones; // Aquí está el Array
        Scanner sc = new Scanner(System.in);



        System.out.print("Dime cuántos exámenes has hecho: ");
        cantidadExamenes = sc.nextInt();
        calificaciones = new int[cantidadExamenes]; // Aquí defino la extensión del Array


        for (int i = 0; i < cantidadExamenes; i++) {
        System.out.printf("Nota examen %d: ",i+1);
        calificaciones[i] = sc.nextInt();
        }

        System.out.printf("Tus notas son:%n");
        for (int i = 0; i < cantidadExamenes; i++) {
            System.out.printf("Examen %d: %d %n", i+1, calificaciones[i]);
        }


    }
}
