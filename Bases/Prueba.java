/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases;

import ManejoFechas.Fecha;
import java.sql.ResultSet;

/**
 *
 * @author alumno
 */
public class Prueba {
    public static void main(String[] args) {
        ResultSet rs;
        Conectar mic=new Conectar("martes1417");
        String nom,ape,genero,cargo;
        String fnTxt="";
        String fiTxt="";
        int dni,codpro,pre,dv;
        Fecha fNac,fIng;
        fNac=new Fecha("12/12/1967");
        if(fNac.isOk()){
            fnTxt=fNac.getAnio()+"-"+fNac.getMes()+"-"+fNac.getDia();
        }
        
        fIng=new Fecha("6/12/2005");
        if(fIng.isOk()){
            fnTxt=fIng.getAnio()+"-"+fIng.getMes()+"-"+fIng.getDia();
        }
        
        
        cargo="inforamtico";
        dni=39066871;
        pre=21;
        dv=9;
        codpro=2;
        String sqltxt = "insert into empleados"+
                "(dni,genero,codProv,fechanac)"+
                "values("+"'"+cargo+"',"+dni+","+pre+","+dv+","+codpro+","+fIng+")";
        
        mic.ejecutaAccionSql(sqltxt);
        MuestraError.setErr(mic.getError());
        
    }
    
}
