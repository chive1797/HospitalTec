<%@page import = "controlador.web.DAO.InsertarUsuarioDAO" %>
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


int cedula = Integer.parseInt(request.getParameter("cedula"));
String contrasena = request.getParameter("contrasena");



InsertarUsuarioDAO insert = new InsertarUsuarioDAO();
insert.insertarUsuario(cedula, contrasena);

%>

<script type="text/javascript">
	alert-success('Agregado correctamente');
</script>

</body>
</html>