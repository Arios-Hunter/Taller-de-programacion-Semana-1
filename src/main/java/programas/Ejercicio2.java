
package programas;
//Paquete de datos e/s de datos por consola
import java.util.Scanner;
/**...7 lines */
public class Ejercicio2 {
    public static void main(String args[]){
        double sueldo1,sueldo2,sueldo3,sueldo4,sueldo5;
        double totalSueldos,promedioSueldos;
        // Creando el objeto de lectura
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa el 1er sueldo: ");
        sueldo1=lectura.nextDouble();
        System.out.print("Ingrese el 2do sueldo: ");
        sueldo2=lectura.nextDouble();
        System.out.print("Ingrese el 3er sueldo: ");
        sueldo3=lectura.nextDouble();
        System.out.print("Ingrese el 4to sueldo: ");
        sueldo4=lectura.nextDouble();
        System.out.print("Ingrese el 5to sueldo: ");
        sueldo5=lectura.nextDouble();
        totalSueldos=sueldo1+sueldo2+sueldo3+sueldo4+sueldo5;
        promedioSueldos=totalSueldos / 5;
        System.out.println("Total de Sueldo: "+totalSueldos);
        System.out.println("Promedui de sueldo: "+promedioSueldos);
    } // Fin del metodo
    }//Fin del programa
