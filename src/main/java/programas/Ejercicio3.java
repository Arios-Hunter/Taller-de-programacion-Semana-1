
package programas;
//Paquete de datos e/s de datos por consola

import java.util.Scanner;

public class Ejercicio3 {
    /**...7 lines */
public static void main(String args[]){
    String nombre, cargo;
    double ingresoMensual, gastoMensual, ahorroMensual,
            ahorroBimestral, ahorroSemestral, ahorroAnual;
    Scanner lectura=new Scanner (System.in);
    System.out.print("Ingrese el nombre del empleado: ");
    nombre=lectura.next();
    System.out.print("Ingrese el cargo del empleado: ");
    cargo=lectura.next();
    System.out.print("Ingrese el ingreso mensual del empleado: ");
    ingresoMensual=lectura.nextDouble();
    System.out.print("Ingrese el gasto mensual del empleado: ");
    gastoMensual=lectura.nextDouble();
    ahorroMensual=ingresoMensual-gastoMensual;
    ahorroBimestral=ahorroMensual*2;
    ahorroSemestral=ahorroMensual*6;
    ahorroAnual=ahorroMensual*12;
   System.out.println("Ahorro mensual: "+ahorroMensual);
   System.out.println("ahorro bimestral: "+ahorroBimestral);
   System.out.println("Ahorro semestral: "+ahorroSemestral);
   System.out.println("Ahorro anual: "+ahorroAnual);
}  // Fin del metodo
   //Fin del programa
}
