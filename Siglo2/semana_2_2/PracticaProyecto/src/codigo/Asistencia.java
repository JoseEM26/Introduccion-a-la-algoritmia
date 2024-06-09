package codigo;

public class Asistencia {
	private int codigo;
	private String nombre;
	private int horas;
	private double tarifa;
	
	
	public Asistencia(int codigo, String nombre, int horas, double tarifa) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int gethoras() {
		return horas;
	}


	public void setThoras(int horas) {
		this.horas = horas;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public double SueldoBruto() {
		return getTarifa()*gethoras();
	}
	
	public double Descuento() {
		return SueldoBruto()*0.85;
	}
	
	public double SueldoNeto() {
		return SueldoBruto()-Descuento();
	}
	

	
	
	
}
