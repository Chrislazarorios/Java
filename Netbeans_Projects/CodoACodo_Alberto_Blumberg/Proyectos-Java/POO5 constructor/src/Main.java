public class Main {

    public static void main(String[] args) {
        
        Persona persona1 =new Persona();
            persona1.nombre ="Alberto";
            persona1.apellido="Blumberg";
            persona1.edad=52;
            persona1.dni=18470690;
            persona1.mostrarDatos(); //Invocacion del etodo para visualizar los datos
           
      
            //Utiliza el método contructor CON PARAMETROS. Se crea el objeto con parametros
            Persona persona2 = new Persona("Juan", "Sanchez",26,23456789);
            persona2.mostrarDatos();
            
            Persona persona3=new Persona(23345789);
            persona3.mostrarDatos();
            
            
        }
    //ingreso de datos del usuario con SCANNER desde el main
    
    }
    

