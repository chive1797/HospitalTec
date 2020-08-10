package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertarUsuarioDAO {
public void insertarUsuario(int cedula, String contrasena){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			
				
			String query = "INSERT INTO `hospitaltec`.`usuario` (`cedula`, `contrasena`) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, cedula);
			ps.setString(2, contrasena);

			
			ps.execute();
		      
		    con.close();
			
		} catch(Exception e){
			System.err.println(e);
		}
				
        }

}
