<html>
<body>
<style>
body{background-color: #C0BAB8;}
</style> 
<h2>Consultas disponibles</h2>
	<form action="VistaPaciente.jsp">
		<input type = "submit"  value= "Paciente"> 
		<br>
	</form>
	
	<form action="VistaSecretaria.jsp">
	<input type = "submit"  value= "Secretaría"> 
	
	</form>
	
	
	<form action="InsertarPaciente.jsp">
	<input type = "submit"  value= "Insertar un nuevo paciente"> 
	
	</form>
	
	<br>
		<form action="PacienteController">
		<input type = "text" name = "cedula"> 
		<input type = "submit"  value= "buscar datos de un paciente"> 
	</form>
	<br>
	<form action="Tratamiento">
		<input type = "text" name = "id"> 
		<input type = "submit"  value= "buscar por id de tratamiento"> 
	</form>
	
	
	
</body>
</html>
