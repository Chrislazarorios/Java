package Principal;

import Libreria.*;
import Personas.*;
import Sueldos.*;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat moneda=new DecimalFormat("'$'###,###.##");
        Sueldo miS;
        Antiguedad miA;
        PrimaLibro miP;
        Libro libros[]=new Libro[3];
        AdiccionDesc descuentos[]=new AdiccionDesc[2] ;
        AdiccionDesc adiccionales[]=new AdiccionDesc[2] ;
        
        AdiccionDesc os=new AdiccionDesc("os","Obra Social",0.03,false);
        AdiccionDesc jub=new AdiccionDesc("ju","Jubilación",0.11,false);
        descuentos[0]=os;
        descuentos[1]=jub;
        libros[0]=new Libro("Libro1","Autor1","Editora",356.89, 5);
        libros[1]=new Libro("Libro2","Autor2","Editora",256.80, 4);
        libros[2]=new Libro("Libro3","Autor3","Editora",507.12, 3);
        Cliente miC=new Cliente("C001","pepe","alonzo",23456783);
        miC.setDesc(0.05);
        Empleado miE=new Empleado("Norberto","Casas",34567812);
        miE.setFechaIng("12/03/2010");
        Venta miV=new Venta(miC,miE,libros);
        miP=new PrimaLibro(libros,0.01);
        miA =new Antiguedad(miE.getAntiguedad(),0.01);
        adiccionales[0]=new AdiccionDesc(miP.getCodAdic(),miP.getDescripcion(),
        miP.getPrimaTotal(),true);
        adiccionales[1]=new AdiccionDesc(miA.getCodAdic(),miA.getDescripcion(),
        miA.getPorcTotal(),false);
        miS=new Sueldo(17890, adiccionales, descuentos, 236, 22);
        miE.setSueldoempl(miS);
        System.out.println("Sueldo adiccionales:"+
                moneda.format(miS.getTotAdiccionales()));
        System.out.println("Sueldo bruto:"+
                moneda.format(miS.getBruto()));
        System.out.println("Sueldo descuentos:"+
                moneda.format(miS.getTotDescuentos()));
        System.out.println("Sueldo neto:"+
                 moneda.format(miS.getNeto()));
        System.out.println("Prima por libros "+
                 moneda.format(miP.getPrimaTotal()));
        
        System.out.println("Venta :"+miC.getApellido()+" gastó "+
                moneda.format(miV.getTotal())+" vendido por "+
                miE.getApellido());
    }
}