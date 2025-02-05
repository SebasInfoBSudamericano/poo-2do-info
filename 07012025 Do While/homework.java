public class homework {

    public static void main(String[] args) {

        byte x = 0, y = 0, z = 0, aux = 0;

        // First Case
        y = 100;
        do {
            if (aux % 2 == 0) {
                System.out.print(x + " ");
                x += 5;
            } else {
                System.out.print(y + " ");
                y -= 10;
            }
            aux++;
        } while (y >= 30);

        System.out.println();
        x = 0;
        y = 0;
        aux = 0;

        // Second Case
        y = 99;
        z = 1;
        do {
            if (aux % 3 == 0) {
                System.out.print(x + " ");
                x += 5;
            }
            if (aux % 3 == 1) {
                System.out.print(y + " ");
                y--;
            }
            if (aux % 3 == 2) {
                System.out.print(z + " ");
                z++;
            }
            aux++;
        } while (z <= 5);

        // Third Case
        System.out.println();
        x = 0;
        y = 1;
        z = 0;
        do {
            System.out.print(x + " ");
            z = (byte) (x + y);
            x = y;
            y = z;
        } while (x <= 34);
    }
}