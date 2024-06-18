package arreglos;

import java.util.ArrayList;

import clases.Cliente;

public class ArregloCliente {
	//atributo
	private ArrayList<Cliente> ac;
	//constructor
	public ArregloCliente() {
		ac=new ArrayList<Cliente>();
	}
	//METODOS BASICOS ARRAYLIST
	public void adicionar(Cliente x) {
		ac.add(x);
	}
	public int tamano() {
		return ac.size();
	}
	public Cliente obtener(int i) {
		return ac.get(i);
	}
	public void remover(int i) {
		ac.remove(i);
	}
	
	//metodo codigo correlativo
	public int codigoCorrelativo() {
		if(tamano()==0)
			return 1001;
		else
			return obtener(tamano()-1).getCodigoCliente()+1;
	}
	
}
