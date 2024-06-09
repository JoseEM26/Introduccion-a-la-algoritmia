package guia;

public class Proyect {
  public int codigo,horas;
  public String nombre;
  public double tarifa;
  
  public double SueldoBruto(){
	  return horas*tarifa;
  }
  public double Descuento(){
	  if(SueldoBruto()<4500){
		  return SueldoBruto()*0.12;
	  }
	  else if(SueldoBruto()>=4500 &&
			  SueldoBruto()<6500){
		  return SueldoBruto()*0.14;
	  }
	  else
		  return SueldoBruto()*0.16;
  }
  public double SueldoNeto(){
	  return SueldoBruto()-Descuento();
  }
  
  
  
  
  
  
  
  
  
}
