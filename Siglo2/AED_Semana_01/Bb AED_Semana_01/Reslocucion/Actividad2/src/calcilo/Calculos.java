package calcilo;

public class Calculos {
  public String nombre;
  public String apellido;
  public int edad;
  public double peso,estatura;
   
  public String EstadoPersona() {
  if(edad<18) {
	  return "menor de edad";
	    }
  else {
	  return "Mayor de edad";
  }
	    	
  }

  public double IndiceMasaCorporal() {
	  return peso/estatura;
  }
}
  
