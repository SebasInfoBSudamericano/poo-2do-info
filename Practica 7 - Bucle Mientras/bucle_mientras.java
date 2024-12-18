/*Solicitar la entrada de un numero positivo
 * y de este numero, obtener
 * su tabla de multiplicar del 1 al 12.
 * Presentar en pantalla el resultado en formato:
 * 1 * num = m
 * 2 * num = m
 * etc..
*/
    
import java.util.*;

public class bucle_mientras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, resp;
        System.out.println("Ingresa un numero: ");
        num = scanner.nextInt();
        int cont = 1;
        while (cont<13) {
            resp = num*cont;
            System.out.printf("%d * %d = %d\n",num,cont,resp);
            cont++;
        }
        scanner.close();
    }
}