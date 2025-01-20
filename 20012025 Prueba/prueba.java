public class prueba {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("===========================");
        System.out.println("BUCLE FOR");
        System.out.println("===========================");
        System.out.println();

        for (byte i = 1; i <= 10; i++) {
            for (byte j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, ((byte) (i * j)));
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("===========================");
        System.out.println("BUCLE WHILE");
        System.out.println("===========================");
        System.out.println();

        byte x = 0, y = 0;
        while (x < 10) {
            x++;
            y = 0;
            while (y < 10) {
                y++;
                System.out.printf("%d * %d = %d\n", x, y, ((byte) (x * y)));
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("===========================");
        System.out.println("BUCLE DO WHILE");
        System.out.println("===========================");
        System.out.println();

        byte a = 0, b = 0;
        do {
            a++;
            b = 0;
            do {
                b++;
                System.out.printf("%d * %d = %d\n", a, b, ((byte) (a * b)));
            } while (b < 10);
            System.out.println();
        } while (a < 10);

        System.out.println();
        System.out.println("===========================");
        System.out.println("DE SEBASTIAN MUNZON");
        System.out.println("===========================");
        System.out.println();

    }
}