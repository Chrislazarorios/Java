package Bases;

import java.util.ArrayList;

public class SqlListadoCompleto extends Conectar{
    private ArrayList<String> campos = new ArrayList(); 
    private String tabla;
    private String condicion;
    private String orden;
    
    
    public SqlListadoCompleto(String bd, String user, String password, String server,
            ArrayList<String> campos) {
        super(bd, user, password, server);
        this.campos=campos;
        this.tabla="";
        this.condicion="";
        this.orden="";
    }
    public SqlListadoCompleto(String bd, String user, String password, String server) {
        super(bd, user, password, server);
        this.tabla="";
        this.condicion="";
        this.orden="";
    }

    public void setCampos(ArrayList<String> campos) {
        this.campos = campos;
    }
    public void agregaCampo(String campo) {
        this.campos.add(campo);
    }

    public String getTabla() {
        return tabla;
    }

    public String getCondicion() {
        return condicion;
    }

    public String getOrden() {
        return orden;
    }

    
    
}
