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
public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double centimetros, pulgadas;
        System.out.println("Ingrese medida en centimetros");
        centimetros = teclado.nextFloat();
        pulgadas = 2.54 * centimetros;
        System.out.println("Medida en pulgadas : " + pulgadas);
    }
    
}
