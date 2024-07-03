package Arreglos;

import java.util.ArrayList;

import Clases.Producto;
import Clases.Ventas;

public class ArregloProducto {
	ArrayList<Producto>pro;
	private ArrayList<Ventas>ve ;
	
	public ArregloProducto() {
		pro=new ArrayList<Producto>();
		ve=new ArrayList<>();
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
	
	public ArrayList <Producto> obtener(){
		return pro;
	}
	
	 public ArrayList <Ventas> obtenerr(){
			return ve;
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
	
	
	 // Método para obtener productos cuyo stock está por debajo del mínimo
	
    public ArrayList<Producto> obtenerProductosStockBajo() {
        ArrayList<Producto> productosStockBajo = new ArrayList<>();
        
        for (Producto producto : pro) {
            if (producto.getStockActual() < producto.getStockMinimo()) {
                productosStockBajo.add(producto);
            }
        }
        return productosStockBajo;
    }
	
	
	
	
	
	
	
	
	
	
	
}