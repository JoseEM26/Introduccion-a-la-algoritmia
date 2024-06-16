package objetos;

import java.util.ArrayList;

public class ArreglosAlumnos {

	private ArrayList<Alumno>alu;
	
	public ArreglosAlumnos(){
		alu=new ArrayList<Alumno>();
		alu.add(new Alumno(11111, 15, 20, "Penelope"));
		alu.add(new Alumno(11112, 16, 15, "Manuel"));
		alu.add(new Alumno(11113, 17, 17, "Nombre1"));
		alu.add(new Alumno(11114, 18, 19, "Penelope"));
		alu.add(new Alumno(11115, 19, 11, "Nombre2"));
		alu.add(new Alumno(11116, 10, 00, "James"));
		alu.add(new Alumno(11117, 13, 11, "Luis"));
		alu.add(new Alumno(11118, 11, 14, "Luis"));
	}
	
	public int Tamaño(){
		return alu.size();
	}
	
	public Alumno Obtener(int i){
		return alu.get(i);
	}
	
	public void Adicionar(Alumno x){
		alu.add(x);
	}
	
	public void EliminarFinal(){
	    alu.remove(Tamaño()-1);	
	}
	
	public void EliminarTodo(){
		alu.clear();
	}
	
	public Alumno buscar(int codigo){
		for(int i=0;i<Tamaño();i++){
			if(Obtener(i).getCodigo()==codigo){
				return Obtener(i);
			}
		}
		return null;
	}
	
	public void Eliminar(Alumno x){
		alu.remove(x);
	}
	
	
	
	
	
	
}
