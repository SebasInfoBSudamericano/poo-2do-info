public class vector {
    public static void main(String[] args) {
        int[] vector = new int[8];

        // vector.length es la longitud del vector (en este caso 8)

        // Guardar un número en cada una de las posiciones del vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }

        // Imprimir en pantalla cada una de las posiciones del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + i + "] = " + vector[i]);
        }
    }
}