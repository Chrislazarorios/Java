/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class main {
    public static void main(String[] args) {
         /*Scanner teclado = new Scanner (System.in);
         Persona miPer;
         DNI miDNI;
         String nombre,apellido,dnitxt;
        
        System.out.println("nombre: ");
          nombre=teclado.next();
        System.out.println("apellido: ");
            apellido=teclado.next();
        System.out.println("DNI: ");
            dnitxt=teclado.next();
        miDNI=new DNI(dnitxt);
        miPer=new Persona(nombre, apellido, miDNI);
        System.out.println(miPer.isDNIok());
        if(miPer.isDNIok()== false){
            System.out.println("DNI erroneo");
        }
        System.out.println(miPer.getApellido()+" "+miPer.getVerDNI());*/
        ArrayList<Persona>Personas = new ArrayList();
        Scanner teclado = new Scanner (System.in);

        Persona miP;
        DNI miDNI;
        String sino="N";
    do{
        String nombre,apellido,dnitxt;
        System.out.println("nombre: ");
          nombre=teclado.next();
        System.out.println("apellido: ");
            apellido=teclado.next();
        System.out.println("DNI: ");
            dnitxt=teclado.next();
        miDNI=new DNI(dnitxt);
        miP=new Persona(nombre, apellido);
        Personas.add(miP);
            System.out.println("seguir (S/N)");
            sino=teclado.next();
        }while(sino.equalsIgnoreCase("S"));
      
    }
}