package arreglos;

import java.util.ArrayList;

import clases.Empleado;

public class ArregloEmpleado {
	ArrayList<Empleado>emp;
	
	public ArregloEmpleado() {
		emp=new ArrayList<Empleado>();
		emp.add(new Empleado("Jose"  , 25, 7777771, 2013, "A"));
		emp.add(new Empleado("Miguel", 28, 7777772, 2011, "B"));
		emp.add(new Empleado("Lucia" , 40, 7777773, 2023, "A"));
		emp.add(new Empleado("Veronica", 70, 7777774, 2010, "B"));
		emp.add(new Empleado("Penelope", 30, 7777775, 2011, "C"));
		emp.add(new Empleado("Mat"   , 25, 7777776, 2010, "C"));
	}
	
	public void Adicionar(Empleado x) {
		 emp.add(x);
	}
	
	public int Tamaño() {
		return emp.size();
	}
	
	public Empleado Obtener(int x) {
		return emp.get(x);
	}
	
	public String ContarCategoria() {
		int categoriaA=0;
		int categoriaB=0;
		int categoriaC=0;
		
		for(int i=0;i<Tamaño();i++) {
			if(Obtener(i).getCategoria()=="A") {
				categoriaA++;
			}if(Obtener(i).getCategoria()=="B") {
				categoriaB++;
			}if(Obtener(i).getCategoria()=="C") {
				categoriaC++;
			}
		}
		
 return "En la categoria A se encuentran "+categoriaA+"Empleados\n"+
		"En la categoria B se encuentran "+categoriaB+"Empleados\n"+
		"En la categoria C se encuentran "+categoriaC+"Empleados\n";
		
	}
	
	public double SueldoPromedio() {
		int acumulador=0;
		for(int i=0;i<Tamaño();i++) {
			acumulador+=Obtener(i).CalcularSueldo();
		}
		return acumulador/Tamaño();
	}
	
	public int SueldoMayor() {
		int mayor=Integer.MIN_VALUE;
		
		for(int i=0;i<Tamaño();i++) {
			if(mayor<Obtener(i).CalcularSueldo()) {
				mayor=Obtener(i).CalcularSueldo();
			}
		}
		
		return mayor;
		}
	
	public int SueldoMenor() {
		int menor=Integer.MAX_VALUE;
		
		for(int i=0;i<Tamaño();i++) {
			if(menor>Obtener(i).CalcularSueldo()) {
				menor=Obtener(i).CalcularSueldo();
			}
		}
		
		return menor;
		}
	
	
	
	public String InformacionSueldo() {
 return "Sueldo Promedio: \t"+SueldoPromedio()+"\n"+
		"Sueldo Mayor: \t"+SueldoMayor()+"\n"+
		"Sueldo Menor: \t"+SueldoMenor();
	}
	
	public String TodosLosCorreos() {
		String correo="";
		for(int i=0;i<Tamaño();i++) {
				correo+=Obtener(i).CorreoElectronico()+"\n";
		}
		return correo;
	}

}
