package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User_Bean;
import pedidos_db.DB_Connection;

public class Delete_values {

public void delete_value(String idPedido){
		
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
			
		
		try {
			String query = "delete from pedido where idPedido=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, idPedido);
			ps.executeUpdate();
			
	
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
