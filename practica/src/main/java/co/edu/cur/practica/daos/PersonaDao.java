package co.edu.cur.practica.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.edu.cur.practica.entidades.Persona;
import co.edu.cur.practica.utilidades.Conexion;

public class PersonaDao implements IPersonaDao {

	/*
	 * Metodo u operacion para grabar una persona
	 */
	public boolean grabar(Persona persona) throws Exception {
		// conectarnos a bd
		Connection objConexion = Conexion.getConectionToSqlServer();

		// creamo el sql
		String sql = "insert into t_personas(documento,edad,nombre,direccion)values(?,?,?,?)";

		// Crear objeto que se conecte a bd
		PreparedStatement ps = objConexion.prepareStatement(sql);
		// cargo la informacion de persona en el sql
		ps.setString(1, persona.getDocumento());
		ps.setInt(2, persona.getEdad());
		ps.setString(3, persona.getNombre());
		ps.setString(4, persona.getDireccion());
		// ejecuto el sql
		int retorno = ps.executeUpdate();
		// retorno el numero de registros que inserte
		return retorno > 0 ? true : false;
	}

	/*
	 * Metodo u operacion para actualizar una persona
	 */
	public boolean actualizar(Persona persona) throws Exception {

		// conectarnos a bd
		Connection objConexion = Conexion.getConectionToSqlServer();

		// creamo el sql
		String sql = "update t_personas set nombre=?, edad=?, direccion=? where documento=?";

		// Crear objeto que se conecte a bd
		PreparedStatement ps = objConexion.prepareStatement(sql);
		// cargo la informacion de persona en el sql
		ps.setString(1, persona.getNombre());
		ps.setInt(2, persona.getEdad());
		ps.setString(3, persona.getDireccion());
		ps.setString(4, persona.getDocumento());
		// ejecuto el sql
		int retorno = ps.executeUpdate();
		// retorno el numero de registros que inserte
		return retorno > 0 ? true : false;
	}

	/*
	 * Metodo u operacion para eliminar una persona
	 */
	public boolean eliminar(Persona persona) throws Exception {
		// conectarnos a bd
		Connection objConexion = Conexion.getConectionToSqlServer();

		// creamo el sql
		String sql = "delete from t_personas where documento=?";

		// Crear objeto que se conecte a bd
		PreparedStatement ps = objConexion.prepareStatement(sql);
		// cargo la informacion de persona en el sql
		ps.setString(1, persona.getDocumento());
		// ejecuto el sql
		int retorno = ps.executeUpdate();
		// retorno el numero de registros que inserte
		return retorno > 0 ? true : false;
	}
}
