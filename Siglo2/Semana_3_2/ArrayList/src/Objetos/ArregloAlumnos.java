package Objetos;
import java.util.ArrayList;

public class ArregloAlumnos {
	
     private ArrayList<Alumno>alu;
	
     public ArregloAlumnos() {
    	 alu=new ArrayList<Alumno>();
    	 alu.add(new Alumno(111,12,14,"miguel"));
    	 alu.add(new Alumno(112,44,111,"luisa"));
    	 alu.add(new Alumno(122,56,53,"carlos"));
     }
     
     public int tamaño() {
    	 return alu.size();
     }
     
     public Alumno obtener(int i) {
    	 return alu.get(i);
     }

     public double promedioGeneral(){
 		double suma=0.0;
 		for(int i=0;i<tamaño();i++)
 			suma += obtener(i).promedio();
 			return suma/tamaño();
 	}
	
	
	
	
	
	
}
