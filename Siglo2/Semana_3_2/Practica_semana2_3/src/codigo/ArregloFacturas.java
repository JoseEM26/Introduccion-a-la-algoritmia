package codigo;

import java.util.ArrayList;

public class ArregloFacturas {
     private ArrayList<Factura>fac;
     
     public ArregloFacturas() {
    	 fac=new ArrayList<Factura>();
    	 fac.add(new Factura("188888", "Pioner",109, 133));
    	 fac.add(new Factura("188881", "Wee",102, 123));
    	 fac.add(new Factura("188882", "Quisus",9, 1433));
    	 fac.add(new Factura("188883", "Nike",19, 1253));
    	 fac.add(new Factura("188884", "Adudad",159, 6233));
    	 fac.add(new Factura("188885", "ASSS",809, 33));
    	 fac.add(new Factura("188886", "GG",909, 3));
    	 fac.add(new Factura("188887", "Joosese",9, 233));
     }
     
     public int Tamaño() {
    	 return fac.size();
     }
     
     public Factura Obtener(int i) {
    	 return fac.get(i);
     }
     
     public Double SumaImporte() {
    	 double suma=0;
    	 
    	 for(int i=0;i<Tamaño();i++) {
    		 suma+=Obtener(i).ImporteFactura();
    	 }
    	 return suma;
     }
     
     public Double PromedioFac() {
    	 double suma=0;
    	 
    	 for(int i=0;i<Tamaño();i++) {
    		 suma+=Obtener(i).ImporteFactura();
    	 }
    	 return suma/Tamaño();
     }
     
     public Double MenorImporte() {
    	 Double Menor=Double.MAX_VALUE;
    	 
    	 for(int i=0;i<Tamaño();i++) {
    		 if(Obtener(i).ImporteFactura()<Menor) {
    			Menor=Obtener(i).ImporteFactura();
    		 }
    	 }
    	 return Menor;
     }
     
     public Double MayorImporte() {
    	 Double Mayor=Double.MIN_NORMAL;
    	 
    	 for(int i=0;i<Tamaño();i++) {
    		 if(Obtener(i).ImporteFactura()>Mayor) {
    			 Mayor=Obtener(i).ImporteFactura();
    		 }
    	 }
    	 return Mayor;
     }
     
     public String NombreEmpresaMenorFac() {
    	
    	for(int i=0;i<Tamaño();i++) {
    		if(Obtener(i).ImporteFactura()<PromedioFac()){
    			return Obtener(i).getEmpresa();
    		}
    	}
    	return "No se Encuentra Ni uno";
     }
     
     
}
