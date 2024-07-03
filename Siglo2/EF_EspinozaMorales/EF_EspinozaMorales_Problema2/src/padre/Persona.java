package padre;

public class Persona {
	protected String nombre;
	protected int dni,telefono;
	
	public Persona(String nombre, int dni, int telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public String mostrarDatos() {
		return "Nombre:\t"+nombre+"\n"+
				"DNI:\t"+dni+"\n"+
				"Telefono:\t"+telefono;
				
	}
	
	

}
