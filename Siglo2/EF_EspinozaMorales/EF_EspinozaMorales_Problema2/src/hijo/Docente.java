package hijo;

import padre.Persona;

public class Docente extends Persona{
	private double horas;
	private double tarifa;
	
	public Docente(String nombre, int dni, int telefono, double horas, double tarifa) {
		super(nombre, dni, telefono);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	
	public double CalcularSueldo() {
		double sueldo= horas*tarifa;
		double Bonificacion=sueldo*0.20;
		double Descuento=sueldo*0.10;
		return sueldo+Bonificacion-Descuento;
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos()+"\n"+
			    "Horas: \t"+horas+"\n"+
			    "Tarifa: \t"+tarifa+"\n"+
			    "Sueldo Docente: \t"+CalcularSueldo();

	}

}
