/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesYObjetos;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alberto",52);//invocacion del constructor
//        Persona persona1 = new Persona("87654321");
        persona1.correr();//invocacion del metodo comun
        persona1.correr(24);
        
        Persona persona2 = new Persona("12345678");//
        persona2.correr();
        persona2.correr(15);
    }
    
}
