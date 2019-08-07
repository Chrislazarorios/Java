/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import ManejoFechas.Fecha;
import ManejoFechas.DifFechas;

/**
 *
 * @author alumno
 */
public class Socio extends Persona{
    
    private static int numSocio = 1;
    private Fecha fechaInscripcion;
    private int categoria;
    private int sumador;
    
    public Socio(String nombre, String apellido, DNI dni) {
        super(nombre, apellido, dni);
        this.sumador = numSocio;
        this.numSocio++;
    }

    public void setCategoria(int categoria) {
        if(edad < 12)
        {
            System.out.println("Categoria infantil");
        }
        else if(edad >= 12 && edad < 18)
        {
            System.out.println("Categoria cadete");
        }
        else if(edad >= 18 && edad < 60)
        {
            System.out.println("Categoria adulto");
        }
        else
        {
            System.out.println("Categoria adulto mayor");
        }
        this.categoria =  categoria;
    }

    
    
    public void setFechaInscripcion(Fecha fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public int getCategoria() {
        return categoria;
    }
    
    
    
    
    
    
    
    
}
