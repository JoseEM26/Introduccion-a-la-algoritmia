

<form class="row g-3" action="crud" method="post">
	<div class="col-md-12">
		<label for="inputEmail4" class="form-label">Codigo del
			producto :</label> <input  type="email" name="codigo" required="required"
		
			placeholder="ingrese Codigo" class="form-control" id="inputEmail4">
	</div>
	<div class="col-md-12">
		<label for="inputPassword4" class="form-label">Descripcion :</label> <input
			type="password" name="descripcion" required="required"
			placeholder="Ingrese nombre o descripcion del producto"
			class="form-control" id="inputPassword4">
	</div>
	<div class="col-6">
		<label for="inputAddress" class="form-label">Stock</label> <input
			type="number" class="form-control" name="stock" id="inputAddress"  min="0" required="required" 
			placeholder="">
	</div>
	<div class="col-6">
		<label for="inputAddress2" class="form-label">Precio : </label> <input min="0"
			type="number" step="0.01" class="form-control" name="precio" id="inputAddress2" required="required"
			placeholder="	">
	</div>
	<div class="col-6">
		<label for="inputCity" class="form-label">Categoria :</label> <select required="required"
			name="categoria" id="inputState" class="form-select"> 
			<option  selected>Selecione...</option>
			<option>...</option>
		</select>
	</div>
	<div class="col-6">
		<label for="inputState" class="form-label">Estado :</label> <select required="required"
			name="estado" id="inputState" class="form-select">
			<option selected>Seleccione...</option>
			<option>...</option>
		</select>
	</div>


	<div class="col-12">
		<button type="submit" class="btn btn-primary">Registrar</button>
		<button type="submit" class="btn btn-danger">Actualizar</button>
		<button type="submit" class="btn btn-danger">Eliminar</button>
		<button type="submit" class="btn btn-primary">Listado</button>
	</div>
	<div>${mensajeCrud }</div>
</form>