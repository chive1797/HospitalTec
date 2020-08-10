<%@page import = "controlador.web.DAO.BorrarCitaDao" %>
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


int paciente = Integer.parseInt(request.getParameter("paciente"));


BorrarCitaDao borrar = new BorrarCitaDao();
borrar.BorrarCita(paciente);

%>

<script type="text/javascript">
	alert-success('Cita eliminada');
	
</script>
Eliminada correctamente


</body>
</html>