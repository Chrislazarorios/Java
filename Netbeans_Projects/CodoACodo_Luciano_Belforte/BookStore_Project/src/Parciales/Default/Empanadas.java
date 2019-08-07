/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
/*public class Empanadas{
    public static void main(String[] args) {
        
       Empanada emp = new Empanada();
       
       emp.precioSegunCantidad("carne suave", 8, 12.0);
        System.out.println();
       
    }


}*/
        
class Empanada {
       private String [] empanadas = {"carne suave", "carne picante", "pollo","humita"};
    public double precioSegunCantidad(String empanada, int cantidad, double precio){
        
        if(empanadas.equals(empanadas[0])  || empanadas.equals(empanadas[1])  && cantidad < 24){
          return precio *2;  
        }
        
        else if(cantidad >=24)
        {
        
            return precio *1.1;
        }
        
        return precio;
    
 }
}