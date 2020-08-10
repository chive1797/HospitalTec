package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertarDiagnosticoDAO {
	public void insertarDiagnostico(int paciente, int diagnostico, String nivel , String observaciones){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			
				
			String query = "INSERT INTO `hospitaltec`.`paciente_diagnostico` (`paciente`, `diagnostico`, `nivel`, `observaciones`) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, paciente);
			ps.setInt(2, diagnostico);
			ps.setNString(3, nivel);
			ps.setNString(4, observaciones);
			
			ps.execute();
		      
		    con.close();
			
		} catch(Exception e){
			System.err.println(e);
		}
				
        }

}
