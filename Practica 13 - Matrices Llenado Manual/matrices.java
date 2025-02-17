
public class matrices {
    public static void main(String[] args) {
        // Declarar una matriz de tipo entero
        int mat[][] = new int[4][2];
        // Indice filas de 0 - 3
        // Columnas de 0 - 1
        // Fia 1
        mat[0][0] = 10;
        mat[0][1] = 20;
        // Fila 2
        mat[1][0] = 30;
        mat[1][1] = 40;
        // Fila 3
        mat[2][0] = 50;
        mat[2][1] = 60;
        // Fila 4
        mat[3][0] = 70;
        mat[3][1] = 80;
        // Recorrer la matriz
        // Bucle externo para las filas
        for (int i = 0; i < 4; i++) {
            // Bucle interno para las columnas
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println(); // Salto de linea
        }
    }
}
