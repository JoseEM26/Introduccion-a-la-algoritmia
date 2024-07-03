package Hijo;
import Padre.Mamifero;
import interfaz.InterfazA;


public class Gato extends Mamifero implements InterfazA{
	public String mensaje(){
		return "Soy un gato";
	}
	
	public String hacerRuido(){
		return "miau";
	}
	
	public String cuidado(){
		return "el gato puede tener rabia";
	}

	@Override
	public String hacerruido() {
		// TODO Auto-generated method stub
		return "miau";
	}
	
}
