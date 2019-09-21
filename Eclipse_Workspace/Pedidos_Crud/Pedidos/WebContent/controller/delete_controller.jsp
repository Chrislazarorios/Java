<%@page import="crud.Delete_values"%>
<%@page import="bean.common_path"%>
<%@page import="crud.Edit_values"%>
<%@page import="bean.User_Bean"%>
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
		String idPedido = request.getParameter("idPedido");

		Delete_values obj_Delete_values = new Delete_values();
		
		obj_Delete_values.delete_value(idPedido);
		
		
	%>

	<script type="text/javascript">
		window.alert("Pedido eliminado!!");
		window.location.href="<%=common_path .url %>/user-delete";
	</script>


</body>
</html>