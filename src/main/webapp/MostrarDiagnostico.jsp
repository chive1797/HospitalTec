<%@page import="controlador.web.modelo.Diagnostico"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-color: #B2D8DD;}
</style>
</head>
<body>

<h2>Los datos del diagnostico que usted solicitó son los siguientes:</h2>


			<%
				Diagnostico c1 = (Diagnostico)session.getAttribute("diagnostico");
				out.println(c1);
				
			%>


</body>
</html>