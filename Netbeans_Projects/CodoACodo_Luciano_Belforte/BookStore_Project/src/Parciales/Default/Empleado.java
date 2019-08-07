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
public class Empleado extends Persona{
 
  private int prefijo;
  private int digitoVerificador;
  private String fechaIng;	
	
	public Empleado (String nombre, String apellido, String dni, String genero, String fechaNac, int prefijo, int digitoVerificador, String fechaIng){
	 
	 super (nombre, apellido, dni, genero,fechaNac);
	
	  this.prefijo = prefijo;
	  this.digitoVerificador = digitoVerificador;		 
	  this.fechaIng = fechaIng;

	}	

  public String getDame_Cuil(){
 
	return prefijo+"-"+getdni()+"-"+digitoVerificador;
  }	

}

