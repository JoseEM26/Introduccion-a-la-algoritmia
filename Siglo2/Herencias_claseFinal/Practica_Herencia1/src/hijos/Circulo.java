package hijos;

import padre.Figura;

public class Circulo extends Figura {
	private double radio;

	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public double area() {
		return 3.1416*radio*radio;
	}

}
