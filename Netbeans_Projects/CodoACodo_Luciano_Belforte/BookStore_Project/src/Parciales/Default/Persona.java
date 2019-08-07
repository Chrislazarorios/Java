/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales.Default;

/**
 *
 * @author Usuario
 */
public class Persona {
	 
  private String nombre;
  private String apellido;
  private String dni;
  private String genero;	
  private String fechaNac;

	public Persona (String nombre, String apellido, String dni, String genero, String fechaNac){

	 this.nombre = nombre;
	 this.apellido = apellido;
	 this.dni = dni;
	 this.genero = genero;
	 this.fechaNac = fechaNac;	 
	}

 public String getNombreyApellido(){

	return nombre+" "+apellido;

 } 
 
 public String getdni(){

	return dni;	
 }
}
