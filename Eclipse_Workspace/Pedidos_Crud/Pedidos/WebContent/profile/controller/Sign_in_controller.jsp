<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import="modal.Login_Modal"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj_Login_Bean" class="bean.Login_Bean"></jsp:useBean>
	<jsp:setProperty property="*" name="obj_Login_Bean"/>
	
	
	<%
		System.out.println(obj_Login_Bean.getUser_name());
		System.out.println(obj_Login_Bean.getPassword());
		
		Login_Modal obj_Login_Modal = new Login_Modal();
		
		boolean flag = obj_Login_Modal.check_user_name(obj_Login_Bean);
		
		if(flag){
// 			out.println(flag + " loggin success");
			session.setAttribute("user_session", obj_Login_Bean);
	
	%>  
			
			<script type="text/javascript">
// 				window.location.href="http://localhost:9090/Pedidos/profile/view/Home.jsp";
				window.location.href="http://localhost:9090/Pedidos/user-home-page/<%=obj_Login_Bean.getUser_name() %>";
			</script>
			
	<%
			
		} else {
// 			out.println(flag + " loggin failed");
			session.setAttribute("login_message", "Wrong user name/password");
			
	%>
			
			<script type="text/javascript">
				window.location.href="http://localhost:9090/Pedidos/index.jsp";
			</script>
			
	<%
	
		}
		
	%>
</body>
</html>