package controlador.web.modelo;

public class Tratamiento {
		private int id;
	  public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	private String nombre;
	  private int cantidadRecomendada;
	  private String tipo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadRecomendada() {
		return cantidadRecomendada;
	}
	public void setCantidadRecomendada(int cantidadRecomendada) {
		this.cantidadRecomendada = cantidadRecomendada;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Tratamiento [id=" + id + ", nombre=" + nombre + ", cantidadRecomendada=" + cantidadRecomendada
				+ ", tipo=" + tipo + "]";
	}
	

}
