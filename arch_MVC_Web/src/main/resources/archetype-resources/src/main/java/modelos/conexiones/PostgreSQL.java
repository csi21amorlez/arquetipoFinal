package modelos.conexiones;
import java.sql.*;
/*
 * PostgreSQL --> Clase que se encarga de realizar la conexion a la base de datos, en este caso a PostgreSQL
 */

public class PostgreSQL {	
	
	public static Connection crearConexion(String user, String passw, String host, String db, int port) {
//		Creamos la conexion como null e inicializamos la string de conexion
		Connection conn = null;
		String connString = "jdbc:postgresql://" + host + ":" + port + "/" + db;
		
		try {			
//			Generamos el Class.forName
			System.out.println("[INFO]  -- modelos.conexiones.ConexionPostgreSQL.crearConexion -- Generando conexion ");
			try {
				Class.forName("org.postgresql.Driver");
			} catch (Exception e) {
				System.out.println("[ERROR] -- modelos.conexiones.ConexionPostgreSQL.crearConexion " + e.toString());
			}
//			Creamos la conexion pasandole nuestra string de conexión			
			conn = DriverManager.getConnection(connString, user, passw);	
			
			System.out.println("[INFO] -- modelos.conexiones.PostgreSQL.crearConexion -- Conexion creada correctamente, saliendo de generarConexion \n");						
			
		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.conexiones.PostgreSQL.crearConexion] " + e.toString());
		}		
		
		return conn;
	}

}