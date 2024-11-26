package com.ciberfarma.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciberfarma.mantenimiento.GestionUsuario;
import com.ciberfarma.model.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("Usuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String opcion= request.getParameter("btnOpcion");
		
	    switch (opcion) {
		case "reg": {
			registrar(request,response);
			break;}
		case "act": {break;}
		case "eli": {break;}
		case "lis": {break;}
		default:break;}
	    
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) {
		try {
			Usuario u= new Usuario();
			u.setNombre(request.getParameter("name"));
			u.setApellido(request.getParameter("apellido"));
			u.setUsuario(request.getParameter("usuario"));
			u.setContraseña(request.getParameter("contraseña"));
			u.setFecha(request.getParameter("date"));
			
			int ok= new GestionUsuario().registrar(u);
			
			if(ok==1) {
				request.getRequestDispatcher("Usuario.jsp").forward(request, response);
				request.setAttribute("mensaje","<script>Swal.fire({title:'Good job!',text: 'You clicked the button!',icon: 'success'}) </script>");
			}else {
				request.getRequestDispatcher("Usuario.jsp").forward(request, response);
				request.setAttribute("mensaje","<script>Swal.fire({title:'Good job!',text: 'You clicked the button!',icon: 'error'}) </script>");
			}
			
		} catch (Exception e) {
			request.setAttribute("mensaje","<script>Swal.fire({title:'puto job!',text: 'You clicked the button!',icon: 'error'}) </script>");
		}		
	}
	

}
