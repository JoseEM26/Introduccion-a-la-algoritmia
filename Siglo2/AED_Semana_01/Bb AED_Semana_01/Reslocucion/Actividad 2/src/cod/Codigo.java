package cod;

public class Codigo {
  public int codigo;
  public String nombre;
  public int Categoria;
  public int Cel;
  
    public double SueldoCoordinador() {
    	  if(Categoria==0) {
    		  return 8500;
    	  }
    	  else if(Categoria==1) {
    		  return 6850;
    	  }
    	  else
    		  return 5500;
    }
  
}
