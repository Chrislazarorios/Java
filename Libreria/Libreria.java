package Libreria;
import Personas.*;
import Sueldos.*;
public class Libreria  {
	public static void main (String [ ] args) {
		Libro libros[]=new Libro[3];
		AdiccionDesc adiccionales[]=new AdiccionDesc[2];
		AdiccionDesc descuentos[]=new AdiccionDesc[2];
		Antiguedad miAntiguedad;
		PrimaLibro miPrima;
		Sueldo miSueldo;
		Cliente clientes[]=new Cliente[2];
		Venta ventas[]=new Venta[2];

		int[] codLibros1=new int[2];
		int[] codLibros2=new int[1];
		double[] precios1=new double[2];
		double[] precios2=new double[1];
		
		double precioTotal;
		
		int cantLibros;
		
                DNI DNI1 = new DNI("28697841");
		Empleado miEmpleado= new Empleado("Juan", "Galiardi", DNI1);
		miEmpleado.setFechaIng(7,8,2005);
		miEmpleado.setCodEmpl("DER");
		
		miAntiguedad= new Antiguedad(miEmpleado.getAntiguedad(),0.01);
		
		descuentos[0]=new AdiccionDesc("OS", "Obra Social",  0.05,false);
		descuentos[1]=new AdiccionDesc("JU", "Jubilaci�n",  0.09,false);
		
		libros[0]=new Libro("Libro1","Autor1","Edita",135.58,25);
		libros[1]=new Libro("Libro2","Autor2","Edita",523.69,68);
		libros[2]=new Libro("Libro3","Autor3","Edita",258,96);
		
                
                DNI DNI2 = new DNI("25896371");
                DNI DNI3 = new DNI("36915237");
		clientes[0]=new Cliente("VA34", "Arturo", "P�rez", DNI2);
		clientes[1]=new Cliente("VF29", "Mar�a", "Gonzales", DNI3);
		clientes[0].setDesc(0.10);
		
		codLibros1[0]=libros[1].getCodLibro();
		codLibros1[1]=libros[2].getCodLibro();
		precios1[0]=libros[1].getPrecio();
		precios1[1]=libros[2].getPrecio();
		
		ventas[0]=new Venta(clientes[0].getCodCliente(),miEmpleado.getCodEmpl(),
                        codLibros1,precios1,clientes[0].getDesc());
		
		
		codLibros2[0]=libros[1].getCodLibro();
		precios2[0]=libros[1].getPrecio();
		
		ventas[1]=new Venta(clientes[1].getCodCliente(),miEmpleado.getCodEmpl(),
                        codLibros2,precios2,clientes[1].getDesc());
		
		cantLibros=ventas[0].getCantLibros()+ventas[1].getCantLibros();
		precioTotal=ventas[0].getVentaTotal()+ventas[1].getVentaTotal();
		miPrima=new PrimaLibro (precioTotal, 0.05,cantLibros);
		
		adiccionales[0]=new AdiccionDesc(miAntiguedad.getCodAdic(), 
                        miAntiguedad.getDescripcion(),miAntiguedad. getValor(),miAntiguedad.getFijo());
		adiccionales[1]=new AdiccionDesc(miPrima.getCodAdic(), 
                        miPrima.getDescripcion(),miPrima. getValor(),miPrima.getFijo());
		
		miSueldo=new Sueldo (18859, adiccionales, descuentos, 351,21);
		miEmpleado.setSueldoempl(miSueldo);
                System.out.println(miEmpleado.getSueldoempl().getTotAdiccionales());
                System.out.println(miEmpleado.getSueldoempl().getBruto());
                System.out.println(miEmpleado.getSueldoempl().getTotDescuentos());
                System.out.println(miEmpleado.getSueldoempl().getNeto());
                System.out.println(miEmpleado.getSueldoempl().getNeto());
    }

}	
