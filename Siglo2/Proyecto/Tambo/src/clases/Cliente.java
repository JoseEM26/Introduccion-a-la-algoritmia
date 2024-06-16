package clases;

public class Cliente {
    private int codigoCliente;
    private String nombres , apellido , direccion, telefono,dni;
	
    public Cliente(int codigoCliente, String nombres, String apellido, String direccion, String telefono, String dni) {
		this.codigoCliente = codigoCliente;
		this.nombres = nombres;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}
    public Cliente(int codigoCliente,String nombres,String apellido) {	
        this(codigoCliente,nombres,apellido,"DIRECCIONXXX","999999999","7777777");
    }
    
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
	
	
	
	
	
	
}
