<%@page import="controlador.web.modelo.Tratamiento" %>
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
<body>
<h2>Los datos del tratamiento que usted solicitó son los siguientes:</h2>


	<%
		Tratamiento t1 = (Tratamiento)session.getAttribute("tratamiento");
		out.println(t1);
	%>

</body>
</html>