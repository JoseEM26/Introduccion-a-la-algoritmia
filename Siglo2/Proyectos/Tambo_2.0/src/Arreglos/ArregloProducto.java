package Arreglos;

import java.util.ArrayList;

import Clases.Producto;

public class ArregloProducto {
	ArrayList<Producto>pro;
	public ArregloProducto() {
		pro=new ArrayList<Producto>();
		pro.add(new Producto(2001, "Gloria ", 1000, 3000, 1000, 9999));
		pro.add(new Producto(2002, "San Fernando ", 300, 3500, 1000, 9999));
		pro.add(new Producto(2003, "Nutela ", 1100, 4000, 1000, 9999));
	}
	public int Tamano() {
		return pro.size();
	}
	
	public Producto Obtener(int i) {
		return pro.get(i);
	}
	
	public void EliminarProducto(int i) {
		pro.remove(i);
	}
	
	public void Adicionar(Producto x) {
		pro.add(x);
	}
	
	public int CodigoCorrelativo() {
		if(Tamano()==0) {
			return 2001;
		}else {
		    return	Obtener(Tamano()-1).getCodigoProducto()+1;
		}
	}
}