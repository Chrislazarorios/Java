package Bases;

import java.sql.*;
import java.util.ArrayList;

public class Conectar {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private String bd;
    private String user;
    private String password;
    private String server;
    private String driver;
    private String error;
    private String sqlTxt;
    private ArrayList<String> errores = new ArrayList();

    public Conectar(String bd, String user, String password, String server) {
        String servicio;
        this.bd = bd;
        this.user = user;
        this.password = password;
        this.server = server;
        this.driver = "jdbc:mysql:";
        this.error = "ok";
        servicio = this.driver + this.server + this.bd;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            this.error = "err Class: " + e.getMessage();
            this.errores.add(this.error);
        }
        if (this.error.equals("ok")) {
            try {
                conexion = DriverManager.getConnection(servicio, this.user, this.password);
            } catch (SQLException e) {
                this.error = "err Conexion: " + e.getMessage();
                this.errores.add(this.error);
            }
        }
        if (this.error.equals("ok")) {
            try {
                this.st = this.conexion.createStatement();
            } catch (SQLException e) {
                this.error = "err Stament: " + e.getMessage();
                this.errores.add(this.error);
            }
        }
    }

    public Conectar() {
        String servicio;
        this.bd = "cursos";
        this.user = "root";
        this.password = "";
        this.server = "//localhost/";
        this.driver = "jdbc:mysql:";
        this.error = "ok";
        servicio = this.driver + this.server + this.bd;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            this.error = "err Class: " + e.getMessage();
            this.errores.add(this.error);
        }
        if (this.error.equals("ok")) {
            try {
                conexion = DriverManager.getConnection(servicio, this.user, this.password);
            } catch (SQLException e) {
                this.error = "err Conexion: " + e.getMessage();
                this.errores.add(this.error);
            }
        }
        if (this.error.equals("ok")) {
            try {
                this.st = this.conexion.createStatement();
            } catch (SQLException e) {
                this.error = "err Stament: " + e.getMessage();
                this.errores.add(this.error);
            }
        }
    }

    public Conectar(String bd) {
        String servicio;
        this.bd = bd;
        this.user = "root";
        this.password = "";
        this.server = "//localhost/";
        this.driver = "jdbc:mysql:";
        this.error = "ok";
        servicio = this.driver + this.server + this.bd;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            this.error = "err Class: " + e.getMessage();
            this.errores.add(this.error);
        }
        if (this.error.equals("ok")) {
            try {
                conexion = DriverManager.getConnection(servicio, this.user, this.password);
            } catch (SQLException e) {
                this.error = "err Conexion: " + e.getMessage();
                this.errores.add(this.error);
            }
        }
        if (this.error.equals("ok")) {
            try {
                this.st = this.conexion.createStatement();
            } catch (SQLException e) {
                this.error = "err Stament: " + e.getMessage();
                this.errores.add(this.error);
            }
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            this.error = "err Conexion close: " + e.getMessage();
            this.errores.add(this.error);
        }
    }

    public void ejecutaAccionSql(String sqlTxt) {
        this.error = "ok";
        this.sqlTxt = sqlTxt;
        try {
            st.executeUpdate(this.sqlTxt);
        } catch (SQLException e) {
            this.error = "err sql consulta: " + e.getMessage();
            this.errores.add(this.error);
        }
    }

    public void creaConsultaSql(String sqlTxt) {
        this.error = "ok";
        this.sqlTxt = sqlTxt;
        try {
            this.rs = st.executeQuery(sqlTxt);
        } catch (SQLException e) {
            this.error = "err sql accion: " + e.getMessage();
            this.errores.add(this.error);
        }

    }

    public Statement getSt() {
        return st;
    }

    public String getBd() {
        return bd;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getServer() {
        return server;
    }

    public String getDriver() {
        return driver;
    }

    public String getSqlTxt() {
        return sqlTxt;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public ResultSet getRs() {
        return rs;
    }

    public ArrayList<String> getErrores() {
        return errores;
    }

    public String getError() {
        return error;
    }



}
