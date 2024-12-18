/* Desarollar la practica que permita generar los n primeras
 * tabals de multiplicar desde el 1 hasta un numero dado 
 */
//Importacion Libreria
import java.util.*;
//Declaracion Clase
public class tablas{
    //Declaracion Main
    public static void main(String[] args) {
        //Creacion objeto Scanner
        Scanner scanner = new Scanner(System.in);
        //Ingreso de datos
        int num;
        System.out.println("Ingrese las tablas de Multiplicar a crear: ");
        num = scanner.nextInt();
        //Creacion Bucle Externo
        int x,y,resp;
        x=1;
        while (x<=num) {
            System.out.printf("\tTabla del Numero #%d\n",x);
            y=1;
            while (y<=12) {
                resp=x*y;
                System.out.printf("%d * %d = %d",x,y,resp);
                y++;
            }
            
            x++;
        }
        scanner.close();
    }

}