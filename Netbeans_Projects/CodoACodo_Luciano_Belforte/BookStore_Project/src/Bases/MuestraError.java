package Bases;

import java.util.ArrayList;

public class MuestraError {
    
    public static void setErr(String err) {
        if(err.compareTo("ok")!=0){
            System.out.println(err);
        }
    }

    public static void setErrores(ArrayList<String> errores) {
        for(int i=0;i<errores.size();i++){
            System.out.println(errores.get(i));
        }
    }
    
}
