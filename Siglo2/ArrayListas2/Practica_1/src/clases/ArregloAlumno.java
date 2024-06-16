package clases;

import java.util.ArrayList;

public class ArregloAlumno {
    ArrayList<Alumno>alu;
    
    public ArregloAlumno() {
       alu=new ArrayList<Alumno>();
       alu.add(new Alumno(1111, 11, 11, "Nombre"));
       alu.add(new Alumno(1112, 12, 12, "Nombre1"));
       alu.add(new Alumno(1113, 13, 13, "Nombre2"));
       alu.add(new Alumno(1114, 14, 14, "Nombre3"));
       alu.add(new Alumno(1115, 15, 15, "Nombre4"));
       alu.add(new Alumno(1116, 16, 16, "Nombre5"));
       alu.add(new Alumno(1117, 17, 17, "Nombre6"));
       alu.add(new Alumno(1118, 18, 18, "Nombre7"));
    }
    
    public int Tamaño() {
    	return alu.size();
    }
    
    public Alumno Obtener(int i) {
    	return alu.get(i);
    }
    
    public void Adicionar(Alumno x) {
    	alu.add(x);
    }
    
    public void EliminarFinal() {
    	alu.remove(Tamaño()-1);
    }
    
    public void Eliminartodo() {
    	alu.clear();
    }
    
    public Alumno Buscar(int codigo) {
    	for(int i=0;i<Tamaño();i++) {
    		if(Obtener(i).getCodigo()==codigo) {
    			return Obtener(i);
    		}
    	}
    	return null;
    }
    
    public void Eliminar(Alumno x) {
    	alu.remove(x);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
