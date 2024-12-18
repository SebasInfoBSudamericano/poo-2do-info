/*Desarrollar el ejercicio que permita comparar
 * 2 condicionantes a traves de los operadores
 * and y or. Usar para ello dos constantes
 */

 public class Practica3 {
    
    public static void main(String[] args) {
        int x=10,y=50; //Inicializados directamente la constante
        // Condicion AND
        if (x >= 10 && y <= 40) {
            System.out.println("And-Verdadero");
        }else{
            System.out.println("And-Falso");
        }
        //Condicion OR
        if (x >= 10 || y <= 40) {
            System.out.println("Or-Verdadero");
        }else{
            System.out.println("Or-Falso");
        }
    }
 }