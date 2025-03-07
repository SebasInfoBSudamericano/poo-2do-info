
/* Realizar el algoritmo que permita generar mediante el uso de bucle for
* una matriz dinamica que presente los numeros pares dentro de ella de acuerdo 
* a la cantidad de filas y columnas que ingrese el usuario en pantalla */

import java.util.Scanner;

public class sebastian_munzon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INGRESE EL NUMERO DE FILAS DE LA MATRIZ: ");
        int filas = scanner.nextInt();

        System.out.print("INGRESE EL NUMERO DE COLUMNAS DE LA MATRIZ: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        int numeroPar = 2;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = numeroPar;
                numeroPar += 2;
            }
        }

        // System.out.println("Matriz generada:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println();
        }

        scanner.close();
    }
}