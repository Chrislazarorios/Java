import java.util.Scanner;

public class Arreglos {
    //FUNCION que crea el arreglo del tamaño indicado por el usuario
    public int[]crearArregloDeEnteros(int tamanio) {
    int []a=new int[tamanio];
    for (int i=0; i< a.length ; i++) {
       a[i]=leerEntero("Ingrese valor "+ (i+1)+" de "+ a.length + " : " );
    }
    return a;
}
    //FUNCION que lee el numero ingresado por el usuario y veifia si no es un double
    public int leerEntero(String cartel){
        Scanner teclado =new Scanner(System.in);
        System.out.println(cartel);
        double x=teclado.nextDouble();
        while ((int)x!=x){
            System.out.println("ERROR: " + cartel);
                    x=teclado.nextDouble();
                    
        }
        return (int)x;
    }
    //PROCEDIMINTO que recorre el array e imprime por pantalla
    public void mostrarArreglo(int[]a){
        for (int i = 0; i < a.length; i++) { //for tab
            System.out.print(a[i]+" ");   
        }
        System.out.println("");//imprime lineas en blanco
            
    }
    //PROCEDIMIENTO que duplica valores 
       public void duplicarValores(int[]b){
           for (int i = 0; i < b.length; i++) {
               b[i]*=2;
           }
       } 
       
       //ciclo FOR MEJORADO (foreah o enhancd FOR)
       public void mostrrArregloMejorado(int[]c){
       for (int elemento: c){ //LA variable ELEMENTO es el mism tipo que el parametro
       System.out.print(elemento +" ");
       }
    }

       
}
