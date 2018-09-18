package co.edu.cur.practica1.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.edu.cur.practica1.entidades.Persona;
import co.edu.cur.utilidades.Conexion;

public class PersonaDAO implements IPersonaDAO {

	@Override
	public int grabar(Persona persona) {
		//conectarnos a base de datos
		Connection objConexion = Conexion.conectar();
		
		//creamos el sql
		String sql = "insert into t_personas(documento,nombre,direccion)values(?,?,?,?)";
		
		
		//crear obejto que se conecte a bd
		PreparedStatement ps = objConexion.prepareStatement(sql);
		//cargo la informacion de perona en el sql
		ps.setString(1,  persona.getDocumento());
		ps.setString(2,  persona.getnombre());
		ps.setString(3,  persona.getdireccion());
		//ejecuto el sql
		int retorno = ps.executeUpdate();
		// retorno el numero
		return retorno;
	}

	@Override
	public int actualizar(Persona persona) {
		
		String sql = "update t_personas set nombre=? where documento=?;
		
		return 0;
	}

}
