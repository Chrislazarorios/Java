/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoProcedimiento;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        
        Operaciones op = new Operaciones();
        
        System.out.println("Ingrese el primer entero");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo entero");
        n2 = teclado.nextInt();
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        
        op.mostrarResultados();
    }
}
