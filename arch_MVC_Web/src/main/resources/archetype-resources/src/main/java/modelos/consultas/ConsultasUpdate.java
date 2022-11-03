package modelos.Consultas;

import java.sql.*;

/*
 * ConsultasUpdate --> Clase que nos permite realizar updates a diferentes tablas de la base da datos
 */

public class ConsultasUpdate {
//	Realizamos un cambio de nombre a un alumno
	public static void updateAlumno(Connection conn) {

//		Declaramos la sentencia sql
		String sql = "UPDATE \"basicDatabase\".\"alumnos\" SET nombre = 'Gustavo' WHERE  \"alumnos\".idAlumno >=20; ";
		//Actualizamos a partir de la columna 20 ya que no he sido capaz de hacer que restaure el id de un registro previamente realizado
		System.out.println("[INFO] -- modelos.consultas.ConsultasUpdates.updateAlumno -- Realizando update");
		try {
//			Declaramos el statement y lo ejecutamos
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.consultas.ConsultasUpdates.updateAlumno -- " + e.toString());
		}
		System.out.println("[INFO] -- modelos.consultas.ConsultasUpdates.updateAlumno -- Saliendo de updateAlumno");

	}

}