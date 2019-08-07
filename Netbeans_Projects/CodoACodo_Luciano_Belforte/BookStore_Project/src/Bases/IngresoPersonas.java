package Bases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class IngresoPersonas {

    public static void main(String[] args) {
        Scanner teclado2 = new Scanner (System.in).useDelimiter("\n");
        Scanner teclado = new Scanner(System.in);
        Conectar mic = new Conectar("martes1417");
        ResultSet rs;
        String nom, ape, sqltxt, valores, seguir = "N";
        String nompro,capital;
        int dni, edad, codPro, maxCP = 0;
        boolean existe = false;
        do {
            System.out.println("Ingresar una persona");
            System.out.print("Nombre: ");
            nom = teclado.next();
            System.out.print("Apellido: ");
            ape = teclado.next();
            do {
                System.out.print("DNI: ");
                dni = teclado.nextInt();

                mic.creaConsultaSql("select * from personas where dni=" + dni);
                rs = mic.getRs();
                try {
                    existe = rs.next();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                if (existe) {
                    System.out.println("El DNI " + dni
                            + " ya fue ingresado,"
                            + "intentar nuevamente?(S/N)");
                    seguir = teclado.next();
                } else {
                    seguir = "N";
                }
            } while (seguir.equalsIgnoreCase("S"));
            if (existe == false) {
                System.out.print("Edad: ");
                edad = teclado.nextInt();

                do {
                    mic.creaConsultaSql("select * from provincias");
                    rs = mic.getRs();
                    System.out.println("Código de provincia: ");
                    try {
                        while (rs.next()) {
                            maxCP = rs.getInt("codProv");
                            System.out.println(rs.getString("codProv")
                                    + " - " + rs.getString("nomprov"));
                        }
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                    codPro = teclado.nextInt();
                    if (codPro >= 1 && codPro <= maxCP) {
                        seguir = "N";
                        valores = "'" + nom + "','"
                                + ape + "'," + dni + ","
                                + edad + "," + codPro;
                        sqltxt = "insert into personas values("
                                + valores + ")";
                        mic.ejecutaAccionSql(sqltxt);
                    } else {
                        System.out.println("El código ingresado es"
                                + " incorrecto"
                                + " intentar nuevamente?(S/N) "+
                                "O ingresar una nueva provincia?(I)");
                        seguir = teclado.next();
                    }
                    if(seguir.equalsIgnoreCase("I")){
                        System.out.print("Nombre de provincia: ");
                        nompro=teclado.next();
                        System.out.print("Capital: ");
                        capital=teclado2.nextLine();
                        maxCP=maxCP+1;
                        valores = maxCP+",'" + nompro + "','"+capital+"'";
                        sqltxt = "insert into provincias "+
                                "values("+valores+")";
                        mic.ejecutaAccionSql(sqltxt);
                        seguir="S";
                    }
                } while (seguir.equalsIgnoreCase("S"));
            }
            System.out.println("Ingresar otra persona?(S/N)");
            seguir = teclado.next();
        } while (seguir.equalsIgnoreCase("S"));
    }

}
