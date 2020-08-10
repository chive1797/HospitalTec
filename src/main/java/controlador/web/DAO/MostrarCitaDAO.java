package controlador.web.DAO;

import java.sql.*;
import controlador.web.modelo.Cita;


public class MostrarCitaDAO  {
	
	public Cita mostrarCita(int paciente) {
		
		Cita c = new Cita();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hospitaltec.cita where paciente = " + paciente);
			if(rs.next())
			{
				c.setIdentificador(rs.getInt("identificador"));
				c.setPaciente(rs.getInt("paciente"));
				c.setArea(rs.getString("area"));
				c.setFechaHora(rs.getString("fechaHora"));
				c.setObservacion(rs.getString("observacion"));

			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		return c;

}
	}
