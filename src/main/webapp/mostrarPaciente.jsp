<%@page import="controlador.web.modelo.Paciente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-color: #8B95AF ;}
</style> 
</head>
<body bgcolor = "white">
<h2>Los datos del paciente que usted solicitó son los siguientes:</h2>
	<%
		Paciente a1 = (Paciente)session.getAttribute("paciente");
		out.println(a1);
	%>

	
</body>
</html>