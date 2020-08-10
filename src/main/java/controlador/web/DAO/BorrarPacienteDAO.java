package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BorrarPacienteDAO {
	
public void BorrarPaciente(int cedula){
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			String query = ("Delete from hospitaltec.paciente where hospitaltec.paciente.cedula = ?");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, cedula);
			ps.executeUpdate();
			con.close();
			
		} catch(Exception e){
			System.err.println(e);
		}
				
        }

}
