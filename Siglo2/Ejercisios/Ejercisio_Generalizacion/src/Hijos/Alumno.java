package Hijos;

import padre.Persona;

public class Alumno extends Persona{
    private int nota1,nota2,nota3;

	public Alumno(String nombre, String apellido, int edad, int nota1, int nota2, int nota3) {
		super(nombre, apellido, edad);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
    
    public double CalcularPromedio() {
    	return (nota1+nota2+nota3)/3;
    }
    
    public String datosCompletps() {
    	return 	DatosPersonales()+"\n"+
                "Nota1 :"+"\t"+nota1+
                "Nota2 :"+"\t"+nota2+
                "Nota3 :"+"\t"+nota3;
    }
    
    
}
