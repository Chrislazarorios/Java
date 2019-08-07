/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int enteroT, enteroM;
        
        System.out.println("Ingrese un numero T : ");
        enteroT = entrada.nextInt();
    
        System.out.println("Ingrese un numero M : ");
        enteroM = entrada.nextInt();
        
        int[] vectorT = new int[enteroT]; // no hace falta
        
        
        int[] vectorM = new int [enteroT];
        int[] multiploM = new int [enteroT];
        
        for(int i = 0; i < vectorM.length; i++)
        {
            multiploM[i] = enteroM * i;
            
            System.out.println("El numero es "+ enteroM + " y sus multiplos son : " + multiploM[i]);
        }
        
        
        int[] miArray = {0,4,8,15,16,21};

          for (int i = 1; i <= miArray.length; i++) {

                System.out.println(miArray[i+1]);

          }
    }
    
}
