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
<h2>Consultas disponibles para departamento de secretar�a</h2>

<form action="CitasControlador">
		<input type = "text" name = "paciente"> 
		<input type = "submit"  value= "Buscar informaci�n de citas mediante la cedula"> 
	</form>
	<br>
	<form action="InsertarCita.jsp">
<input type = "submit"  value= "Crear una cita medica"> 
	</form>
<h3> Eliminar una solicitud de cita m�dica</h3>	
	<form action="BorrarCitaControlador.jsp">

	Cedula del paciente: <input type = "text" name = "paciente"> <br> <input type = "submit" value= "Borrar cita">

	</form>
	<br>
<h3> Eliminar un paciente</h3>	
	<form action="BorrarPacienteControlador.jsp">

	Cedula del paciente: <input type = "text" name = "cedula"> <br> <input type = "submit" value= "Borrar paciente">

	</form>
</body>
</html>