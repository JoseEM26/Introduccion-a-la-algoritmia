package Clases;

public class Ventas  {
   private int codigoVenta;

   private int cantidad;
   private double precio;
   private String fecha;
   
   
public Ventas(int codigoVenta, int cantidad, double precio, String fecha) {
	this.codigoVenta = codigoVenta;
	this.cantidad = cantidad;
	this.precio = precio;
	this.fecha = fecha;
}


public int getCodigoVenta() {
	return codigoVenta;
}


public void setCodigoVenta(int codigoVenta) {
	this.codigoVenta = codigoVenta;
}


public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public String getFecha() {
	return fecha;
}


public void setFecha(String fecha) {
	this.fecha = fecha;
}

public double SubTotal() {
	return precio*cantidad;
}

public double IGV() {
	return SubTotal()*0.18;
}
   
public double TotalPagar() {
	return SubTotal()-IGV();
}
   
   
   
   
   
   
   
   
   
   
   
   
}
