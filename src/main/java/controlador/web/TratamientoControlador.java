package controlador.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import controlador.web.DAO.TratamientoDAO;
import controlador.web.modelo.Tratamiento;

/**
 * Servlet implementation class TratamientoControlador
 */
public class TratamientoControlador extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		TratamientoDAO dao  = new TratamientoDAO();
		Tratamiento t1 = dao.mostrarTratamiento(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("tratamiento", t1);
		response.sendRedirect("MostrarTratamientos.jsp");
		
		
	}



}
