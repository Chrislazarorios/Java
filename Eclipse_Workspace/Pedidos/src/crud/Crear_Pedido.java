package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.ParseException;

import pedidos_db.DB_Connection;

public class Crear_Pedido {
	public void insert_values(String idPedido, String nombre, String monto, String descuento) {
		
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		
		try {
			String query = "insert into pedido(idPedido, nombre, monto, descuento) values(?,?,?,?)";
			
			ps = connection.prepareStatement(query);
//			ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, idPedido);
//			ps.setString(2, idUser);
			ps.setString(2, nombre);
			ps.setString(3, monto);
			ps.setString(4, descuento);
			
			
			
//			ResultSet rs = ps.getGeneratedKeys();
//			while(rs.next()) {
//				System.out.println("Generated IdPedido : " + rs.getInt(1));
//			}
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
public void create_user(String idUser, String name, String user_name, String password) {
		
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		
		try {
			String query = "insert into usuarios(idUser, name, user_name, password) values(?,?,?,?)";
			
			ps = connection.prepareStatement(query);
			
			ps.setString(1, idUser);
			ps.setString(2, name);
			ps.setString(3, user_name);
			ps.setString(4, password);
			
			
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}



	public boolean isParsable(String input){
	    try{
	        Integer.parseInt(input);
	        return true;
	    }catch(Exception e){
	        return false;
	    }
	}
}


