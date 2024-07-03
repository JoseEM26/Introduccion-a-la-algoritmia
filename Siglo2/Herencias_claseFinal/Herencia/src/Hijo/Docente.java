package Hijo;
import Padre.Persona;

public class Docente extends Persona{
	
	
	private int Horas;
	private double tarifa;
	
	public Docente(String nombre, String apellido, int edad, int horas, double tarifa) {
		super(nombre,apellido,edad);
		this.Horas = horas;
		this.tarifa = tarifa;
	}
	
	public double calcularSueldo(){
		return Horas*tarifa;
	}
	
	
	public String datosCompletos(){
		return datosDeLaPersona()+"\n"+
				"Horas: "+Horas+
				"tarifa: "+tarifa;
	}







}
