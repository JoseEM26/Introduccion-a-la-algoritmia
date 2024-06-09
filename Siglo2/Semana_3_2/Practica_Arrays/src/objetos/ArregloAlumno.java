package objetos;

import java.util.ArrayList;

import objetos.Alumno;

public class ArregloAlumno {
	
    private ArrayList<Alumno>alu;

	public ArregloAlumno() {
		alu=new ArrayList<Alumno>();
		//alu.add(new Alumno(111,12,14,"miguel"));
		//alu.add(new Alumno(112,44,111,"luisa"));
    	//alu.add(new Alumno(122,56,53,"carlos"));
	}
	
	public void agregar() {
		alu.add(new Alumno(111,12,14,"miguel"));
		alu.add(new Alumno(112,44,111,"luisa"));
    	alu.add(new Alumno(122,56,53,"carlos"));
	}
	
	public int Tamaño() {
		return alu.size();
	}
	
	public Alumno obtener(int i) {
		return alu.get(i);
	}
	
	public double PromedioGenerall() {
		int suma=0;
		
		for(int i=0;i<Tamaño();i++) {
			suma+=obtener(i).Promedio();
		}
		return suma/Tamaño();
	}
	
	
	
	
    
   
 	
	
	
	
	
	
	
}
