/* Solicitar el ingreso por parte de una persona
 * de su numbre y su edad. Presentar en pantalla 
 * si la persona es mayor o menor de edad
 * >=18 Mayor de edad
 */

//Importacion de libreria
import java.util.*;

//Definir clase
public class condicionantes {
    //Metodo Main
    public static void main(String[] args) {
        //Definir variables
        String nombre;
        int edad;
        /* Definir el nombre del tipo Scanner */
        @SuppressWarnings("resource")
        Scanner cin = new Scanner(System.in);
        //Solicitar el ingreso de datos en pantalla
        System.out.println("Ingrese tu nombre: ");
        nombre = cin.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = cin.nextInt();
        if (edad >= 18) {
            System.out.println(nombre+" es Mayor de edad");
        }else{
            System.out.println(nombre+" es Menor de edad");
        }
    }
}
