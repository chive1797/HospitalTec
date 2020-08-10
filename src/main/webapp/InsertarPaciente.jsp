<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-color: #8B95AF;}
</style> 
</head>
<body>

<center>
<h1> Insertar valores del paciente</h1>

<form action="InsertarPacienteControlador.jsp">

Cedula: <input type = "text" name = "cedula"><br>
<br>
Nombre: <input type = "text" name ="nombre"><br>
<br>
Tipo de sangre: <input type name ="sangre"= "text"><br>
<br>
Nacionalidad: <input type = "text"name ="nacionalidad"><br>
<br>
Residencia: <input type = "text" name ="residencia"><br>
<br>

<input type = "submit" value= "insertar">

</form>


</center>


</body>
</html>