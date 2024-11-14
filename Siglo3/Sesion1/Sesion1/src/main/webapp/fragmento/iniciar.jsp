<form action="login" method="post">
			<div class="mb-3">
				<label  for="exampleInputEmail1" class="form-label">correo
					</label> <input type="email" name="usuario" placeholder="Ingresar un correo" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">contraseña</label>
				<input type="password" name="clave" placeholder="ingresar password" class="form-control"
					id="exampleInputPassword1">
			</div>
			
			<button type="submit" class="btn btn-primary">enviar</button>
			<div>${mensaje}</div>
			<hr>
			<p>para registrar su cuenta , pulse <a href="">aqui</a></p>
		</form>