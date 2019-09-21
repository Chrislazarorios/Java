package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import bean.User_Bean;
import pedidos_db.DB_Connection;

public class Edit_values {
	
	
	public User_Bean get_value_of_user(String idPedido){
		
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		User_Bean obj_User_Bean = new User_Bean();		
		
		try {
			String query = "select * from pedido where idPedido=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, idPedido);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				obj_User_Bean.setIdPedido(rs.getString("idPedido"));
				obj_User_Bean.setNombre(rs.getString("nombre"));
				obj_User_Bean.setMonto(rs.getString("monto"));
				obj_User_Bean.setDescuento(rs.getString("descuento"));
								
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return obj_User_Bean;
	}
	
	
	
	
public void edit_user(User_Bean obj_User_Bean){
		
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		
		
		try {
			String query = "update Pedido set nombre=?, monto=?,descuento=? where idPedido=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, obj_User_Bean.getNombre());
			ps.setString(2, obj_User_Bean.getMonto());
			ps.setString(3, obj_User_Bean.getDescuento());
			ps.setString(4, obj_User_Bean.getIdPedido());
			ps.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
