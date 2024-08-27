package programas;
//Paquete de datos e/s de datos por consola
import java.util.Scanner;
/**...7 lines */
public class Ejercicio1 {
    public static void main(String args[]){
        String empleado, producto;
        double precio,igv,subtotal,total;
        int cantidad;
        // Creando el objeto de lectura
        Scanner lectura=new Scanner(System.in);
        System.out.print("Nombre del Cliente: ");
        empleado=lectura.next();
        System.out.print("Ingrese el Producto: ");
        producto=lectura.next();
        System.out.print("Ingrese el Precio del Producto: ");
        precio=lectura.nextDouble();
        System.out.print("Ingreso la cantidad de Productos: ");
        cantidad=lectura.nextInt();
        subtotal=precio*cantidad;
        igv=subtotal*0.18;
        total=subtotal-igv;
        System.out.println("El subtotal es: "+subtotal);
        System.out.println("El IGV es: "+igv);
        System.out.println("El total es: "+total);
           
}    // Fin del metodo
} //Fin del programa

