/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/** Como acceder a un atributo privado utiliando getters y setters
 *
 * @author alumno
 */
public class Clase1 {
    private int edad;
    private String nombre;

    public Clase1(int edad) {
        this.edad = edad;
    }
    
    //Metodo setter
    public void setEdad(int edad)
    {
       this.edad = edad; 
    }
    
    //Metodo getter
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
