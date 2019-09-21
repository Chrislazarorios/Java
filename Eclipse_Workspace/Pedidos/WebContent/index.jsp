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
		<form action="profile/controller/Sign_in_controller.jsp" method="post">
			<span>
	  			<%  
					String message =(String)session.getAttribute("login_message");
					
					if(message != null){
						out.println(message);
						session.removeAttribute("login_message");
					}
				%>
  			</span>
    		<h1>Sign In</h1>
    		<input type="text" placeholder="Username" name="user_name">
    		<input type="password" placeholder="Password" name="password">
    		<button  type="submit" value="Submit">Sign In</button><br><br>
    		<a href="<%=common_path.url %>/user-register">Register</a>
  		</form>
  		
  		
  		
	</div>
	
	
</body> 
</html>