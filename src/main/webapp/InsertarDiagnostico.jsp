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
<center>
<h1> Insertar valores del paciente</h1>

<form action="InsertarDiagnosticoControlador.jsp">

Cedula paciente: <input type = "text" name = "paciente"><br>
<br>
Nivel de diagnostico(1 leve, 2 grave, 3 muy grave ): <input type = "text" name ="diagnostico"><br>
<br>
Nivel atención: <input type name ="nivel"= "text"><br>
<br>
Observaciones: <input type = "text" name ="observaciones"><br>
<br>

<input type = "submit" value= "insertar">




</body>
</html>