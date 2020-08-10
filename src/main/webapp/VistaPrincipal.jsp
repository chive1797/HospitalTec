<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-color: #B2D8DD ;}
</style> 
</head>
<body>
<center>
<h1>Bienvenido</h1>
<h3>Estas son las opciones disponibles en la plataforma:</h3>


	<form action="PacienteController">
		<input type = "text" name = "cedula"> 
		<input type = "submit"  value= "Buscar datos de un paciente por medio de su cedula"> 
	</form>
	<br>
	<form action="Tratamiento">
		<input type = "text" name = "id"> 
		<input type = "submit"  value= "Buscar un tratamiento por medio de su identificador">
	</form>
	<br>
	<form action="VistaDoctor.jsp">
		<input type = "submit"  value= "Opción Doctor"> 
	</form>
	<br>
	<form action="VistaPaciente.jsp">
		<input type = "submit"  value= "Opción Paciente"> 
	</form>
		<br>
	<form action="VistaSecretaria.jsp">
		<input type = "submit"  value= "Opción Secretaría"> 
	</form>
	<br>
	<form action="VistaEnfermero.jsp">
		<input type = "submit"  value= "Opción Enfermería"> 
	</form>

</center>
</body>
</html>