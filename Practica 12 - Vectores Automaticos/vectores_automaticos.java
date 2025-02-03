/*
 * Generar el ejercicio que permita presentar los 10 primeros numeros
 * pares almacenados dentro de un vector.
 */

public class vectores_automaticos {
    public static void main(String[] args) {
        int contador = 0;
        // Creamos el vector de 10 posiciones
        int[] pares = new int[10];
        // Usar un bucle para el llenado de datos
        for (int i = 0; i < 10; i++) {
            contador+=2;
            pares[i] = contador;
            System.out.print("{"+pares[i]+"} ");
        }
    }
}
