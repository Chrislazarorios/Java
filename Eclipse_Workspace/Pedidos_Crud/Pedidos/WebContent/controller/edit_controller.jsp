<%@page import="crud.Edit_values"%>
<%@page import="bean.User_Bean"%>
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
	
		User_Bean obj_User_Bean = new User_Bean();
		
		obj_User_Bean.setIdPedido(idPedido);
		obj_User_Bean.setNombre(nombre);
		obj_User_Bean.setMonto(monto);
		obj_User_Bean.setDescuento(descuento);
		
		
		Edit_values obj_Edit_values = new Edit_values();
		
		obj_Edit_values.edit_user(obj_User_Bean);
		
		
	%>

	<script type="text/javascript">
		window.alert("Pedido modificado!!");
		window.location.href="<%=common_path.url %>/user-update";
	</script>

</body>
</html>