package co.edu.cur.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	/*
	 * Metodo para conectarme a la base de datos
	 */

	public static Connection conectar() throws Exception {
		
			Class.forName("com.mysql.jdbc.Driver");//driver
			Connection con = null;//variable tipo Connection
			String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";//url
			return con = DriverManager.getConnection(sURL,"usuario","password");//usuario y clave de la base de dtos
		
			
			//metodo para hacer una prueba de conexion
			public static void main(String[] args) {
				try {
					System.out.println(Conexion.conectar());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("error al conectarse" +e.toString());
				}
			}
			
		}
		
	}



