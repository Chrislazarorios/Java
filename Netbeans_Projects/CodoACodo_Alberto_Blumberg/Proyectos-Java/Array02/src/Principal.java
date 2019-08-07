import java.io.InputStream;
import java.util.Scanner;

/* establecer el tamaño de un array
Ingresar y establecer todos los valores de un array
recorrer el array creado y mostrar los valores
recorrer, duplicar y mostrar los valores del array
*/
public class Principal {

    public static void main(String[] args) {
      int size; //Variable que recibe el tamaño del array 
      Scanner teclado= new Scanner(System.in);
      System.out.println("ingrese el tamaño del array a crear");
      size=teclado.nextInt();
      
      //creacion un objeto de la CLASE Arreglos
      Arreglos arreglo1= new Arreglos();
      
      //Variable que recibe el valor de retorno que ingreso el usuario
      int[]numeros=arreglo1.crearArregloDeEnteros(size);//metodo para crear arreglo
      
      //Imprime el arreglo en pantalla 
        System.out.println("El arreglo original queda asi ");
        arreglo1.mostrarArreglo(numeros);//invoco el metodo 
        
        arreglo1.duplicarValores(numeros);
        System.out.println("El array DUPLICADO queda asi: ");
        arreglo1.mostrarArreglo(numeros);
        
        System.out.println("mostrar arreglo MEJORADO: ");
        arreglo1.mostrrArregloMejorado(numeros);
    }

   
    
}
