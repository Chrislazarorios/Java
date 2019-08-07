package Bases;

import java.sql.*;
import java.util.ArrayList;

public class Prueba3 {

    public static void main(String[] args) {
        String bd = "cursos";
        String user = "root";
        String password = "";
        String server = "//localhost/";
        String tabla, condicion, orden;
        ArrayList<String> campos = new ArrayList();
        SqlListaArray listadoTotal;
        String sqlTxt;

        Conectar mic = new Conectar(bd, user, password, server);
        ResultSet rs;
        MuestraError.setErrores(mic.getErrores());
        if (mic.getError().equals("ok")) {
            tabla = "personas";
            campos.add("nombre");
            campos.add("apellido");
            condicion = "nombre='Martín'";
            orden = "apellido,nombre";
            sqlTxt = "select " + campos + " from " + tabla + " " + condicion + " " + orden + ";";

            ListadoSql.setSqlTxt(sqlTxt);
            ListadoSql.setTabla(tabla);
            ListadoSql.setOrden(orden);
            mic.creaConsultaSql(ListadoSql.getSqlTxt());
            MuestraError.setErr(mic.getError());
            if(mic.getError().equals("ok")){
                rs = mic.getRs();
                listadoTotal=new SqlListaArray(rs,campos) ;
                MuestraError.setErr(listadoTotal.getError());
                if(listadoTotal.getError().equals("ok")){
                    listadoTotal.listadoCompleto();
                }
            }
        }

    }

}
