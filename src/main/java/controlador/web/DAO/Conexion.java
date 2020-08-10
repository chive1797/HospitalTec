package controlador.web.DAO;

import java.sql.DriverManager;

public class Conexion {
	public static void main (String [] args) {
		
		Conexion con = new Conexion ();
		System.out.println(con.getConection());
		
	}
	
	public Conexion getConection() {
		
		Conexion con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Conexion) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
