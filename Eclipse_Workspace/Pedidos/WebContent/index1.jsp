<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h3>Login</h3>
		<form action="profile/controller/Sign_in_controller.jsp" method="post">
		Enter User Name
		<input type="text" name="user_name">
		<br><br>
		Enter Password
		<input type="password" name="password">
		<br><br>
		<input type="submit" value="Submit">
		</form>
		
		<%  
			String message =(String)session.getAttribute("login_message");
		
			if(message != null){
				out.println(message);
				session.removeAttribute("login_message");
			}
			
		%>
	</center>

</body>
</html>