package controlador.web.modelo;

/**
 *
 * @author Steven Sánchez
 */
public class Paciente {
    
  private int cedula;
  private String nombre;
  private String tipoDeSangre;
  private String nacionalidad;
  private String residencia;


  public int getCedula() {
    return cedula;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTipoDeSangre() {
    return tipoDeSangre;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setCedula(int Cedula) {
    this.cedula = Cedula;
  }

  public void setNombre(String Nombre) {
    this.nombre = Nombre;
  }

  public void setTipoDeSangre(String TipoDeSangre) {
    this.tipoDeSangre = TipoDeSangre;
  }

  public void setNacionalidad(String Nacionalidad) {
    this.nacionalidad = Nacionalidad;
  }


public String getResidencia() {
	return residencia;
}

public void setResidencia(String residencia) {
	this.residencia = residencia;
}

@Override
public String toString() {
	return "Paciente [cedula=" + cedula + ", nombre=" + nombre + ", tipoDeSangre=" + tipoDeSangre + ", nacionalidad="
			+ nacionalidad + ", residencia=" + residencia + "]";
}

  
  
}