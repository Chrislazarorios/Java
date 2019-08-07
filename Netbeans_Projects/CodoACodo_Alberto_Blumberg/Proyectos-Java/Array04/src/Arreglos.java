
public class Arreglos {
    //algoritmo de busqueda secuencial
    public int busquedaSecuencial (int []arreglo, int dato){
        int posicion =-1; //declaracion e inicializacion de la variable de etorno
        for (int i=0;i<arreglo.length; i++){ //recorrido del array
           if (arreglo [i]==dato){ //comparacion del elemento con el dato buscado 
               posicion=i; //almacenado del indice del array donde esta el dato buscado
               break;//clausula que interrumpe la iteracion del ciclo for
           } 
        }
        return posicion ; //valor de retorno
    }
    
    public void busqudaScuencial2(int []arreglo, int dato){
        int posicion = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==dato){
                posicion=i;
                System.out.println("El dato buscado esta en la posicion \n"+ posicion);
            }
            
        }
    }
}
