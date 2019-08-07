/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capturatexto;

import java.util.Scanner;

public class CapturaTexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        System.out.println("Por favor ingrese su nombre de usuario");
        
        usuario = entrada.nextLine();
        
        System.out.println("Hola " + usuario);
    }
}
