<%@page import="bean.common_path"%>
<%@page import="crud.Crear_Pedido"%>
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
// 		String idUser = request.getParameter("idUser");
		String nombre = request.getParameter("nombre");
		String monto = request.getParameter("monto");
		String descuento = request.getParameter("descuento");
	
		
		Crear_Pedido obj_Crear_Pedido = new Crear_Pedido();
		
		obj_Crear_Pedido.insert_values(idPedido, nombre, monto, descuento);
	%>

	<script type="text/javascript">
		window.alert("Pedido creado!!");
		window.location.href="<%=common_path.url %>/user-profile";
	</script>

</body>
</html>