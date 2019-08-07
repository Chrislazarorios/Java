/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioPagado;
        double precio;
        double porcentajePrecioPagado;
        double difPorcentaje;
        System.out.println("Ingrese precio tarifa");
        precio = teclado.nextFloat(); 
        System.out.println("Ingrese precio pagado");
        precioPagado = teclado.nextFloat();
        
        difPorcentaje = precio - precioPagado;
        //porcentajePrecioPagado = (precio * 100) / precioPagado;
        
        porcentajePrecioPagado = (difPorcentaje * 100) / precio;
        
        System.out.println("El porcentaje descontado es de " + porcentajePrecioPagado + "%");
        
        /*precio - 100%;
        difPorcentaje - x% = 
        */
    }
    
}
