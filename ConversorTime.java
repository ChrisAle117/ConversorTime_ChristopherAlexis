
import java.util.Scanner;
public class ConversorTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas que desea convertir a minutos: ");
        int horas = scanner.nextInt();
        int minutos = horas * 60;
        System.out.println(horas + " horas son " + minutos + " minutos.");
        
        System.out.println("Ingrese la cantidad de minutos que desea convertir a segundos: ");
        int min = scanner.nextInt();
        int segundos = min * 60;
        System.out.println(min + " minutos son " + segundos + " segundos.");
        
        System.out.println("Ingrese la cantidad de días que desea convertir a horas: ");
        int dias = scanner.nextInt();
        int horasEnDias = dias * 24;
        System.out.println(dias + " días son " + horasEnDias + " horas.");
        
        System.out.println("Ingrese la cantidad de semanas que desea convertir a días: ");
        int semanas = scanner.nextInt();
        int diasEnSemanas = semanas * 7;
        System.out.println(semanas + " semanas son " + diasEnSemanas + " días.");
        
        scanner.close();
    }
}