<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ciberfarma</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link href="css/estilos.css" rel="stylesheet">
</head>

<body>
	<div id="contenedor">
		<jsp:include page="fragmento/cabecera.jsp"></jsp:include>
		<jsp:include page="fragmento/menu_nav.jsp"></jsp:include>

		<nav>
			<a href="#">Nosotros</a> <a href="login">Cerrar sesión</a>
		</nav>
		<main>
			<aside>
				<h3>Categorís</h3>
				<a href="#">Pastillas</a> <a href="#">Jarabes</a> <a href="#">Cuidado</a>
			</aside>
			<section>
				<h2>Mantenimiento de Productos</h2>
				<form class="row g-3">
					
					<div class="col-12">
						<label for="inputAddress" class="form-label">Código</label>
						 <input name="codigo" 
						 	maxlength="5" 
						 	pattern="[Pp][0-9]{4}"
						 	required="required"
							type="text" class="form-control" id="inputAddress"
							placeholder="P0000">
					</div>
					<div class="col-12">
						<label for="inputAddress2" class="form-label">Address 2</label> <input
							type="text" class="form-control" id="inputAddress2"
							placeholder="Apartment, studio, or floor">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Stock</label> <input
							type="number" min="0" max=""
							 class="form-control" id="inputEmail4">
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Precio</label> 
						<input min="0" max="" step="0.01"
							type="number" class="form-control" id="inputPassword4">
					</div>
					<div class="col-md-6">
						<label for="inputCity" class="form-label">City</label> <input
							type="text" class="form-control" id="inputCity">
					</div>
					<div class="col-md-4">
						<label for="inputState" class="form-label">State</label> <select
							id="inputState" class="form-select">
							<option selected>Choose...</option>
							<option>...</option>
						</select>
					</div>
					<div class="col-md-2">
						<label for="inputZip" class="form-label">Zip</label> <input
							type="text" class="form-control" id="inputZip">
					</div>
					<div class="col-12">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="gridCheck">
							<label class="form-check-label" for="gridCheck"> Check me
								out </label>
						</div>
					</div>
					<div class="col-12">
						<button type="submit" class="btn btn-primary">Sign in</button>
						<button type="submit" class="btn btn-primary">Sign in</button>
						<button type="submit" class="btn btn-primary">Sign in</button>
					</div>
				</form>
			</section>
			<aside></aside>
		</main>
		<footer>
			<img src="img/iconos/facebook_icon.png">
			<p>Derechos Reservados. Lima, Perú - 2024</p>
		</footer>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
