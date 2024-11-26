<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</head>
<body class="container">
	<h1>Registro de cuenta</h1>
	<form action="UsuarioServlet" method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Nombre</label> <input
				type="text" placeholder="Ingrese su nombre" name="nombre"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text">We'll never share your
				email with anyone else.</div>
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Apellido</label>
			<input type="text" class="form-control"
				placeholder="Ingrese su apellido" name="apellido"
				id="exampleInputPassword1">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Usuario</label>
			<input type="email" class="form-control"
				placeholder="Ingrese su Correo" name="apellido"
				id="exampleInputPassword1">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Contraseña</label>
			<input type="password" class="form-control"
				placeholder="Ingrese password" name="apellido"
				id="exampleInputPassword1">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Fecha</label> <input
				type="datetime" class="form-control" placeholder="Año/mes/dia"
				name="apellido" id="exampleInputPassword1">
		</div>
		<button type="submit" value="reg" name="btnOpcion" class="btn btn-primary">Registrar</button>
		<button type="submit" value="act" name="btnOpcion"  class="btn btn-primary">Actualizar</button>
		<button type="submit" value="eli" name="btnOpcion"  class="btn btn-primary">Eliminar</button>
		<button type="submit" value="bus" name="btnOpcion"  class="btn btn-primary">Listado</button>
	</form>
${mensaje }
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</html>