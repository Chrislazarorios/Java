<%@page import="org.json.JSONObject"%>
<%@page import="crud.JsonEncodeDemo"%>
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
		String nombre = request.getParameter("nombre");
		String monto = request.getParameter("monto");
		String descuento = request.getParameter("descuento");
		
		Crear_Pedido obj_Crear_Pedido = new Crear_Pedido();
		boolean montoInt = obj_Crear_Pedido.isParsable(monto);
		boolean descuentoInt = obj_Crear_Pedido.isParsable(descuento);
		
		int idPedido2 = Integer.parseInt(idPedido);
		int monto2 = Integer.parseInt(monto);
		int descuento2 = Integer.parseInt(descuento);
		
		
		boolean ok = true;
		String[] message = new String[5];
		
		if(idPedido == null || idPedido.isEmpty()){
			ok = false;
			message[0] = "id no puede estar vacio";
		}
		
		if(nombre == null || nombre.isEmpty() || nombre.length() > 100){
			ok = false;
			message[1] = "nombre no puede estar vacio";
		}
		
		if(monto == null || monto.isEmpty() || montoInt == false){
			ok = false;
			message[2] = "monto no puede estar vacio";
		}
		
		if(descuento == null || descuentoInt == false){
			ok = false;
			message[3] = "descuento no puede estar vacio";
		}
		
		
		if(ok){
			message[4] = "Pedido guardado exitosamente";
		} else {
			message[5] = "Error, no se pudo guardar el pedido";
		}
		
		JsonEncodeDemo obj_JsonEncodeDemo = new JsonEncodeDemo();
		
		
		String json_string;
		
		JSONObject json_obj = obj_JsonEncodeDemo.encode_json(idPedido2, nombre, monto2, descuento2, message);
		json_string = json_obj.toString();
		
		
		System.out.print(json_string);
	%>

	<script type="text/javascript">
		window.alert("Pedido guardado");
		window.location.href="<%=common_path.url %>/guardar.html";
	</script>
</body>
</html>