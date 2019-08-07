/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author alumno
 */
public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1(15);
        //objeto1.edad = 25; // imposible, es un atributo privado
        int getEdad;
        

        //accedo a los atributos privados por medio de setters y getters
        objeto1.setEdad(25);
        getEdad = objeto1.getEdad();
        System.out.println("Edad : " + getEdad);
    }
}
