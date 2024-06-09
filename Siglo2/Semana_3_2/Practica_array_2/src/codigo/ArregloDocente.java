package codigo;
import java.util.ArrayList;

public class ArregloDocente {

	ArrayList<Docente>doc;
	
	public ArregloDocente() {
		doc=new ArrayList<Docente>();
		doc.add(new Docente(1111,"Jose",10,100));
		doc.add(new Docente(1112,"Espinoza",11,1000));
		doc.add(new Docente(1113,"Angel",100,10));
		doc.add(new Docente(1114,"Mamani",23,1400));
		doc.add(new Docente(1115,"Diego",11,177));
		doc.add(new Docente(1116,"Ariadna",15,800));
		doc.add(new Docente(1117,"Vannesa",15,500));
		doc.add(new Docente(1118,"Naomi",16,1400));
		
	}
	
	public int Tamaño() {
		return doc.size();
	}
	
	public Docente Obtener(int i) {
		return doc.get(i);
	}
	
	public double sueldoPromedio() {
	    double suma = 0; 
	    for (int i=0;i<Tamaño();i++) { 
	        suma +=Obtener(i).Sueldo();
	    }
	    return suma / doc.size(); 
	}
	////////////////////////////////////////////////////////////////////////////
	public double SueldoMenor() {
		double Menor=Double.MAX_VALUE;
		
	    for(int i=0;i<Tamaño();i++) {
	    	if(Obtener(i).Sueldo()<Menor) {
	    		Menor=Obtener(i).Sueldo();
	    	}
	    }
	return Menor;
	}
	////////////////////////////////////////////////////////////////////////////

	public double SueldoMayor() {
double Mayor=Double.MIN_VALUE;
		
	    for(int i=0;i<Tamaño();i++) {
	    	if(Obtener(i).Sueldo()>Mayor) {
	    		Mayor=Obtener(i).Sueldo();
	    	}
	    }
	return Mayor;
	}
	////////////////////////////////////////////////////////////////////////////

	public double TarifaMenor() {
double Menor=Double.MAX_VALUE;
		
	    for(int i=0;i<Tamaño();i++) {
	    	if(Obtener(i).getTarifa()<Menor) {
	    		Menor=Obtener(i).getTarifa();
	    	}
	    }
	return Menor;
	}
	////////////////////////////////////////////////////////////////////////////

	public double TarifaMayor() {
double Mayor=Double.MIN_VALUE;
		
	    for(int i=0;i<Tamaño();i++) {
	    	if(Obtener(i).getTarifa()>Mayor) {
	    		Mayor=Obtener(i).getTarifa();
	    	}
	    }
	return Mayor;
	}
	////////////////////////////////////////////////////////////////////////////

	
	
	
	
	
	
	
	
	
	
	
}
