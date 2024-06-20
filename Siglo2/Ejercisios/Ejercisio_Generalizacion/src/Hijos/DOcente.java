package Hijos;

import padre.Persona;

public class DOcente extends Persona{
    private int horas;
    private double tarifa;
    
    
	public DOcente(String nombre, String apellido, int edad, int horas, double tarifa) {
		super(nombre, apellido, edad);
		this.horas = horas;
		this.tarifa = tarifa;
	};
	
	public double CalcularSueldo() {
		return horas*tarifa;
	};
	
	 public String datosCompletario() {
	    	return 	DatosPersonales()+"\n"+
	                "horas :"+"\t"+horas+
	                "tarifa :"+"\t"+tarifa;
	                
	    }

	
    
    
    
}
