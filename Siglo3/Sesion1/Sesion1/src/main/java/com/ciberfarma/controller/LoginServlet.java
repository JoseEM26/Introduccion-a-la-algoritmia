package com.ciberfarma.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// para cargar paginas o recursos
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Leer los datos enviados desde el form
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("clave");

		if (usuario.equals("admin@mail.com") && contraseña.equals("123456")) {
			System.out.println("Correcto");

			request.setAttribute("mensaje", "Bienvenidos");
			request.getRequestDispatcher("principal.jsp").forward(request, response);

		} else {
			System.out.println("Incorrecto");

			request.setAttribute("mensaje", "<script>Swal.fire({title: 'Aviso!',text: 'Usuario o clave incorrecto!',icon: 'error'});</script>");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}

	}

}
