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
</head>
<body>

<center>
<h1> Registrar usuario</h1>

<form action="InsertarUsuarioControlador.jsp">

Cedula: <input type = "text" name = "cedula"><br>
<br>
Contraseña: <input type="password"  name ="contrasena"><br>
<br>

<input type = "submit" value= " Registrar ">

</form>


</center>

</body>
</html>