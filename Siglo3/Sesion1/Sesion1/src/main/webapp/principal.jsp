<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ciberfarma</title>
<link href="css/estilos.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>

<body>
	<div id="contenedor">
		<jsp:include page="fragmento/cabezera.jsp"></jsp:include>
       
		<jsp:include page="fragmento/menu_nav.jsp"></jsp:include>
		<nav>
			<a href="#">Nosotros</a> <a href="login">Cerrar Sesion</a> <a href="#">Categorias</a>
			<a href="#">Novedades</a> <a href="#">Contactos</a>


		</nav>
		<main>
			<aside>
				<h3>Categorís</h3>
				<a href="#">Pastillas</a> <a href="#">Jarabes</a> <a href="#">Cuidado</a>
			</aside>
			<section>
				<figure>
					<img src="img/productos/vacio.png">
					<figcaption>Categoría 1</figcaption>
				</figure>
				<figure>
					<img src="img/productos/vacio.png">
					<figcaption>Categoría 2</figcaption>
				</figure>
				<figure>
					<img src="img/productos/vacio.png">
					<figcaption>Categoría 3</figcaption>
				</figure>
				<figure>
					<img src="img/productos/vacio.png">
					<figcaption>Categoría 4</figcaption>
				</figure>
				<figure>
					<img src="img/productos/vacio.png">
					<figcaption>Categoría 5</figcaption>
				</figure>
				<figure>
					<img src="img/productos/vacio.png">
					<figcaption>Categoría 6</figcaption>
				</figure>

			</section>
			<aside>
				<img src="img/avatar.png" alt="imagen2">
			</aside>
		</main>
		<footer>
			<img src="img/iconos/facebook_icon.png"> <img
				src="img/iconos/youtube_icon.png">

		</footer>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>

</html>
