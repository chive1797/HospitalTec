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
<style>
body{background-color: #C0BAB8;}
</style> 
</head>
<body>

<h2>Consultas disponibles para pacientes</h2>
	<form action="PacienteController">
		<input type = "text" name = "cedula"> 
		<input type = "submit"  value= "buscar datos de un paciente"> 
	</form>
	<br>
<form action="CitasControlador">
		<input type = "text" name = "paciente"> 
		<input type = "submit"  value= "Buscar información de citas mediante la cedula"> 
	</form>
	<br>
	<form action="InsertarCita.jsp">
<input type = "submit"  value= "Solicitar una cita médica"> 
	</form>

</body>
</html>