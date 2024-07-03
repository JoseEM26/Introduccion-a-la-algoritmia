package arreglos;

import java.util.ArrayList;

import clases.Cliente;

public class ArregloCliente {
   ArrayList<Cliente>cl;
   
   public ArregloCliente() {
	   cl=new ArrayList<Cliente>();
	   cl.add(new Cliente(11111, "Jose", "Espinoza ","Lima","999999999","7777777"));
   }
   
   public int Tamaño() {
	   return cl.size();
   }
   
   public Cliente Obtener(int i) {
	   return cl.get(i);
   }
   
   public void Adicionar(Cliente x) {
	    cl.add(x);
   }
   
   public void EliminarFinal() {
	   cl.remove(Tamaño()-1);
   }
   
   public void EliminarTodo() {
	   cl.clear();
   }
   
   public Cliente BuscarCodigo(int codigo) {
	   for(int i=0;i<Tamaño();i++) {
		 if(Obtener(i).getCodigoCliente()==codigo) {
			 return Obtener(i);
		 }
	   };
	   return null;
   }
   
   
   
   
   
   
}
