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
<h2>Consultas disponibles para departamento de secretaría</h2>

<form action="CitasControlador">
		<input type = "text" name = "paciente"> 
		<input type = "submit"  value= "Buscar información de citas mediante la cedula"> 
	</form>
	<br>
	<form action="InsertarCita.jsp">
<input type = "submit"  value= "Crear una cita medica"> 
	</form>
	<br>
</body>
</html>