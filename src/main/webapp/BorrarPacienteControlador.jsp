<%@page import = "controlador.web.DAO.BorrarPacienteDAO" %>
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


BorrarPacienteDAO borrar = new BorrarPacienteDAO();
borrar.BorrarPaciente(cedula);

%>

<script type="text/javascript">
	alert-success('Paciente eliminado de la base de datos');
	
</script>
Paciente eliminado de la base de datos
</body>
</html>