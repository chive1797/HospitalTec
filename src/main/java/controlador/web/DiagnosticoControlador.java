package controlador.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controlador.web.DAO.MostrarCitaDAO;
import controlador.web.DAO.MostrarDiagnosticoDAO;
import controlador.web.modelo.Cita;
import controlador.web.modelo.Diagnostico;

/**
 * Servlet implementation class DiagnosticoControlador
 */
public class DiagnosticoControlador extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int paciente = Integer.parseInt(request.getParameter("paciente"));
		MostrarDiagnosticoDAO dao  = new MostrarDiagnosticoDAO();
		Diagnostico c1 = dao.mostrarDiagnostico(paciente);
		
		HttpSession session = request.getSession();
		session.setAttribute("diagnostico", c1);
		response.sendRedirect("MostrarDiagnostico.jsp");
		
	}


}
