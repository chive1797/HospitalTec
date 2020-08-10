package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import controlador.web.modelo.Diagnostico;

public class MostrarDiagnosticoDAO {
	public Diagnostico mostrarDiagnostico(int paciente) {
		
		Diagnostico c = new Diagnostico();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hospitaltec.paciente_diagnostico where paciente = " + paciente);
			if(rs.next())
			{
				c.setPaciente(rs.getInt("paciente"));
				c.setDiagnostico(rs.getInt("diagnostico"));
				c.setNivel(rs.getString("nivel"));
				c.setObservaciones(rs.getString("observaciones"));

			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		return c;

}

}
