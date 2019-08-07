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
public class Persona {
    // Defino atributos de clase
    String nombre;
    int edad;
    String dni;

    //Constructor con parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Constructor con sobrecarga para el dni
    public Persona(String dni) {
        this.dni = dni;
    }
    
    //Metodo comun
    public int correr(){
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y estoy corriendo");
        return 0;
    }
    
    //Sobrecarga del metodo correr
    public void correr(int km){
        System.out.println("Mi documento es "+dni);
        System.out.println("Ya corri " + km + " kilometros");
    }
    
}
