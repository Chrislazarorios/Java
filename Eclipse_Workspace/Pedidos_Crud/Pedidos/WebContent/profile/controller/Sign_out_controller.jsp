<%
	session.removeAttribute("user_session");
// 	session.invalidate();
	
	session.setAttribute("login_message", "Sign out successfull");
%>


<script type="text/javascript">
	window.location.href="http://localhost:9090/Pedidos/index.jsp";
</script>