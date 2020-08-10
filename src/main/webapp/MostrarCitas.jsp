<%@page import="controlador.web.modelo.Cita"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
body{background-color: #8B95AF ;}
</style> 
</head>
<body> 

<h2>Los datos de la cita que usted solicitó son los siguientes:</h2>


			<%
				Cita c1 = (Cita)session.getAttribute("cita");
				out.println(c1);
			%>


</body>
</html>