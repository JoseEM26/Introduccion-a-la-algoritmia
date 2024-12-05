package com.ExploraPeru.Mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ExploraPeru.Connection.MySQLConnection;
import com.ExploraPeru.model.Contacto;

public class MantenimientoContactanos {
	public int InsertarContactanos(Contacto c) {
		int ok = 0;
		Connection con = null;
		PreparedStatement ps = null;
		String statement = "INSERT INTO CONTACTANOS (nombreContacto, emailContacto, numeroContacto, mensajeContacto)values (?,?,?,?)";

		try {

			con=MySQLConnection.getConnection();
			ps=con.prepareStatement(statement);
			ps.setString(1,c.getNombreContacto());
			ps.setString(2,c.getEmailContacto());
			ps.setString(3,c.getNumeroContacto());
			ps.setString(4,c.getMensajeContacto());
			
			ok=ps.executeUpdate();
			
			
			
		} catch (Exception e) {
			System.out.println("Error en insertar contactanos");
		}finally {
			MySQLConnection.CloseConection(con);
		}

		return ok;
	}
}
