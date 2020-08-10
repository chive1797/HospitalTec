package controlador.web.modelo;

public class Usuario {
	private String cedula;
	private String contrasena;
	
	public String getUsuario() {
		return cedula;
	}
	public void setUsuario(String cedula) {
		this.cedula = cedula;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasenna(String contrasena) {
		this.contrasena = contrasena;
	}
	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", contrasena=" + contrasena + "]";
	}
		
}
