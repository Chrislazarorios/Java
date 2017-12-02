package Bases;

import java.util.ArrayList;

public class ListadoSql {
    private static String tabla="";
    private static ArrayList<String> campos=new ArrayList();
    private static String condicion="";
    private static String orden="";
    private static String sqlTxt="";

    public static String getTabla() {
        return tabla;
    }

    public static void setTabla(String tabla) {
        ListadoSql.sqlTxt="";
        ListadoSql.tabla = tabla;
    }

    public static ArrayList<String> getCampos() {
        return campos;
    }

    public static void setCampos(ArrayList<String> campos) {
        ListadoSql.sqlTxt="";
        ListadoSql.campos = campos;
    }
    public static void agregaCampo(String campo){
        ListadoSql.sqlTxt="";
        ListadoSql.campos.add(campo);
    }
    
    public static String getCondicion() {
        return condicion;
    }

    public static void setCondicion(String condicion) {
        ListadoSql.sqlTxt="";
        ListadoSql.condicion = condicion;
    }

    public static String getOrden() {
        return orden;
    }

    public static void setOrden(String orden) {
        ListadoSql.sqlTxt="";
        ListadoSql.orden = orden;
    }


    public static void setSqlTxt(String sqlTxt) {
        ListadoSql.sqlTxt = sqlTxt;
    }
    
    public static String getSqlTxt() {
        String salida="error";;
        String listadoCampos="*";
        String condicion="";
        String orden="";
        if(ListadoSql.sqlTxt.isEmpty()){
            if(ListadoSql.tabla.compareTo("")!=0){
              if(ListadoSql.campos.size()>0){
                  listadoCampos=ListadoSql.campos.get(0);
                  for(int i=1;i<ListadoSql.campos.size();i++){
                      listadoCampos=listadoCampos+","+ListadoSql.campos.get(i);
                  }
              }
              if(ListadoSql.condicion.compareTo("")!=0){
                  condicion=" where "+ListadoSql.condicion;
              }
              if(ListadoSql.orden.compareTo("")!=0){
                  orden=" order by "+ListadoSql.orden;
              }
              salida="select "+listadoCampos+" from "+ListadoSql.tabla+
                      condicion+orden+";";
            }
        }else{
            salida=ListadoSql.sqlTxt;
        }
        
        return salida;
    }

    
}
