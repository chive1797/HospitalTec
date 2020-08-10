package controlador.web.DAO;
import java.sql.*;

import controlador.web.modelo.Paciente;

public class PacienteDAO {
	
	
	public Paciente mostrarPaciente(int cedula){
		
		Paciente a = new Paciente();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hospitaltec.paciente where cedula = " + cedula);
			if(rs.next())
			{
				a.setCedula(rs.getInt("cedula"));
				a.setNombre(rs.getString("nombre"));
				a.setTipoDeSangre(rs.getString("sangre"));
				a.setNacionalidad(rs.getNString("nacionalidad"));
				a.setResidencia(rs.getNString("residencia"));
				
			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		return a;
	}
	
	

}
