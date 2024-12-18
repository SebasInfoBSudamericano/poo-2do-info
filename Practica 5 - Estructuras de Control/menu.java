/*Solicitar el ingreso de dos numeros enteros positivos
 * A traves de un menu de opciones realizar la operacion
 * segun el numero seleccionado. Teniendo que: 
 *          1. Suma
 *          2. Resta
 *          3. Multiplicacion
 *          4. Division
 * 
 */

//Importacion de libreria a usar
import java.util.*;

//Definir clase
public class 
menu 
{
//Declarar metodo main
    public static void main(String[] args) 
    {        
    //Creacion objeto tipo Scanner
        @SuppressWarnings("resource")
        Scanner cin = new Scanner(System.in);
    //Declaracion de Variables
        long n1,n2,resultado;
    //Solicitar el ingreso de datos
        System.out.println("Ingrese el primer numero: ");
        n1 = cin.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = cin.nextInt();
    //Definir variables de opciones
        int opc;
        System.out.println("Seleccione la opcion a realizar: ");
        System.out.println(" Seleciona el # de la operacion a realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        opc = cin.nextInt();
    //Uso de la estructura de Switch
        switch (opc) {
            case 1:
                resultado=n1+n2;
                System.out.println("Suma: "+resultado);
                break;

            case 2:
                resultado=n1-n2;
                System.out.println("Resta: "+resultado);
                break;

            case 3:
                resultado=n1*n2;
                System.out.println("Multiplicacion: "+resultado);
                break;

            case 4:
                resultado=n1/n2;
                System.out.println("Division: "+resultado);
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
