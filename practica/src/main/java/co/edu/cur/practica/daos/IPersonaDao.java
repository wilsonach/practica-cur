package co.edu.cur.practica.daos;

import co.edu.cur.practica.entidades.Persona;

public interface IPersonaDao {

	public boolean grabar(Persona persona) throws Exception;

	public boolean actualizar(Persona persona) throws Exception;

	public boolean eliminar(Persona persona) throws Exception;
}