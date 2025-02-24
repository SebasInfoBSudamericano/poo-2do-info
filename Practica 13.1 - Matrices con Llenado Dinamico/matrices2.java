public class matrices2 {

    public static void main(String[] args) {
        /* Genera una matriz dinamica de 
         * 5 filas con 6 columnas que permita alimentar
         * la informacion con numeros pares iniciados
         * en el numero 2
        */
        //Creamos la matriz
        int pares[][] = new int[5][6];
        int acum = 2;
        //Bucle externo de filas
        for (int i = 0; i < 5; i++) {
            //Bucle interno de columnas
            for (int j = 0; j < 6; j++) {
                //Asignamos el valor a la matriz el valor de acum
                pares[i][j] = acum;
                //Mostramos la matriz en pantalla
                System.out.print("[ " + pares[i][j] + " ]");
                //Aumentamos el valor de acum en 2
                acum += 2;
            }
        }
    }
}