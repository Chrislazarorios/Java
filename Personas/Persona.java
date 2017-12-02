package Personas;

import ManejoFechas.Fecha;
import ManejoFechas.DifFechas;

public class Persona {
    private String nombre;
    private String apellido;
    private DNI dni;
    private Fecha fechNac;
    int edad=0;
    private boolean okNac;
    private DifFechas edadcompleto;
	private String genero,nacionalidad;
    //se crea dos constructores, uno con dni y otro sin
   
    public Persona(String nombre, String apellido, DNI dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
	// se crean tres seter para la fecha de nacimiento, como calse fecha, como string y como dia,mes y a�o
    public void setFechNac(int dia,int mes,int anio) {
        Fecha fec=new Fecha(dia,mes,anio);
        if(fec.isOk()){
            this.fechNac=fec;
            this.setEdadcompleto();
        }
        this.okNac=fec.isOk();
    }

    public void setFechNac(String fechNac) {
        Fecha fec=new Fecha(fechNac);
        if(fec.isOk()){
            this.fechNac=fec;
            this.setEdadcompleto();
        }
        this.okNac=fec.isOk();
    }

    public void setFechNac(Fecha fechNac) {
        
        if(fechNac.isOk()){
            this.fechNac=fechNac;
            this.setEdadcompleto();
        }
        this.okNac=fechNac.isOk();
    }
	//se calcula la diferencia entre la fecha de naciemiento y la actualidad con la calse DifFechas
    private void setEdadcompleto() {
        
        this.edadcompleto = new DifFechas(this.fechNac);
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setGenero(String genero) {
		// para el ingreso del genero se acepta la palabra completa o la inicial
        if(genero.equalsIgnoreCase("Femenino")|| genero.equalsIgnoreCase("F")){
			this.genero = "Femenino";
		}else if (genero.equalsIgnoreCase("Masculino")|| genero.equalsIgnoreCase("M")){		
			this.genero = "Masculino";
		}else{
			this.genero = "S/D";
		}	
		
    }
	
	
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public DNI getDni() {
        return dni;
    }

    public Fecha getFechNac() {
        return fechNac;
    }

    public boolean isOkNac() {
        return okNac;
    }
	//se retorna la edad
    public int getEdad() {
        this.edad=edadcompleto.getDifAnios();
        return edad;
    }
	// se retorna la diferencia entre fecha bnac y actualidad
    public DifFechas getEdadcompleto() {
        return edadcompleto;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getGenero() {
        return genero;
    }

    
}
