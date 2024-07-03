package Hijo;
import Padre.Persona;

public class Alumno extends Persona{
	
	private int nota1,nota2,nota3;
	


	
	public Alumno(String nombre, String apellido, int edad, int nota1, int nota2, int nota3) {
		super(nombre, apellido, edad);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}




	public double calcularPromedio(){
		return (nota1+nota2+nota3)/3.0;
	}

	
	public String datosCompletos(){
		return datosDeLaPersona()+"\n"+
				"Nota1: "+nota1+"\n"+
				"Nota2: "+nota2+"\n"+
				"Nota3: "+nota3;
	}






	
}
