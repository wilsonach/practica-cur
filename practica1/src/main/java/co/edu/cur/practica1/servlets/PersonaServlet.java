package co.edu.cur.practica1.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.cur.practica1.entidades.Persona;
import co.edu.cur.practica1.managers.ManagerPersona;

/**
 * Servlet implementation class PersonaServlet
 */
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaServlet() {
    	Persona objPersona=new Persona()
				objPersona.setNombre(vnombre);
				objPersona.setDocumento(vdocuemnto);
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		// capturando valores del formulario
		String documento = request.getParameter("documento");
		String direccion = request.getParameter("direccion");
		String nombre = request.getParameter("nombre");
		String operacion = request.getParameter("operacion");
	    //llenando el objeto Persona
		Persona objPersona = new Persona();
		objPersona.setDireccion(direccion);
		objPersona.setDocumento(documento);
		objPersona.setNombre(nombre);
		//llamando a Manager
        ManagerPersona managerPersona = new ManagerPersona();
		try {
			//validando que operacion utilizar si Guardar o Actualizar
			if("G".equals(operacion))
				managerPersona.guardar(objPersona);
			else if ("A".equals(operacion)){
				managerPersona.actualizar(objPersona);

			}else {
				request.setAttribute("error", "operacion no valida");

			}
				
		} catch (Exception e) {
			request.setAttribute("error", e.toString());
		}
		
	}

}
