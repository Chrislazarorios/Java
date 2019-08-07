/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;
import Personas.*;
import Libreria.Libro;
import Libreria.Venta;
import Sueldos.AdiccionDesc;
import Sueldos.Antiguedad;
import Sueldos.PrimaLibro;
import Sueldos.Sueldo;
import java.text.DecimalFormat;
/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat moneda = new DecimalFormat("'$'###,###.## ");
        
        
        /*Sueldo miS;
        Antiguedad miA;
        PrimaLibro miP;
        Libro Libros[]=new Libro[3];
        AdiccionDesc os=new AdiccionDesc("os", "obra social", 0.03, false);
        AdiccionDesc jub=new AdiccionDesc("jub", "jubialcion", 0.11, false);
        AdiccionDesc adiccionales []=new AdiccionDesc[2];
        AdiccionDesc descuentos []=new AdiccionDesc[2];
       
        descuentos [0]=os;
        descuentos [1]=jub;
        
        Libros [0]=new Libro("libro 1", "autor 1", "editorial",356.89,63);
        Libros [1]=new Libro("libro 1", "autor 1", "editorial",256.80,75);
        Libros [2]=new Libro("libro 1", "autor 1", "editorial",507.12,19);
        miP=new PrimaLibro(132, 0.03, 5);
        miA=new Antiguedad(12, 0.01);
        adiccionales[0]=new AdiccionDesc(miP.getCodAdic(), miP.getDescripcion(),miP.getValor(),miP.getFijo());
        adiccionales[1]=new AdiccionDesc(miA.getCodAdic(),miA.getDescripcion(),miA.getValor(), miA.getFijo());
        

        miS=new Sueldo(17890, adiccionales, descuentos, 236, 22);
        System.out.println("sueldo adicionales: "+moneda.format(miS.getTotAdiccionales()));
        System.out.println("sueldo bruto: "+moneda.format(miS.getBruto()));
        System.out.println("sueldo descuentos: "+moneda.format(miS.getTotDescuentos()));
        System.out.println("sueldo neto: "+moneda.format(miS.getNeto()));
        System.out.println("prima por libros: "+moneda.format(miP.getValor()));
        
        
        //Sueldo sueldoEmp[0] = new Sueldo();
        
        //Venta miVenta[0]= new Venta(Cliente[0].get, codEmpl, codLibros, precios, 0);

*/
        
        DNI DNI1 = new DNI("111");
        Socio socio1 = new Socio("Juan", "Rios", DNI1);
        DNI DNI2 = new DNI("222");
        Socio socio2 = new Socio("Pedro", "Lopez", DNI2);
        
        socio1.setFechNac(12,06,1994);
        socio1.getEdad();
        socio1.setCategoria(socio1.getEdad());
        
        
        
        
        
       
    }
    
}
