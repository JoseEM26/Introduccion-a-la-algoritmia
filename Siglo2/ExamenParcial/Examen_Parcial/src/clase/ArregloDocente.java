package clase;

import java.util.ArrayList;

public class ArregloDocente {
	
	  ArrayList<Docente>doc;
	
	public ArregloDocente() {
	   doc=new ArrayList<Docente>();
	   doc.add(new Docente(1111, "Espinoza", 50, 1200));
	   doc.add(new Docente(1112, "Miguel", 20, 1030));
	   doc.add(new Docente(1113, "Jose", 12, 4400));
	   doc.add(new Docente(1114, "Carlos", 22, 4000));
	   doc.add(new Docente(1115, "Pepito", 5, 5000));
	   doc.add(new Docente(1116, "Juam", 100, 69000));
	   doc.add(new Docente(1117, "Peke", 17, 1700));
	   doc.add(new Docente(1118, "Fabiola", 14, 1800));
	}
	
	public int Tamaño() {
		return doc.size();
	}
	
	public Docente Obtener(int i) {
		return doc.get(i);
	}
	
	public double SueldoPromedio() {
		double suma=0;
		
		for(int i=0;i<Tamaño();i++) {
			suma+=Obtener(i).Sueldo();
		}
		return suma/Tamaño();
	}
	
	public double SueldoMayor() {
		double mayor=0;
		
		for(int i=0;i<Tamaño();i++) {
			if(mayor<Obtener(i).Sueldo()) {
				mayor=Obtener(i).Sueldo();
			}
		}
		return mayor;
	}
	
	public double SueldoMenor() {
		double menor=Double.MAX_VALUE;
		
		for(int i=0;i<Tamaño();i++) {
			if(menor>Obtener(i).Sueldo()) {
				menor=Obtener(i).Sueldo();
			}
		}
		return menor;
	}
	
	public double TarifaMenor() {
		double menor=Double.MAX_VALUE;
		
		for(int i=0;i<Tamaño();i++) {
			if(menor>Obtener(i).getTarifa()) {
				menor=Obtener(i).getTarifa();
			}
		}
		return menor;
	}
    
	public double TarifaMayor() {
		double mayor=0;
		
		for(int i=0;i<Tamaño();i++) {
			if(mayor<Obtener(i).getTarifa()) {
				mayor=Obtener(i).getTarifa();
			}
		}
		return mayor;
	}
	
	
	
	
	
	
	
	
}
