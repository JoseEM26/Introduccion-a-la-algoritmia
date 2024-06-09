package codigo;

public class Pelota {
	private String marca;
    private double gramos;
    private double libras;
    private double centimetros;
    private double precio;
    
    public Pelota(String marca, double gramos, double libra, double centimetros, double precio) {
       this.marca=marca;
       this.gramos=gramos;
       this.libras=libra;
       this.centimetros=centimetros;
       this.precio=precio;
    }
    
    public void setMarca(String marca) {
    	this.marca=marca;
    }
    public String getMArca() {
    	return marca;
    }

	public double getGramos() {
		return gramos;
	}

	public void setGramos(double gramos) {
		this.gramos = gramos;
	}

	public double getLibras() {
		return libras;
	}

	public void setLibras(double libras) {
		this.libras = libras;
	}

	public double getCentimetros() {
		return centimetros;
	}

	public void setCentimetros(double centimetros) {
		this.centimetros = centimetros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	public double Radio() {
		return centimetros/2;
	}
	
	public double VolumenBalon() {
		return 4*3.1416*Radio()*Radio()*Radio()/3;
	}
	
	public double Descuento() {
		return precio*0.90;
	}
	
	public double ImportePagar() {
		return precio-Descuento();
	}
	
	
    
    
    
    
    
    
    
}
