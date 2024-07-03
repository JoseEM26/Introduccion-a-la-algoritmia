package Arreglos;

import java.util.ArrayList;

import Clases.Cliente;

public class ArregloCliente {
	
	private ArrayList<Cliente> ac;

	public ArregloCliente() {
		ac=new ArrayList<Cliente>();
	}
	public void adicionar(Cliente x) {
		ac.add(x);
	}
	public int tamano() {
		return ac.size();
	}
	public Cliente obtener(int i) {
		return ac.get(i);
	}
	public void eliminarCliente(int i) {
		ac.remove(i);
	}
	public int codigoCorrelativo() {
		if(tamano()==0)
			return 1001;
		else
			return obtener(tamano()-1).getCodigoCliente()+1;
	}
}
