package Bases;

import java.sql.*;
import java.util.ArrayList;

public class Prueba2 {

    public static void main(String[] args) {
        String bd = "cursos";
        String user = "root";
        String password = "";
        String server = "//localhost/";
        String tabla, condicion, orden;
        ArrayList<String> campos = new ArrayList();
        RenglonSql reng;
        ArrayList<RenglonSql> renglones = new ArrayList();
        
        String sqlTxt;

        Conectar mic = new Conectar(bd, user, password, server);
        ResultSet rs;
        MuestraError.setErrores(mic.getErrores());
        if (mic.getError().equals("ok")) {
            tabla = "personas";
            campos.add("nombre");
            campos.add("apellido");
            condicion = "nombre='Martín'";
            orden = "apellido Desc,nombre";
            sqlTxt = "select " + campos + " from " + tabla + " " + condicion + " " + orden + ";";

            ListadoSql.setSqlTxt(sqlTxt);
            ListadoSql.setTabla(tabla);
            //ListadoSql.agregaCampo("apellido");
            //ListadoSql.agregaCampo("nombre");
            ListadoSql.setCampos(campos);
            //ListadoSql.setCondicion(condicion);
            ListadoSql.setOrden(orden);
            System.out.println(ListadoSql.getSqlTxt());

            mic.creaConsultaSql(ListadoSql.getSqlTxt());
            MuestraError.setErr(mic.getError());
            rs = mic.getRs();
            try {
                while(rs.next()){
                    reng=new RenglonSql();
                    for(int i=0;i<campos.size();i++){
                        reng.agregaCampo(rs.getString(campos.get(i)));
                    }
                    renglones.add(reng);
                }
                
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            for(int i=0;i<renglones.size();i++){
                renglones.get(i).listaCampos();
                System.out.println("");
            }
        }

    }

}
