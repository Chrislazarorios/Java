public class Principal {

    public static void main(String[] args) {
        int [] miArray={50,26,7,9,15,27};
        
        Arreglos arreglo1=new Arreglos();//creacion de objeto d la clase Arreglos 
        
        System.out.println("Este es el array desordenado");
        arreglo1.mostrarArreglo(miArray); //invocacion del metodo que muestra el array 
        arreglo1.odenamientoBubuja(miArray);//invocacion del proceso para ordenar de a pares.
        
        System.out.println("Este es el array ordenado");
        arreglo1.mostrarArreglo(miArray);
    }
    
}
