/* Desarrollar el ejercicio que mediante el uso de bucle
 * for permita solicitar n numero de notas de un estudiante
 * dentro de materia x. Presentar en pantalla si el
 * estudiante aprueba dicha materia con una nota aprobatoria
 * de 7/10 o mayor 
 */

//Importacion Libreria
import java.util.Scanner;
//Creacion Clase
public class bucle_for {
    //Creacion Metodo Main
    public static void main(String[] args) {
        //Creacion Objeto Scanner
        Scanner in = new Scanner(System.in);
        //Definicion Variables
        String nombre="", materia="";
        byte num;
        float nota, suma=0, prom;
        //Ingreso de datos
            ///Ingreso Tipo String
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre=in.nextLine();
        System.out.print("Ingrese el nombre de materia: ");
        materia=in.nextLine();
            ///Ingreso Tipo Byte
        System.out.print("Ingrese numero de notas a calificar: ");
        num=in.nextByte();
        //Arranque Ciclo For
        for(byte i=0; i<num; i++){
            System.out.printf("Ingrese nota %x: ",(i+1));
            nota=in.nextFloat();
            //Acumulacion de nota en variable suma
            suma+=nota;
        }
        //Calcular Promedio
        prom=suma/num;
        //Condicionante
        if (prom>=7) {
            System.out.printf("%s aprueba en %s con nota de: %.2f\n", nombre, materia, prom);
        }else{
            System.out.printf("%s Reprueba en %s con nota de: %.2f\n", nombre, materia, prom);
        }
        in.close();
    }   
}