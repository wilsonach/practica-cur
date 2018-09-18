package co.edu.cur.practica1.daos;

import co.edu.cur.practica1.entidades.Persona;

public interface IPersonaDAO {

		public int grabar(Persona persona);
		public int actualizar(Persona persona);
}
