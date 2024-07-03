package Hijo;
import Padre.Animal;
import Hijo.Mamifero;

public class Perro extends Mamifero{
	
	public String mensaje(){
		return "Soy un perro";
	}
	
	public String HacerRuido(){
	return "Ladrar";	
	}
}
