package controlador.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import controlador.web.modelo.Tratamiento;

public class TratamientoDAO {
	
	
	public Tratamiento mostrarTratamiento(int id) {
		
		Tratamiento t1 = new Tratamiento();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hospitaltec.tratamiento where id = " + id);
			if(rs.next())
			{
				t1.setId(rs.getInt("id"));
				t1.setNombre(rs.getString("nombre"));
				t1.setCantidadRecomendada(rs.getInt("cantidadRecomendada"));
				t1.setTipo(rs.getString("tipo"));

			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		return t1;

}

}
