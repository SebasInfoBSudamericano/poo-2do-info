/* Desarrollar el ejercicio que permita ingresar
el sueldo de 3 personas, calcular el sueldo promedio
de las mismas y presentarlo en pantalla
 */
public class Practica2 {//Creamos la clase
    public static void main(String args[]){ // Creacion de metodo main
        //Variables para nombres de personas
        String n1,n2,n3;
        //Variables para sueldos y promedio
        double s1,s2,s3,promedio;
        //Inicializar variables
        n1="Alex Peña";
        n2="Janeth Muñoz";
        n3="Alexandra Pineda";
        s1=460;
        s2=756.33;
        s3=542.88;
        //Realizar  el calculo del promedio:
        promedio=(s1+s2+s3)/3;
        //Presentar los resultados: 
        System.out.println(n1+" gana: "+s1);
        System.out.println(n2+" gana: "+s2);
        System.out.println(n3+" gana: "+s3);
        System.out.println("El sueldo promedio es de: "+promedio);
    }
}