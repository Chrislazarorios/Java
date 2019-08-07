//CREACION DE CLASES Y OBJETOS
package ClasesyObjetos;


public class Coche {
    //Atributos de la clase o atributos de instancia
    String color;
    String marca;
    int km;
    
    public void arrancar(){
       System.out.println("El motor esta encendido"); 
    }
    
    
    //Creación de un solo metodo main
    public static void main(String[] args) {
        
        //creacion de un objeto = instancia de una clase
        //el objeto en memoria guarda una copia de los atributos
        
       Coche coche1=new Coche() ; //constructor -el nombre da DENTIDAD al objeto
       coche1.color="blanco"; // inicializacion de los ATRIBUTOS
       coche1.marca="Audi"; //la iniciacion le da un ESTAADO
       coche1.km=0;
       
        System.out.println("El color del coche1 es: "+ coche1.color);
        System.out.println("La marca de coche1 es: "+ coche1.marca);
        System.out.println("El kilometraje de coche1 es: "+ coche1.km );
        coche1.arrancar();
        
        Coche coche2= new Coche();
        coche2.color="Rojo";
        coche2.marca="Ferrari";
        coche2.km=100;
        
     
        System.out.println("\n El color del coche1 es: "+ coche2.color);
        System.out.println("a marca de coche1 es: "+ coche2.marca);
        System.out.println("El kilometraje de coche1 es: "+ coche2.km );
       
    }
    
}
