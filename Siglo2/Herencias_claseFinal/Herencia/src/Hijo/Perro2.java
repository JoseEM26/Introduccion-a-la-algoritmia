package Hijo;
import Padre.Mamifero;
import interfaz.*;

public class Perro2 extends Mamifero implements InterfazA, InterfazB{
	
	public String hacerRuido(){
		return "el perro puede tener rabia";
	}
	
	public String peligro(){
		return "el perro muerde";
	}

	@Override
	public String cuidado() {
		// TODO Auto-generated method stub
		return "el perro muerde";
	}

	@Override
	public String hacerruido() {
		// TODO Auto-generated method stub
		return "el perro puede tener rabia";
	}
}
