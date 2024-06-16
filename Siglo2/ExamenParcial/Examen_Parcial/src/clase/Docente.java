package clase;

public class Docente {
   private int codigo;
   private String nombres;
   private int horas;
   private double tarifa;
   ///////////////////////////////////////////////////////////////////////
public Docente(int codigo, String nombres, int horas, double tarifa) {
	this.codigo = codigo;
	this.nombres = nombres;
	this.horas = horas;
	this.tarifa = tarifa;
}
  ///////////////////////////////////////////////////////////////////////

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public int getHoras() {
	return horas;
}

public void setHoras(int horas) {
	this.horas = horas;
}

public double getTarifa() {
	return tarifa;
}

public void setTarifa(double tarifa) {
	this.tarifa = tarifa;
}

public double Sueldo() {
	return horas*tarifa;
}
   
   
	
	
	
	
	
	
	
	
}
