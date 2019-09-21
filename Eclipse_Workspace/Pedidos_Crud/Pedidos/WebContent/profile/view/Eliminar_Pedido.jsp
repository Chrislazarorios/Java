<%@page import="java.util.List"%>
<%@page import="bean.User_Bean"%>
<%@page import="java.util.Iterator"%>
<%@page import="crud.Buscar_Pedido"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="bean.Login_Bean"%>
<%@page import="bean.common_path"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Eliminación de pedidos</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="<%=common_path.url %>/assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="<%=common_path.url %>/assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="<%=common_path.url %>/assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
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
           
          
    <div id="wrapper">
         <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">

                    </a>
                    
                </div>
              
                <span class="logout-spn" >
                  <a href="<%=common_path.url %>/Sign_out_controller" style="color:#fff;">Log Out</a>  

                </span>
            </div>
        </div>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                 


                    <li>
                        <a href="<%=common_path.url %>/user-home-page" ><i class="fa fa-desktop "></i>Home</a>
                    </li>
                    
                    <li >
                        <a href="<%=common_path.url %>/user-profile" ><i class="fa fa-desktop "></i>Crear Pedido</a>
                    </li>
                    
                    <li>
                        <a href="<%=common_path.url %>/user-read" ><i class="fa fa-desktop "></i>Buscar Pedido</a>
                    </li>
                   

                    <li >
                        <a href="<%=common_path.url %>/user-update"><i class="fa fa-qrcode "></i>Modificar Pedido</a>
                    </li>
                    <li class="active-link">
                        <a href="<%=common_path.url %>/user-delete"><i class="fa fa-bar-chart-o"></i>Eliminar Pedido</a>
                    </li>

<!--                     <li> -->
<!--                         <a href="#"><i class="fa fa-edit "></i>Guardar Pedido </a> -->
<!--                     </li> -->
                    
                </ul>
        	</div>
        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-lg-12">
<%--                      <h2>Welcome <%=obj_Login_Bean.getUser_name()%> </h2>    --%>
                    </div> 
                </div>              
                 <!-- /. ROW  -->
                  <hr />
                <div class="row">
                    <div class="col-lg-12 ">
                        <div class="alert alert-info">
<%--                              <strong>Welcome <%=obj_Login_Bean.getUser_name() %>!</strong> --%>
                        </div>
                       
                    </div>
                    </div>
                  <!-- /. ROW  --> 

                 <!-- /. ROW  --> 

				<div style = "text-align:center">
			
					<h1>Eliminar Pedido</h1><br><br>
					
				
					
				 <% 
						Buscar_Pedido obj_Buscar_Pedido = new Buscar_Pedido();
					
						List<User_Bean> list = obj_Buscar_Pedido.get_values();
						
						Iterator<User_Bean> it_list = list.iterator();
				
					%>
					<table border="1" >
						<tr>
							<td>ID_Pedido</td> 
<!-- 							<td>ID_Usuario</td>  -->
							<td>Nombre</td>
							<td>Monto</td> 
							<td>Descuento</td>
							<td>Editar</td>
						</tr>
					
					<% 
					
						while(it_list.hasNext()){
							User_Bean obj_User_Bean = new User_Bean();
							
							obj_User_Bean = it_list.next();
						
					%>
					
						
						<tr>
							<td><%=obj_User_Bean.getIdPedido() %></td> 
<%-- 							<td><%=obj_User_Bean.getIdUser() %></td>  --%>
							<td><%=obj_User_Bean.getNombre() %></td>
							<td><%=obj_User_Bean.getMonto() %></td> 
							<td><%=obj_User_Bean.getDescuento() %></td>
							<td>
								<a href="controller/delete_controller.jsp?idPedido=<%=obj_User_Bean.getIdPedido()%>">Eliminar</a>
							</td>
						</tr>
					
					<% 
						
						}
						
					%>
					
					</table>
				
				</div>

                 <!-- /. ROW  -->   
				  <div class="row">
                    <div class="col-lg-12 ">
					<br/>
                        <div class="alert alert-danger">
                        </div>
                       
                    </div>
                    </div>
                  <!-- /. ROW  --> 
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
    <div class="footer">
      
    
            <div class="row">
                <div class="col-lg-12" >
                </div>
            </div>
        </div>
          

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="<%=common_path.url %>/assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="<%=common_path.url %>/assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="<%=common_path.url %>/assets/js/custom.js"></script>
    
   
</body>
</html>