package controlador.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controlador.web.DAO.PacienteDAO;
import controlador.web.modelo.Paciente;

/**
 * Servlet implementation class PacienteController
 */
public class PacienteController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cedula = Integer.parseInt(request.getParameter("cedula"));
		PacienteDAO dao  = new PacienteDAO();
		Paciente a1 = dao.mostrarPaciente(cedula);
		
		HttpSession session = request.getSession();
		session.setAttribute("paciente", a1);
		response.sendRedirect("mostrarPaciente.jsp");
		
		
		
	}

}
