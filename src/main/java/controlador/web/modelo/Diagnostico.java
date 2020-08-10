package controlador.web.modelo;

public class Diagnostico {
	private int paciente;
	private int diagnostico;
	private String nivel;
	private String observaciones;
	public int getPaciente() {
		return paciente;
	}
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	public int getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(int diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public String toString() {
		return "Diagnostico [paciente=" + paciente + ", diagnostico=" + diagnostico + ", nivel=" + nivel
				+ ", observaciones=" + observaciones + "]";
	}


}
