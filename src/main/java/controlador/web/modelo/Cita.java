package controlador.web.modelo;

public class Cita {
	  private int identificador;
	  private int paciente;
	  private String area;
	  private String fechaHora;
	  private String observacion;
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getPaciente() {
		return paciente;
	}
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	@Override
	public String toString() {
		return "Cita [identificador=" + identificador + ", paciente=" + paciente + ", area=" + area + ", fechaHora="
				+ fechaHora + ", observacion=" + observacion + "]";
	}
}
