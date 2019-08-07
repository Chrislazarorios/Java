package Bases;

import java.util.ArrayList;

public class CreaSqlTxt {

    private static String tabla;
    private static ArrayList<String> campos = new ArrayList();
    private static ArrayList<String> valores = new ArrayList();
    private static String condicion;

    public static String creaInsertaSqlTxt(String tabla, ArrayList<String> campos,
            ArrayList<String> valores) {
        CreaSqlTxt.campos = campos;
        CreaSqlTxt.valores = valores;
        CreaSqlTxt.tabla = tabla;
        String texto="insert into "+CreaSqlTxt.tabla+"(";
        if(CreaSqlTxt.campos.size()==CreaSqlTxt.valores.size()){
            String listaCampos=CreaSqlTxt.campos.get(0);
            String listaValores="'"+CreaSqlTxt.valores.get(0)+"'";
            for(int i=1;i<CreaSqlTxt.campos.size();i++){
                listaCampos=listaCampos+","+CreaSqlTxt.campos.get(i);
                listaValores=listaValores+",'"+CreaSqlTxt.valores.get(i)+"'";
            }
            texto=texto+listaCampos+") values("+listaValores+")";
            
        }else{
            texto="no hay la misma cantidad de campos y de valores";
        }
        
        return texto;
    }
   public static String creaModificaSqlTxt(String tabla, ArrayList<String> campos,
            ArrayList<String> valores,String condicion) {
        CreaSqlTxt.campos = campos;
        CreaSqlTxt.valores = valores;
        CreaSqlTxt.tabla = tabla;
        CreaSqlTxt.condicion=" where "+condicion;
        String texto="update "+CreaSqlTxt.tabla+" set ";
         if(CreaSqlTxt.campos.size()==CreaSqlTxt.valores.size()){
             String modifica=CreaSqlTxt.campos.get(0)+"='"+CreaSqlTxt.valores.get(0)+"'";
             for(int i=1;i<CreaSqlTxt.campos.size();i++){
                 
                 modifica=modifica+","+CreaSqlTxt.campos.get(i)+
                         "='"+CreaSqlTxt.valores.get(i)+"'";
                 
             }
             
             texto=texto+modifica+CreaSqlTxt.condicion;
         
         }else{
             texto="no hay la misma cantidad de campos y de valores";
         }
        
        
       return texto; 
    }

}
