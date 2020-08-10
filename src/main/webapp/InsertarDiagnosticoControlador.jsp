<%@page import = "controlador.web.DAO.InsertarDiagnosticoDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-color: #C0BAB8;}
</style> 
</head>
<body>
<%


int paciente = Integer.parseInt(request.getParameter("paciente"));
int diagnostico = Integer.parseInt(request.getParameter("diagnostico"));
String nivel = request.getParameter("nivel");
String observaciones = request.getParameter("observaciones");


InsertarDiagnosticoDAO insert = new InsertarDiagnosticoDAO();
insert.insertarDiagnostico(paciente,diagnostico, nivel, observaciones);


%>

Diagnostico registrado correctamente


</body>
</html>