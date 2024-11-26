package com.ciberfarma.mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ciberfarma.conection.MySQLConexion;
import com.ciberfarma.model.Producto;

public class GestionProducto {
  //-------------procesar del crud--------------------
	
	
  //registrar
	public int registrar(Producto objProducto) throws Exception {
		int ok = 0;  // variable de control
		Connection con = null;   
		PreparedStatement pst = null; 
		try {			
			con = MySQLConexion.getConexion();
			// sentencia sql
			String sql = "insert into tb_productos values (?,?,?,?,?,1)";
			// prepara la sentencia 
			pst = con.prepareStatement(sql);
			// parámetros (de ser necesario) 
			pst.setString(1, objProducto.getIdprod());
			pst.setString(2, objProducto.getDescripcion());
			pst.setInt(3, objProducto.getStock());
			pst.setDouble(4, objProducto.getPrecio());
			pst.setInt(5, objProducto.getCategoria());

			 
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
