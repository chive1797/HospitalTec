<%@page import = "controlador.web.DAO.InsertarCitaDAO" %>
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


int identificador = Integer.parseInt(request.getParameter("identificador"));
int paciente = Integer.parseInt(request.getParameter("paciente"));
String area = request.getParameter("area");
String fechaHora = request.getParameter("fechaHora");
String observacion = request.getParameter("observacion");


InsertarCitaDAO insert = new InsertarCitaDAO();
insert.insertarCita(identificador,paciente, area, fechaHora, observacion);



/*PacienteDAO insert = new PacienteDAO();
insert.insertarPaciente(cedula, nombre, fechaNacimiento, sangre, nacionalidad, residencia);*/

%>

Cita registrada correctamente

</body>
</html>