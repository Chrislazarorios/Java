
public class principal {

    
    public static void main(String[] args) {
        int[]vueltas1; //declaracion sin inicializar
        int []vueltas2=new int[6]; //declaracion inicializada por defectos 
        int[]vueltas3;vueltas3=new int[4]; //declaracion una linea y asignacion posterior
        
        /*
         
        
        */
      int []vueltas={64,62,65,68,63,65};
      System.out.println("1ra vuelta "+ vueltas[0]);
      System.out.println("4ta vuelta "+ vueltas[3]);
      System.out.println("ultima vuelta "+ vueltas[5]);
      
      System.out.println("La longitud del array vuelta es: "+ vueltas.length);
      
      int ult =vueltas.length-1;
      System.out.println("ultima vuelta : "+ vueltas[ult]);
      
      
      for (int i=0; i<vueltas.length; i++){
        System.out.println(i+" valor "+ vueltas[i]); // i es en que posicion estoy
    }
      
      
      //obtener todos los vaors manipulando el indice de la vista del usuario 
      System.out.println("");
      for (int i=0;i<vueltas.length;i++){
          System.out.println(i+1+" valor "+ vueltas[i]);
      }
      
      //Establece un valor en un array
      int ultimaPosicion=vueltas.length-1;
      arreglos arreglo1=new arreglos();
      System.out.println("Arreglo original ");
      arreglo1.mostrarArreglo(vueltas);
      vueltas[0]=50;
      vueltas[3]=70;
      vueltas[ultimaPosicion]=60;
      
      System.out.println("Arreglo modificado");
      arreglo1.mostrarArreglo(vueltas);


      
    }
    
    
}
