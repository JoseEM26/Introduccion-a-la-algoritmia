package Clases;

public class Producto {
	private int CodigoProducto;
	private String Nombre;
	private double Precio;
	private int StockActual;
	private int StockMinimo;
	private int StockMaximo;
	
	
	public Producto(int codigoProducto, String nombre, double precio, int stockActual, int stockMinimo,int stockMaximo) {
		CodigoProducto = codigoProducto;
		Nombre = nombre;
		Precio = precio;
		StockActual = stockActual;
		StockMinimo = stockMinimo;
		StockMaximo = stockMaximo;
	}


	public int getCodigoProducto() {
		return CodigoProducto;
	}


	public void setCodigoProducto(int codigoProducto) {
		CodigoProducto = codigoProducto;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public int getStockActual() {
		return StockActual;
	}


	public void setStockActual(int stockActual) {
		StockActual = stockActual;
	}


	public int getStockMinimo() {
		return StockMinimo;
	}


	public void setStockMinimo(int stockMinimo) {
		StockMinimo = stockMinimo;
	}


	public int getStockMaximo() {
		return StockMaximo;
	}


	public void setStockMaximo(int stockMaximo) {
		StockMaximo = stockMaximo;
	}
	
	

}
