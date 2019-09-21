<%@page import="bean.common_path"%>
<%@page import="bean.Login_Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pedidos guardados</title>
</head>
<body>

	<%
			Login_Bean obj_Login_Bean=(Login_Bean)session.getAttribute("user_session");
			if(obj_Login_Bean == null){
			session.setAttribute("login_message", "Session expired, please log in");
	
	%> 
			<script type="text/javascript">
				window.location.href="http://localhost:9090/Pedidos/index.jsp";
			</script>
	<% 
		}
	%>
	
	
	<center>
		<h1>Pedidos Guardados</h1>
	
	
		<table border="1">
			<tr>
<!-- 			<td><a href="Home.jsp">Home</a></td> -->
			<td><a href="<%=common_path.url %>/user-home-page">Home</a></td>
<!-- 			<td><a href="guardar.jsp">Guardar Pedidos</a></td> -->
			<td><a href="<%=common_path.url %>/user-profile">Hacer Pedidos</a></td>
			<td>Welcome <%=obj_Login_Bean.getUser_name() %></td>
			<td>
<!-- 				<a href="../controller/Sign_out_controller.jsp">Log Out</a> -->
				<a href="http://localhost:9090/Pedidos/Sign_out_controller">Log Out</a>
			</td>
			</tr>
		</table>
	
	</center>
</body>
</html>