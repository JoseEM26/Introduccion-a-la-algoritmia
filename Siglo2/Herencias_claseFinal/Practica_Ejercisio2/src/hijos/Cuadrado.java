package hijos;

import interfaces.Dibujable;
import padre.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica implements Dibujable{
	private double lado;
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
//////////////////////////////////////////////////////////////
	@Override
	public double calcularArea() {
		return lado*lado;
	} 
	
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
	@Override
	public String dibujar() {
		return "Si se puede Dibujar";
	}

}
