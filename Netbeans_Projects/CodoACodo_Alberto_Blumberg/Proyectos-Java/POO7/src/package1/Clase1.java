/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author alumno
 */
public class Clase1 {
    public int atributo1;//public, se puede accede desde cualquier clase y paquete
    private int atributo2;//private, se puede acceder solo desde su propia clase

    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        objeto1.atributo2 = 25;
    }
} 
