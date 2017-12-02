package Bases;
import java.sql.*;
public class Prueba1 {
    public static void main(String[] args) {
        String bd = "cursos";
        String user = "root";
        String password = "";
        String server = "//localhost/";
        String sqltxt;

        Conectar mic = new Conectar(bd, user, password, server);
        ResultSet rs;
        MuestraError.setErrores(mic.getErrores());
        if (mic.getError().equals("ok")) {
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
        sqltxt = "INSERT INTO provincias(nomProv,capital) VALUES ('Mendoza','Mendoza')";
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
