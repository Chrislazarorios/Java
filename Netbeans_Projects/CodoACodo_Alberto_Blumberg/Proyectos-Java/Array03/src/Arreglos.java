
public class Arreglos {
    
    public void mostrarArreglo (int []a){
        for (int i:a){ //ciclo for mejorado o foreach
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    
    public void odenamientoBubuja(int[]arreglo){
        int auxiliar;// variable donde se guardara el valor a intercambiar
        
        //indice i y j para comparar de a pares los elementos del array
        for (int i = 0; i <= arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-i-1; j++) {
                if (arreglo[j+1]<arreglo[j]){
                    auxiliar=arreglo[j+1];
                    arreglo[j+1]=arreglo[j];
                    arreglo[j]=auxiliar;
                }
                
            }
            
        }
    }
}
