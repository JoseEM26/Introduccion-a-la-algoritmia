package codigo;

public class Docente {
     private int codigo;
     private String nombre;
     private int horas;
     private double tarifa;
     
	public Docente(int codigo, String nombre, int horas, double tarifa) {
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public double Sueldo() {
		return horas*tarifa;
	}
     

     
     
     
     
     
     
     
     
     
}
