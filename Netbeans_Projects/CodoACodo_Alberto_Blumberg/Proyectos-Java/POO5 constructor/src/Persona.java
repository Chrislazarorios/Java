public class Persona { //iNSTANCIA
    //atributos de clase
    String nombre;
    String apellido;
    int edad;
    int dni;
    
    //Metodo Constructor general SIN PARAMETROS
    public Persona (){    
    }
   /*    
    //Metodo Constructor CON PARAMETROS
    public Persona(String nombre1,String apellido1, int edad1,int dni1){
        nombre = nombre1;
        apellido=apellido1;
        edad=edad1;
        dni=dni1;
    }
    */
//Constructor CON PARAMETRO y uso de THIS
    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
//CONTRUCTOR sobrecargado
    public Persona(int dni) {
        this.dni = dni;
    }
    
    
    
    
    //Metodo para mostrar los datos de los objetos Persona
    public void mostrarDatos(){
        System.out.println("\nNombre: "+nombre+ "\nApllido: "+apellido+"\nEdad: "+ edad+ "\nDNI: "+dni);
    }
    
}
