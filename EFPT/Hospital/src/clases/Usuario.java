package clases;

public class Usuario {
	private String dni;
	private String nombre;
	private String apellido;
	private String especialidad;
	private String contraseña;
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param especialidad
	 * @param contraseña
	 */
	public Usuario(String dni, String nombre, String apellido, String especialidad, String contraseña) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.contraseña = contraseña;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
    public String toString() {
        return dni + "," + nombre + "," + apellido + "," + especialidad + "," + contraseña;
    }
	
	
}
