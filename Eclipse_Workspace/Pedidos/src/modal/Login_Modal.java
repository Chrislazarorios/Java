package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Login_Bean;
import pedidos_db.DB_Connection;

public class Login_Modal {
	public boolean check_user_name(Login_Bean obj_Login_Bean) {
		boolean flag = false;
		
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try { // realizamos consulta sql para comprobar que el usuario y contrasena existen
			String query = "select * from usuarios where user_name=? and password=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, obj_Login_Bean.getUser_name());
			ps.setString(2, obj_Login_Bean.getPassword());
			
			System.out.println(ps);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				flag = true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(connection != null) {
					connection.close(); //cerramos conexion
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		return flag;
	}
}
