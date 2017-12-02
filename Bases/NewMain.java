/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bd = "martes1417";
        String user = "root";
        String password = "";
        String server = "//localhost/";
        String sqltxt;
        String tabla,campo,pro,cap;
        
        Scanner teclado=new Scanner(System.in);
        Conectar mic = new Conectar(bd, user, password, server);
        ResultSet rs;
        MuestraError.setErrores(mic.getErrores());
        /*if (mic.getError().equals("ok")) {
            tabla="provincias";
            sqlTxt="SELECT personas.*,provincias.nomprov " +
                    "FROM personas,provincias " +
                    "where personas.codProv=provincias.codProv;";
            mic.creaConsultaSql(sqlTxt);
            MuestraError.setErr(mic.getError());
            rs = mic.getRs();
           
            if (mic.getError().equals("ok")) {
                campo="nomprov";
                try {
                    while (rs.next()) {
                        System.out.println(rs.getString(1)+
                                " "+rs.getString(2));
                    }
                    
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }*/
        System.out.print("Provincia: ");
        pro=teclado.next();
        System.out.print("Capital: ");
        cap=teclado.next();
        sqltxt = "INSERT INTO provincias(nomProv,capital) "
                + "VALUES ('"+pro+"','"+cap+"')";
        mic.ejecutaAccionSql(sqltxt);
        MuestraError.setErr(mic.getError());
        mic.creaConsultaSql("select * from provincias;");
        MuestraError.setErr(mic.getError());
        rs = mic.getRs();
        if (mic.getError().equals("ok")) {
            try {
                while (rs.next()) {
                    System.out.println(rs.getString("nomProv"));
                }
            } catch (SQLException e) {
                    System.out.println(e.getMessage());
            }
        }
        
    }
    

}
