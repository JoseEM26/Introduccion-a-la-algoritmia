package codigo;

public class Computadora {
	private int codigo;
	private String marca;
	private String color;
	private double Dolares;
	
	
	public Computadora(int codigo, String marca, String color, double dolares) {
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.Dolares = dolares;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getDolares() {
		return Dolares;
	}


	public void setDolares(double dolares) {
		Dolares = dolares;
	}
	
	public double PrecioSoles() {
		return Dolares*3.35;
	}
	public double precioEuro() {
		return Dolares/1.20;
	}
	
}
