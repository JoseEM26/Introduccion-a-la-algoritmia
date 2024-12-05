package com.ExploraPeru.Mantenimiento;

import java.lang.annotation.Retention;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ExploraPeru.Connection.MySQLConnection;
import com.ExploraPeru.Interfaz.MantenimientoCrud;
import com.ExploraPeru.model.Roles;
import com.ExploraPeru.model.Usuario;

public class MantenimientoUsuario {
	public Usuario ValidacionLogin(String email,String clave) {
		Usuario u = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLConnection.getConnection();

			String sql = "SELECT * FROM Usuarios where email = ? and contraseña = ?"; // sentencia

			pst = con.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, clave);

			rs = pst.executeQuery();

			if (rs.next()) { // if hay datos en la consulta
				u = new Usuario();
				// se trae los datos de la consulta
				u.setIdUsuario(rs.getInt("id_usuario"));
				u.setNombreUsuario(rs.getString("nombre_usuario"));
				u.setEmail(rs.getString("email"));
				u.setContraseña(rs.getString("contraseña"));
				u.setIdRol(rs.getInt("id_rol"));
				u.setFechaCreacion(rs.getString("fecha_creacion"));
				u.setFechaCumpleaños(rs.getString("fecha_cumpleaños"));
				u.setImg(rs.getString("img"));
				
			}
		} catch (Exception e) {
			System.out.println("Error en validar : " + e.getMessage());
		} finally {
			MySQLConnection.CloseConection(con);
		}
		return u;
	}

}
