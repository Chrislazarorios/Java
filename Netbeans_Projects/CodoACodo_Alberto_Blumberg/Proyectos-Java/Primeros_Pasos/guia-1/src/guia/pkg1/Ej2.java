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
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion;
        System.out.println("Ingrese primer numero");
        num1 = teclado.nextFloat();
        System.out.println("Ingrese segundo numero");
        num2 = teclado.nextFloat();
        suma = num1+num2;
        resta = num1-num2;
        multiplicacion = num1*num2;
        System.out.println("El resultado de sumar " + num1 + " mas " + num2 + " es " + suma);
        System.out.println("El resultado de restar " + num1 + " menos " + num2 + " es " + resta);
        System.out.println("El resultado de multiplicar " + num1 + " por " + num2 + " es " + multiplicacion);

    }
    
    
}
