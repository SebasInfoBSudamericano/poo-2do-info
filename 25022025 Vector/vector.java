public class vector {

    public static void main(String[] args) {
        // Creacion de vector 5x3 
        int[][] vector = new int[5][3];
        // Variable de acumulacion
        int acum = 1;
        // Llenado de vector
        // Bucle Externo
        for (int i = 0; i < 5; i++) {
            // Bucle Interno
            for (int j = 0; j < 3; j++) {
                /*
                 * 1 2 3
                 * 4 5 6
                 * 7 8 9
                 * 10 11 12
                 * 13 14 15
                 */

                vector[i][j] = acum;

                System.out.print("[" + vector[i][j] + "]");

                acum++;
            }
            System.err.println();
        }
        
    }
}