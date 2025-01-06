
/*
 * Desarrollar el ejecicio que permita presentar en
 * pantalla N numero de veces una fase ingresada por el
 * usuario.
 * Se desea enumerar el numero de veces que se presenta en
 * pantalla separados por los caracteres "---------------"
 * entre cada una de las respuestas.
 * Usar el bucle Do-While para el ejercicio
 */

import java.util.Scanner;

public class practica10 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        // Definir Variables
        int num, x;
        String frase;
        // Solicitar el ingreso por parte del usuario
        // tanto de la frase como el numero de #veces a repetirla
        System.out.println("Ingresa una Frase");
        frase = object.nextLine();
        System.out.println("Ingresa el #veces a repetir la frase");
        num = object.nextInt();
        // Desarrollar el proceso del bucle:
        // Inicializar la variable X
        x = 1;
        do {
            System.out.println(x + ". " + frase);
            System.out.println("---------------");
            x++;
        } while (x <= num);
        object.close();
    }
}