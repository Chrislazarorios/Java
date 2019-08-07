//algoritmo de busqueda secuencial
public class Principal {

    
    public static void main(String[] args) {
        //dclaracion de un array on valores
        int []numeros={7,5,2,4,10,11,10};//iniciando con valoes
        int buscado=10;
        Arreglos arreglo1=new Arreglos();
        
        
        //declaracion de variable que recibe el valor de retorno 
        int indice=arreglo1.busquedaSecuencial(numeros, buscado);
        System.out.println("El dato buscado esta en una posicion: "+ indice);
        //otra forma 
        //System.out.println("El dato buscado esta en la posicion "+ arreglo1.busquedaSecuencial(numeros, indice));
        
        
        arreglo1.busqudaScuencial2(numeros, buscado);//invoca al metodo void d la clase Arreglo
    }
    
}
