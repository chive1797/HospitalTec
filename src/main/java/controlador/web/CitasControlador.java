package controlador.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controlador.web.DAO.MostrarCitaDAO;
import controlador.web.DAO.PacienteDAO;
import controlador.web.modelo.Cita;
import controlador.web.modelo.Paciente;

/**
 * Servlet implementation class CitasControlador
 */
public class CitasControlador extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int paciente = Integer.parseInt(request.getParameter("paciente"));
		MostrarCitaDAO dao  = new MostrarCitaDAO();
		Cita c1 = dao.mostrarCita(paciente);
		
		HttpSession session = request.getSession();
		session.setAttribute("cita", c1);
		response.sendRedirect("MostrarCitas.jsp");
		
		
	}
	
}

	