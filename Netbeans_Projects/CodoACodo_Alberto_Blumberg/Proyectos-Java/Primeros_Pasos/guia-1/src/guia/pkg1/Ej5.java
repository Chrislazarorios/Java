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
public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio, radioCuadrado;
        float floatRadio,area,longitud,floatRadioCuadrado;
        System.out.println("Ingrese el radio del circulo");
        radio = teclado.nextInt();
        radioCuadrado = (radio^2);
        floatRadio = (float)radio;
        area = (float) (3.14*(radio^2));
        longitud = (float) (2*3.14*floatRadio);
        
        System.out.println("Area del circulo : "+area);
        System.out.println("Longitud de la circunferencia  " + longitud);
    }
    
}
