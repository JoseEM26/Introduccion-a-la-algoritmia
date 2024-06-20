package arreglos;

import java.util.ArrayList;

import clase.Alumno;

public class ArreglosAlumno {
      ArrayList<Alumno>alu;
      
      public ArreglosAlumno() {
    	  alu=new ArrayList<Alumno>();
    	  alu.add(new Alumno(1001, 12, 15, "nombre1"));	
    	  alu.add(new Alumno(1002, 15, 15, "nombre2"));	
    	  alu.add(new Alumno(1003, 17, 15, "nombre3"));	
    	  alu.add(new Alumno(1004, 20, 15, "nombre4"));	
    	  alu.add(new Alumno(1005, 15, 15, "nombre5"));	
    	  alu.add(new Alumno(1006, 17, 15, "nombre6"));	
    	  alu.add(new Alumno(1007, 18, 15, "nombre7"));	
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
      
      public void EliminarTodo() {
    	  alu.clear();
      }
      
      public void EliminarFinal() {
    	  alu.remove(Tamaño()-1);
      }
      
      public void EliminarCodigo(int i) {
    	  alu.remove(i);
      }
      
      public Alumno BuscarCodigp(int codigo) {
    	  for(int i=0;i<Tamaño();i++) {
    		  if(Obtener(i).getCodigo()==codigo) {
    			  return Obtener(i);
    		  }
    	  }
    	  return null;
      }
      
      
}
