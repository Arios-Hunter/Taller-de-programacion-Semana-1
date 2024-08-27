
package programas;
import java.util.Scanner;
public class Programa1 {
    public static void main(String[] args) {
        //declarar variables
        String empleado;
        double ingreso,gasto,ahorrom,ahorroa;
        //creando el objeto
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto=lectura.nextDouble ();
        //proceso de datos
        ahorrom=ingreso-gasto;
        ahorroa=ahorrom*12;
        //salida de datos
        System.out.println("Ahorro Mensual: "+ahorrom);
        System.out.println("Ahorro Anual: "+ahorroa);
        //Fin del metodo
        //fin del programa        
    }    
}