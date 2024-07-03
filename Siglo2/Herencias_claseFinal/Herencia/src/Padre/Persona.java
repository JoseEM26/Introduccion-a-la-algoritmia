package Padre;

public class Persona {

	protected String nombre, apellido;
	protected int edad;
	
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String GenerarCorreo(){
		return nombre+"."+apellido+"@cibertec.edu.pe";
	}
	
	public String datosDeLaPersona(){
		return "Nombre: "+nombre+"\n"+
				"Apellido: "+apellido+"\n"+
				"Edad: "+edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
