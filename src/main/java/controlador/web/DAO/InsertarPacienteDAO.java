package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertarPacienteDAO {
	public void insertarPaciente(int cedula, String nombre, String sangre, String nacionalidad, String residencia){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			
				
			String query = "INSERT INTO `hospitaltec`.`paciente` (`cedula`, `nombre`, `sangre`, `nacionalidad`, `residencia`) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, cedula);
			ps.setNString(2, nombre);
			ps.setNString(3, sangre);
			ps.setNString(4, nacionalidad);
			ps.setNString(5, residencia);
			
			ps.execute();
		      
		    con.close();
			
		} catch(Exception e){
			System.err.println(e);
		}
				
        }

}
