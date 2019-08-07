
package ClasesyObjetos;

public class Principal {
    public static void main(String[] args){
          Operaciones calculadora1=new Operaciones(); //Instancia de un objeto de la clase operaciones 
          
          //los metodos le otorgan comportamiento a los objetos
          calculadora1.leerNumeros();
          calculadora1.sumar();
          calculadora1.restar();
          calculadora1.multiplicar();
          calculadora1.dividir();
          
          calculadora1.mostrarResultados();
    }
    
    
}
