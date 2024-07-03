package hijos;

import padre.Figura;

public class Cuadrado extends Figura {
	private int lado;

	public Cuadrado(int x, int y, int lado) {
		super(x, y);
		this.lado = lado;
	}
	
	public double Area() {
		return lado*lado;
	}
	
	

}
