//Import of Library 
import java.util.Scanner;
//Creation Class
public class switch_case_homework {
    //Creation Main Method
    public static void main(String[] args) {
        //Creation Object Type Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables of Input
        Short code;
        String name;

        //Input
        System.out.print("\nIngrese el codigo de area: ");
        code = scanner.nextShort();
        System.out.print("\nIngrese su nombre: ");
        name = scanner.next();
        
        //Definition Salary Values
        float salary = 0;
        String area = "";
        switch (code) {
            case 1001:
                salary = 1500;
                area = "Gerencia";
                break;
            case 1002:
                salary = 1200;
                area = "Jefaturas por Departamentos";
                break;
            case 1003:
                salary = 700;
                area = "Empleados";
                break;
            default:
                System.err.println("ERROR");
                break;
        }

        //Hourly Prices
        final float /* hourNormal = (float)6.25 , */
                    hourExtra = (float)12.25, 
                    hourSupplementary = (float)9.37;

        //Variables of Number of Extra Work
        byte numberHourExtra = 0,
             numberHourSupplementary = 0;

        //Input of Number of Extra Work
        System.out.print("\nIngrese el numero de horas Extra: ");
        numberHourExtra = scanner.nextByte();
        System.out.print("\nIngrese el numero de horas Suplementarias: ");
        numberHourSupplementary = scanner.nextByte();

        //Variables of Result of Extra Work
        float hourExtraFinal = hourExtra * numberHourExtra, 
              hourSupplementaryFinal = hourSupplementary * numberHourSupplementary;

        //Final Processing
        salary += hourExtraFinal + hourSupplementaryFinal;

        //Final Impression
        System.out.printf("\nEl Sr.%s del area de %s gana %.2f$", name, area, salary);

        scanner.close();
    }
}