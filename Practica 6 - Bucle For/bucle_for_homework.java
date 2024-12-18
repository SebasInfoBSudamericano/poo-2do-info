//Importacion Scanner
import java.util.Scanner;
//Declaracion Clase 
class bucle_for_homework {
    //Declaracion Metodo Main
    public static void main(String[] args) {
        //Declaracion Scanner
        Scanner scanner = new Scanner(System.in);
        //Declaracion Variable
        byte n;
        //Ingreso de Datos
        System.out.println("Ingrese valor de dato para encontrar todos los pares en el rango de esta: ");
        n = scanner.nextByte();
        //Procesamiento
        for (long i = 1; i <= n; i++) {
            if (i%2==0) {
                //Impresion Valores
                System.out.printf("%d\t", i);
            } 
        }
        scanner.close();
    }
}