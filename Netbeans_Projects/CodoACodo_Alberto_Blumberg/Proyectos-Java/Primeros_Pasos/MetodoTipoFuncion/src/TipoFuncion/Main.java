/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoFuncion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {
        int n1,n2, suma, resta, multiplicacion, division;

        Scanner teclado = new Scanner(System.in);

        Operaciones op = new Operaciones();
        
        System.out.println("Ingrese el primer entero");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo entero");
        n2 = teclado.nextInt();
        
        suma = op.sumar(n1, n2);
        resta = op.restar(n1, n2);
        multiplicacion = op.multiplicar(n1, n2);
        division = op.dividir(n1, n2);
        
        op.mostrarResultados(suma, resta, multiplicacion, division);
    }
    
    
    
}
