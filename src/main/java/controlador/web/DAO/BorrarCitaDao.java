package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BorrarCitaDao {
	
public void BorrarCita(int paciente){
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			String query = ("Delete from hospitaltec.cita where hospitaltec.cita.paciente = ?");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, paciente);
			ps.executeUpdate();
			con.close();
			
		} catch(Exception e){
			System.err.println(e);
		}
				
        }

		
}

