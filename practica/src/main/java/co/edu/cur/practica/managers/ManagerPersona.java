package co.edu.cur.practica.managers;

import co.edu.cur.practica.daos.IPersonaDao;
import co.edu.cur.practica.daos.PersonaDao;
import co.edu.cur.practica.entidades.Persona;

public class ManagerPersona {

	public boolean guardar(Persona pPersona) throws Exception {

		if (pPersona != null && pPersona.getEdad() > 18) {

			IPersonaDao daoPersona = new PersonaDao();
			return daoPersona.grabar(pPersona);

		} else {
			throw new Exception("Persona Null o su edad no cumple con los requisitos");
		}
	}

	public boolean actualizar(Persona pPersona) throws Exception {

		if (pPersona != null && pPersona.getDocumento() != null) {

			IPersonaDao daoPersona = new PersonaDao();
			return daoPersona.actualizar(pPersona);

		} else {
			throw new Exception("Persona Null o su documento null");
		}
	}

	public boolean eliminar(Persona pPersona) throws Exception {
		if (pPersona != null && pPersona.getDocumento() != null) {

			IPersonaDao daoPersona = new PersonaDao();
			return daoPersona.eliminar(pPersona);

		} else {
			throw new Exception("Persona Null o su documento null");
		}
	}

}
