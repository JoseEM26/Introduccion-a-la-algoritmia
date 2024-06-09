package Objetos;

public class Libro {
	private int codigo,Precio;
	private String nombre;
	private String autor;
	private String pais;
	private static int cantidad;
	
	public Libro(int codigo, int precio, String nombre, String autor, String pais) {
		this.codigo = codigo;
		Precio = precio;
		this.nombre = nombre;
		this.autor = autor;
		this.pais=pais;
		cantidad++;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Libro.cantidad = cantidad;
	}
	
	public String precioLibro(Libro x,Libro y,Libro z){
		if(this.Precio>x.Precio&&this.Precio>y.Precio&&this.Precio>z.Precio){
			return this.nombre;
		}else if(x.Precio>this.Precio&&x.Precio>y.Precio&&x.Precio>z.Precio){
			return x.nombre;
		}else if(y.Precio>this.Precio&&y.Precio>x.Precio&&x.Precio>z.Precio){
			return y.nombre;
		}else{
			return z.nombre;
		}
		
	}
	
	
}
