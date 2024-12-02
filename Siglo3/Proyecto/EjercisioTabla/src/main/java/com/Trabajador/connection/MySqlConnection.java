package com.Trabajador.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ciberfarmaweb?serverTimezone=UTC";
			String user = "root";
			String pass = "mysql";

			con = DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {
			System.out.println("getConnection");
		}

		return con;

	}
	
	public static void CloseConnection(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
