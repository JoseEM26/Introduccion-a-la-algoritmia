package codigo;

public class Paciente {
	private String nombre;
	private String apellido;
	private int edad;
	private double talla;
	private double peso;
	private double pago;
	private  static int cantidad=0;
	
	
	
	public Paciente(String nombre, String apellido, int edad, double talla, double peso, double pago) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.talla = talla;
		this.peso = peso;
		this.pago = pago;
		cantidad++;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getTalla() {
		return talla;
	}



	public void setTalla(double talla) {
		this.talla = talla;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getPago() {
		return pago;
	}



	public void setPago(double pago) {
		this.pago = pago;
	}



	public static int getCantidad() {
		return cantidad;
	}



	public static void setCantidad(int cantidad) {
		Paciente.cantidad = cantidad;
	}
	
	public String MenorMayorEdad(Paciente x) {
		if(x.edad>18) {
			return "Mayor edad";
		}else {
			return "Menor edad";
		}
	}
	
	public int ContadorPacientes() {
		return cantidad;
	}
	
	public String PersonaPAgoMAs(Paciente x,Paciente y,Paciente z) {
		if(this.pago>x.pago && this.pago>y.pago && this.pago>z.pago) {
			return this.nombre+" "+apellido;
		}else if(x.pago>this.pago && x.pago>y.pago && x.pago>z.pago) {
			return "";
		}else if(y.pago>this.pago && y.pago>x.pago && y.pago>z.pago) {
			return "";
		}else{
			return "";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
