<%@page import = "controlador.web.DAO.InsertarPacienteDAO" %>
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
String nombre = request.getParameter("nombre");
String sangre = request.getParameter("sangre");
String nacionalidad = request.getParameter("nacionalidad");
String residencia = request.getParameter("residencia");


InsertarPacienteDAO insert = new InsertarPacienteDAO();
insert.insertarPaciente(cedula, nombre, sangre, nacionalidad, residencia);



/*PacienteDAO insert = new PacienteDAO();
insert.insertarPaciente(cedula, nombre, fechaNacimiento, sangre, nacionalidad, residencia);*/

%>

Paciente registrado de manera correcta

</body>
</html>