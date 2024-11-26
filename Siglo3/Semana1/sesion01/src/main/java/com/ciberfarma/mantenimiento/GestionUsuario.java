package com.ciberfarma.mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ciberfarma.conection.MySQLConexion;
import com.ciberfarma.model.Usuario;

public class GestionUsuario {
	 //-------------procesar del crud--------------------
	
	
	  //registrar
		public int registrar(Usuario objUsuario) throws Exception {
			int ok = 0;  // variable de control
			Connection con = null;   
			PreparedStatement pst = null; 
			try {			
				con = MySQLConexion.getConexion();
				// sentencia sql
				String sql = "insert into tb_usuarios values (?,?,?,?,?)";
				// prepara la sentencia 
				pst = con.prepareStatement(sql);
				// parámetros (de ser necesario) 
				pst.setString(1, objUsuario.getNombre());
				pst.setString(2, objUsuario.getApellido());
				pst.setString(3, objUsuario.getUsuario());
				pst.setString(4, objUsuario.getContraseña());
				pst.setString(5, objUsuario.getFecha());

				 
				ok = pst.executeUpdate(); // actualiza la variable de control
			}catch(Exception e){
					
					System.out.println("Error: " + e.getMessage());
			} finally {
				MySQLConexion.closeConexion(con);
			}
			return ok;
		}
		
	  //Eliminar
		
		
	  //listar
		
		
	  //actualizar

		
	  //Buscar
}
