// Comentarios de una sola línea

/*
Comentarios de múltiples líneas
se usa con la barra (slash) asterisco,
similar a CSS
 */

//Con Ctrl + Slash, se comenta la línea activa

import javax.lang.model.element.VariableElement;
import java.util.Scanner;

/**
 * Otra forma de comentar es con slash asterisco, asterisco
 * Este tipo de comentario se diferencia del anterior porque es
 * un COMENTARIO TÉCNICO
 */


public class General {
    public static void main(String[] args) {

        // Definición de variables: En PSeInt era: Definir variable como Entero
        // En Java se define de la siguiente manera:

        byte variableNumericaMuyCorta; //Es un byte, puede llegar hasta el número 127
        short variableNumericaCorta;
        int variableNumerica;
        long variableNumericaMuyLarga;
        float variableConDecimales;
        double variabeConMuchosDecimales;
        char variableDeCaracter;
        boolean variableLogica;

        // Con Ctrl + Shift y la flecha, se puede subir y bajar una línea de código para cambiarla de posición.

        /* String no es una variable sino una clase, se debe escribir con la S en mayúscula. Es una cadena de texto.
        Se puede usar como variable ya que funciona de forma parecida
         */
        String variableDeCadena;

        //El PrintLN hace que finalice la línea escrita y se continúe en una línea nueva.

        /* Es importante saber elegir el tipo de dato:
        Si el tipo de dato es, por ejemplo, un byte y se supera el número 127,
        Java no va a arrojar error, sino que se DESBORDA y
        comienza a contar desde el principio.
        Ejemplo: 127 + 1 = -128 (negativo)
         */

        variableNumericaMuyCorta = 127;
        System.out.println(variableNumericaMuyCorta);

        System.out.println(variableNumericaMuyCorta += 1);

        /*
        Escribir final antes de una CONSTANTE, evita que esa variable pueda ser modificada
        en el transcurso de la ejecución del programa.
        Ejemplo:
         */

        double IVA_REDUCIDO = 0.10; // Se puede modificar la constante.
        final double IVA = 0.21; // Al intentar modificarlo, genera un error.

        /* Para usar separadores de miles, NO se puede usar puntos
        Así que se usa una barra baja para la separación.
        Ejemplo:
         */

        long miFortuna = 10_000_000; // Es equivalente a indicar 10.000.000 en el sistema de numeración español
        System.out.println(miFortuna);

        /* La contrabarra \ sirve como caracter de Escape,
        por lo que permite añadir instrucciones o caracteres especiales:
        \n crea un salto de línea
        \t añade una tabulación
        \\ escribe una contrabarra
        \" escribe unas comillas dobles
         */

        System.out.println("Hola mundo \n\t Adiós mundo");

        /* Para leer números ingresados por el usuario
        Primero definimos la variable, y le añadimos un scaner
        */

        int miVariable;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un valor:");
        miVariable = sc.nextInt();

        System.out.println("Has escrito el valor: " + miVariable);

        /*PRINT F
         * Sirve para crear un pequeño formato de salida de un valor
         * */

        String nombre = "Raymond", apellido1 = "Escobar", apellido2 = "Gallego";

        System.out.printf("Mi nombre es %s, y mis apellidos son %s %s \n", nombre, apellido1, apellido2);

        // Permite, por ejemplo, definir la cantidad de decimales en un número real.
        final double PI = 3.14159;
        System.out.printf("Los primeros decimales de Pi son %.2f \n", PI);

         /*
         *
         * IF TERNARIO
         * Permite asignar una variable condicionada, como si fuese un IF simplificado
         *
         * */

        String cadena;
        Boolean unidades;

        System.out.println("Escribe si hay unidades 'true' o 'false'");
        unidades = sc.nextBoolean();

        cadena = (unidades) ? "Hay unidades" : "No hay unidades";
        System.out.println(cadena);

        /** ATAJOS DE TECLADO
         * SHIFT + F6 = Permite refactorizar: cambia todas las ocurrencias de una palabra a la vez.
         * CTRL + ALT + L = Da formato automático al documento.
         * SHIFT + F9 = Abre consola de debug.
         */

    }

}
