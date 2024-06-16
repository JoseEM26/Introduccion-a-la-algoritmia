package clases;

public class Empleado {
	private String Nombre;
	private int edad;
	private int dni;
	private int categoria;
	private static int cantidad=0;
	private static final String empresa="SEMILLASSAC";
	
	
	public Empleado(String nombre, int edad, int dni, int categoria ) {
		this.Nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.categoria = categoria;
		cantidad++;
	    
	}


	


	public Empleado(String nombre, int dni) {
		this.Nombre = nombre;
		this.dni = dni;
		this.edad=0;
		this.categoria=99;
		cantidad++;
	}





	public Empleado() {
		this.Nombre="vacio";
		this.edad=0;
		this.dni=12345678;
		this.categoria=99;
		cantidad++;
	}





	public String getNombre() {
		return Nombre;
	}





	public void setNombre(String nombre) {
		Nombre = nombre;
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





	public int getCategoria() {
		return categoria;
	}





	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}





	public static int getCantidad() {
		return cantidad;
	}





	public static void setCantidad(int cantidad) {
		Empleado.cantidad = cantidad;
	}





	public static String getEmpresa() {
		return empresa;
	}
	
	public double getSueldoBruto(Empleado x){
		if(x.categoria==0){
			return 2500.89;
		}
		else if(x.categoria==1){
			return 3250.90;
		}
		else if(x.categoria==2){
			return 4199.80;
		}
		else{
			return 0;
		}
	}
	
	public double getDescuento(Empleado x){
		if(x.categoria==0){
			return getSueldoBruto(x)*0.05;
		}
		else if(x.categoria==1){
			return getSueldoBruto(x)*0.07;
		}
		else if(x.categoria==2){
			return getSueldoBruto(x)*0.10;
		}else{
			return 0;
		}
	}
	
	public double getSueldoNeto(Empleado x){
		return getSueldoBruto(x)-getDescuento(x);
	}
	
	
	public double getProyeccion(Empleado x){
		return getSueldoNeto(x)*12+(((getSueldoBruto(x)*2)+100)+getSueldoBruto(x));
	}
	
	
	
	
	

}
