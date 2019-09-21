<%@page import="bean.common_path"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="login_form_css/style.css">
</head>
<body>
<div id="login">

	<form action="register2.jsp" method="post">
<!-- 		user ID : <input type="text" name="idUser"><br><br> -->
		name : <input type="text" name="name"><br><br>
		User name : <input type="text" name="user_name"><br><br>
		Password : <input type="text" name="password"><br><br>
		<input type="submit" value="Registrarse">
	</form>
</div>
</body> 
</html>