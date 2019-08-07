/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2, suma;
        
        System.out.println("Ingrese el primer numero");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese segundo numero");
        numero2 = teclado.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("Resultado de >>" + numero1 + "<< mas >>" + numero2 + "<< es : " + suma);
        
        
        
    }
    
}
