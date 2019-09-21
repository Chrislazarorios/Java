package pedidos_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
	public static void main(String[] args) {
		DB_Connection obj_DB_Connection = new DB_Connection();
		
		System.out.println(obj_DB_Connection.getConnection());
	}

	
	public Connection getConnection() {
		Connection connection = null;
		System.out.println("connection called");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedidos_navent","root","c1569038460");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) { 
			e.printStackTrace();
		}
		return connection;
	}
}
