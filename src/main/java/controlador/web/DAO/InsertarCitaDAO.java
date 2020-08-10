package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertarCitaDAO {
	public void insertarCita(int identificador, int paciente, String area, String fechaHora, String observacion){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			
				
			String query = "INSERT INTO `hospitaltec`.`cita` (`identificador`, `paciente`, `area`, `fechaHora`, `observacion`) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, identificador);
			ps.setInt(2, paciente);
			ps.setNString(3, area);
			ps.setNString(4, fechaHora);
			ps.setNString(5, observacion);
			
			ps.execute();
		      
		    con.close();
			
		} catch(Exception e){
			System.err.println(e);
		}
				
        }

}

