/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2,num3;
        
        
        System.out.println("Compara 3 enteros distintos e indique cual es el mayor");
        System.out.println("Ingrese primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese segundo numero");
        num2 = teclado.nextInt();
        
        System.out.println("Ingrese tercer numero");
        num3 = teclado.nextInt();
        
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("El primer numero es el mayor : " + num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("El segundo numero es el mayor : " + num2);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("El tercer numero es el mayor : " + num3);
        }
        else
        {
            System.out.println("Los tres numeros son iguales");
        }
    }
    
}
