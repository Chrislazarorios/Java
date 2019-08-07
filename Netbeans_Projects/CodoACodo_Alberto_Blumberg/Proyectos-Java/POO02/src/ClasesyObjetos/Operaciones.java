
package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Operaciones {
    //atributos de cclases (ex variable)
    int numero1,numero2,suma,resta,producto,cociente;
    
    //metodos de clase
    //metodo para pedirle al usuario 
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer entero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo entero"));
        
    }
    //metodo para sumar los enteros
    public void sumar(){
      suma=numero1+numero2;   
    }
    
     //metodo para restR LOS ENTEROS 
      public void restar(){
        resta=numero1-numero2;           
       }
       
       public void multiplicar (){
           producto=numero1*numero2;
       }
       
       public void dividir(){
           cociente=numero1/numero2;
           
       }
       //metodo para mostrar el resultado
       public void mostrarResultados(){
           System.out.println("La suma es: "+suma);
           System.out.println("La resta es: "+ resta);
           System.out.println("El produto es: "+producto);
           System.out.println("El cociente es: "+ cociente);
       }
    
}
