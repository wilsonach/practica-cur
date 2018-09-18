package co.edu.cur.practica.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.cur.practica.entidades.Persona;
import co.edu.cur.practica.managers.ManagerPersona;

/**
 * Servlet implementation class PersonaServlet
 */
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// capturando valores del formulario
		String documento = request.getParameter("documento");
		String direccion = request.getParameter("direccion");
		String nombre = request.getParameter("nombre");
		String operacion = request.getParameter("operacion");
		int edad = 0;
		if (!"E".equals(operacion)) {
			edad = (request.getParameter("edad") == null) ? 0 : Integer.parseInt(request.getParameter("edad"));
		}
		// llenando el objeto Persona
		Persona objPersona = new Persona();
		objPersona.setDireccion(direccion);
		objPersona.setDocumento(documento);
		objPersona.setNombre(nombre);
		objPersona.setEdad(edad);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsps/formulario.jsp");

		// llamando a Manager
		ManagerPersona managerPersona = new ManagerPersona();
		try {
			boolean guardo = false;
			// validando que operacion utilizar si Guardar o Actualizar
			if ("G".equals(operacion)) {
				guardo = managerPersona.guardar(objPersona);
				if (guardo) {
					request.setAttribute("error", "Registro guardado");
				} else {
					request.setAttribute("error", "Registro No fue guardado");
				}
			} else if ("A".equals(operacion)) {
				guardo = managerPersona.actualizar(objPersona);
				if (guardo) {
					request.setAttribute("error", "Registro actualizado");
				} else {
					request.setAttribute("error", "Registro No fue actualizado");
				}
			} else if ("E".equals(operacion)) {
				guardo = managerPersona.eliminar(objPersona);
				if (guardo) {
					request.setAttribute("error", "Registro eliminado");
				} else {
					request.setAttribute("error", "Registro No fue eliminado");
				}
			} else {
				request.setAttribute("error", "operacion no valida");
			}
		} catch (Exception e) {
			request.setAttribute("error", e.toString());
		}
		rd.forward(request, response);
		// response.sendRedirect("http://localhost:8080/practica/jsps/formulario.jsp");
	}
}
