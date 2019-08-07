/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author alumno
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura, area,  hipotenusa;
        float rcHipotenusa,perimetro;
        
        System.out.println("Ingrese la altura del triangulo");
        altura = teclado.nextInt();
        System.out.println("Ingrese la base del triangulo");
        base = teclado.nextInt();
        
        area = (base * altura)/2;
        hipotenusa = (base^2+altura^2);
        rcHipotenusa = (float)Math.sqrt(hipotenusa);
        
        perimetro = rcHipotenusa + base + altura;
        
        System.out.println("Perimetro del triangulo : " + perimetro);
        System.out.println("Area del triangulo : " + area);
        
    }
}
