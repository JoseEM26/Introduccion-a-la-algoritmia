package Arreglos;

import java.util.ArrayList;

import Clases.Ventas;

public class ArregloVenta {
   private ArrayList<Ventas>ve;
   
   public ArregloVenta() {
	   ve=new ArrayList<Ventas>();
	   ve.add(new Ventas(3001, 100, 50, "02/12/2024"));
	   ve.add(new Ventas(3002, 10, 100, "11/03/2024"));
	   ve.add(new Ventas(3003, 10, 80, "22/06/2024"));
	   ve.add(new Ventas(3004, 200, 60, "29/10/2024"));
	   ve.add(new Ventas(3005, 330, 12, "30/11/2024"));
   }
   public int Tamano() {
	   return ve.size();
   }
   public Ventas Obtener(int i) {
	   return ve.get(i);
   }
   public void Adicionar(Ventas x) {
	  ve.add(x);
   }
   public int CodigoCorrelativoVentas() {
	   if(Tamano()==0) {
		   return 3001;
	   }else {
		   return (Obtener(Tamano()-1).getCodigoVenta())+1;
	   }
   }
}
