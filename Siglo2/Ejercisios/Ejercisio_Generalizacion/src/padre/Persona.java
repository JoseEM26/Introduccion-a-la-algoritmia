package padre;

public class Persona {
   private String nombre,apellido;
   private int edad;
   
public Persona(String nombre, String apellido, int edad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}

public String GenerarCorreo() {
	return nombre+"."+apellido+"@cibertec.edu.pe";
}

public String DatosPersonales() {
	return "Nombre:"+"\t"+nombre+"\n"+
			"Apellido:"+"\t"+apellido+"\n"+
			"Edad:"+"\t"+edad;
}
   
   
   
}
