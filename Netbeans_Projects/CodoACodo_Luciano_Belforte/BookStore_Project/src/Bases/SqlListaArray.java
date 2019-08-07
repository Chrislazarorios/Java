package Bases;

import java.sql.*;

import java.util.ArrayList;

public class SqlListaArray {

    private ArrayList<RenglonSql> renglones = new ArrayList();
    private ArrayList<String> campos = new ArrayList();
    private ResultSet rs;
    private String error;
    private int tamanio = 0;

    public SqlListaArray(ResultSet rs, ArrayList<String> campos) {
        this.rs = rs;
        this.campos = campos;
        this.setRenglones();
    }

    public SqlListaArray(ResultSet rs) {
        this.rs = rs;
    }

    private void setRenglones() {
        RenglonSql reng;
        this.error = "ok";
        this.renglones.clear();
        try {
            while (this.rs.next()) {
                reng = new RenglonSql();
                for (int i = 0; i < this.campos.size(); i++) {
                    reng.agregaCampo(this.rs.getString(this.campos.get(i)));
                }
                this.renglones.add(reng);
                this.tamanio = this.renglones.size();
            }

        } catch (SQLException e) {
            this.error = e.getMessage();
        }
    }

    public void setCampos(ArrayList<String> campos) {
        this.campos = campos;
        this.setRenglones();
    }

    public void agregaCampo(String campo) {
        this.campos.add(campo);
        this.setRenglones();
    }

    public ArrayList<RenglonSql> getRenglones() {
        return renglones;
    }

    public ArrayList<String> getCampos() {
        return campos;
    }

    public ResultSet getRs() {
        return rs;
    }

    public String getError() {
        return error;
    }

    public RenglonSql getRenglon(int noRen) {
        return this.renglones.get(noRen);
    }

    public void listadoCompleto() {
        for (int i = 0; i < this.tamanio; i++) {
            this.renglones.get(i).listaCampos();
            System.out.println("");

        }
    }
}
