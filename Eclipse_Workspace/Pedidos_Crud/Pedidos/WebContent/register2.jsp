<%@page import="bean.common_path"%>
<%@page import="crud.Crear_Pedido"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	
	
		String idUser = request.getParameter("idUser");
		String name = request.getParameter("name");
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
	
		
		Crear_Pedido obj_Crear_Pedido = new Crear_Pedido();
		
		obj_Crear_Pedido.create_user(idUser, name, user_name, password);
	%>

<script type="text/javascript">
	window.alert("Usuario creado!!");
	window.location.href="<%=common_path.url %>/index.jsp";
</script>
	
	
	
	
	
	
// 		String idUser = request.getParameter("idUser");
// 		session.putValue("idUser", idUser);
// 		String password = request.getParameter("password");
// 		String name = request.getParameter("name");
// 		String user_name = request.getParameter("user_name");
// 		Class.forName("com.mysql.jdbc.Driver");
// 		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedidos_navent", "root", "c1569038460");
// 		Statement st = connection.createStatement();
// 		ResultSet rs;
		
// // 		int i = st.executeUpdate("insert into usuarios values(idUser, password, name, user_name) values(?,?,?,?)");
		
// 		String query = "insert into usuarios values(idUser, password, name, user_name) values(?,?,?,?)";
		
// 		out.println("Registrado");
	%>
	
	<a href="index.jsp">Login</a>
	
</body>
</html>

