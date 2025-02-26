public class vector2 {

    public static void main(String[] args) {

        // Literal A
        System.out.println("Literal A");
        int vector[] = { 1, 2, 5, 12, 19, 24 };
        for (int i = 0; i < vector.length; i++){
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println();

        // Literal B
        System.out.println("Literal B");
        int vector2[] = new int[5];
        int acum1 = 1;
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = acum1;
            acum1 += 2;
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println();

        // Literal B
        System.out.println("Literal C");
        int vector3[][] = new int[5][6];
        int acum2 = 5;
        for (int i = 0; i < vector3.length; i++) { // Bucle Externo
            for (int j = 0; j < vector3[i].length; j++) { // Bucle Interno
                vector3[i][j] = acum2;
                acum2 += 5;
                System.out.print("[" + vector3[i][j] + "]");
            }
            System.out.println();
        }
    }
}