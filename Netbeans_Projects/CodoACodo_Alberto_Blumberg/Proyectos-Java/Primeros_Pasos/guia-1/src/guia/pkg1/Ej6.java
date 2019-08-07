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
public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio,altura,area,volumen;
        System.out.println("Ingrese el radio del cilindro");
        radio = teclado.nextInt();
        System.out.println("Ingrese altura del cilindro");
        altura = teclado.nextInt();
        area = (int) ((2*3.14*(radio^2))+ (2*3.14*radio*altura));
        volumen = (int) (3.14 * (radio^2) * altura) ;
    }
}
