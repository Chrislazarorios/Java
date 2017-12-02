package Bases;

import java.util.ArrayList;

public class RenglonSql {
    private  ArrayList<String> campos=new ArrayList();

    public RenglonSql() {
    }
    
    public  void agregaCampo(String campo){
        this.campos.add(campo);
    }

    public  ArrayList<String> getCampos() {
        return campos;
    }
    public  void listaCampos(){
        for(int i=0;i<this.campos.size();i++){
            System.out.print(this.campos.get(i)+" ");
        }
    }
}
