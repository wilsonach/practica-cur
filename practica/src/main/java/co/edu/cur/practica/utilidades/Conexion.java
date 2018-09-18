package co.edu.cur.practica.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	/*
	 * Metodo para conectarme a la base datos Sql Server
	 */
	public static Connection getConectionToSqlServer() throws Exception {
		Class.forName("net.sourceforge.jtds.jdbc.Driver"); // driver
		Connection con = null; // Variable tipo Conecction
		String sURL = "jdbc:jtds:sqlserver://VAIO//localhost:1433/practica"; // url
		con = DriverManager.getConnection(sURL, "VAIO\\Usuario", "Pentesting1404"); // usuario y clave de la base datos
		return con;
	}
	
	// metodo para hacer una prueba de conexion
	public static void main(String[] args) {
		try {
			System.out.println(Conexion.getConectionToSqlServer());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error al conectarse:" + e.toString());

		}
	}

}
