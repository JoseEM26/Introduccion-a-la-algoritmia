package clases;

public class Empleado {
    private String nombre;
    private int edad;
    private int dni;
    private int añoIngreso;
    private String categoria;
    
	public Empleado(String nombre, int edad, int dni, int añoIngreso, String categoria) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.añoIngreso = añoIngreso;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
    
    public void CalcularCategoria() {
    	int anioEmpresa=2024-añoIngreso;
    	
    	if(anioEmpresa>20) {
    		 categoria="A";
    	}else if(anioEmpresa>10 && anioEmpresa<20) {
    		 categoria="B";
    	}else {
    		 categoria="C";
    	}
    }
    
    public int CalcularSueldo() {
    	int sueldo=0;
    	
    	if(categoria=="A") {
    		return sueldo=(edad*3)+5000;
    	}else if(categoria=="B") {
    		return sueldo=(edad*3)+4000;
    	}else if(categoria=="C"){
    		return sueldo=(edad*3)+3000;
    	}else {
    		return sueldo=0;
    	}
    }
    
    public String CorreoElectronico() {
    	return nombre+edad+dni+categoria+"@cibertec.edu.pe";
    }
	
	
	
	
	
	
	
	
	
}
