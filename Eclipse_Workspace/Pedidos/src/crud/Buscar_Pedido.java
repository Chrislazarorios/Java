package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.User_Bean;
import pedidos_db.DB_Connection;

public class Buscar_Pedido {
	
	public static void main(String[] args) {
		Buscar_Pedido obj_Buscar_Pedido = new Buscar_Pedido();
		
		obj_Buscar_Pedido.get_values();
	}
	
	
	public List<User_Bean> get_values(){
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<User_Bean> list = new ArrayList<User_Bean>();
		
		
		try {
			String query = "select * from pedido";
			ps = connection.prepareStatement(query);
//			ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User_Bean obj_User_Bean = new User_Bean();
				
				System.out.println(rs.getString("idPedido"));
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("monto"));
				System.out.println(rs.getString("descuento"));
				
				obj_User_Bean.setIdPedido(rs.getString("idPedido"));
//				obj_User_Bean.setIdUser(rs.getString("idUser"));
				obj_User_Bean.setNombre(rs.getString("nombre"));
				obj_User_Bean.setMonto(rs.getString("monto"));
				obj_User_Bean.setDescuento(rs.getString("descuento"));
				
				
				list.add(obj_User_Bean);
				
			}
			
//			rs = ps.getGeneratedKeys();
//			while(rs.next()) {
//				System.out.println("Generated IdPedido : " + rs.getInt(1));
//			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public List<User_Bean> find_values(String idPedido){
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<User_Bean> list = new ArrayList<User_Bean>();
		
		System.out.print("Entre en el find value!!\n");
		
		String query = "select * from Pedido where idPedido=?";
		System.out.print("valor de query : "+ query +"\n");
		try {
			
			
			System.out.print("Entre en el try catch!!\n");
			ps = connection.prepareStatement(query);
			
			ps.setString(1, idPedido);
			rs = ps.executeQuery();
			System.out.print("valor de rs : "+rs+"\n");
			while(rs.next()) {
				
				User_Bean obj_User_Bean = new User_Bean();
				
				obj_User_Bean.setIdPedido(rs.getString("idPedido"));
				obj_User_Bean.setNombre(rs.getString("nombre"));
				obj_User_Bean.setMonto(rs.getString("monto"));
				obj_User_Bean.setDescuento(rs.getString("descuento"));
				
				
				list.add(obj_User_Bean);
				System.out.print("Entre en el while de find value!!\n");
			}
			

			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
}
