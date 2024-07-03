package hijo;

import padre.Persona;

public class Estudiante extends Persona{
	private int nota1,nota2,nota3;

	public Estudiante(String nombre, int dni, int telefono, int nota1, int nota2, int nota3) {
		super(nombre, dni, telefono);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double PromedioNota() {
		return (nota1*0.25)+(nota1*0.35)+(nota1*0.40);
	}
	
	@Override
	public String mostrarDatos() {
		return super.mostrarDatos()+"\n"+
		           "Nota1: \t"+nota1+"\n"+
		           "Nota2: \t"+nota2+"\n"+
		           "Nota3: \t"+nota3+"\n"+
		           "Promedio Notas: \t"+PromedioNota();
	}

}
