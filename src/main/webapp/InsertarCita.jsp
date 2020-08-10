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
<center>
<h1> Insertar valores del paciente</h1>

<form action="InsertarCitaControlador.jsp">

Identificador: <input type = "text" name = "identificador"><br>
<br>
Paciente: <input type = "text" name ="paciente"><br>
<br>
Area medica: <input type name ="area"= "text"><br>
<br>
Fecha y hora: <input type = "text"name ="fechaHora"><br>
<br>
Observaciones: <input type = "text" name ="observacion"><br>
<br>

<input type = "submit" value= "insertar">

	<br>
<h3> Eliminar una cita solicitud de cita médica</h3>	
	<form action="BorrarCitaControlador.jsp">

	Cedula del paciente: <input type = "text" name = "paciente"> <br> <input type = "submit" value= "Borrar cita">

	</form>
	

</form>



</center>

</body>
</html>