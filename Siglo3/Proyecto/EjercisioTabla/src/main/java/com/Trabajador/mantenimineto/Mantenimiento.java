package com.Trabajador.mantenimineto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Trabajador.connection.MySqlConnection;
import com.Trabajador.model.Trabajador;
import com.mysql.cj.MysqlConnection;

public class Mantenimiento {
	public List<Trabajador> ListaTrabajador() {
		List<Trabajador> lista = new ArrayList<Trabajador>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = MySqlConnection.getConnection();
			String statement = "select*from persona";
			ps = con.prepareStatement(statement);
			rs = ps.executeQuery();

			while (rs.next()) {
				Trabajador t = new Trabajador();
				t.setId(rs.getInt("id"));
				t.setNombre(rs.getString("nombre"));
				t.setApellido(rs.getString("apellido"));
				lista.add(t);
			}

		} catch (Exception e) {
			System.out.println("Error en el mantenimiento");
		}finally {
			MySqlConnection.CloseConnection(con);
		}

		return lista;
	}
}
