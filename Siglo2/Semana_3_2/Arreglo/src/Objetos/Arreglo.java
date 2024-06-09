package Objetos;

public class Arreglo {

	private int[]n={25,27,22,24,29,20,23};
	
	public Arreglo(){}
	
	public int tamaño(){
		return n.length;
	}
	
	public int obtener(int i){
		return n[i];
	}
	
	public int sumaNumeros(){
		int suma=0;
		for(int i=0;i<tamaño();i++)
			suma += n[i];
		return suma;
	}
	
	public int posPrimerNumeroMenorA25(){
		for(int i=0;i<tamaño();i++)
			if (n[i]<25)
				return i;
		return -1;
	}
	
	public void generar(){
		for(int i=0;i<tamaño();i++)
			n[i]=aleatorio(1,26);	
	}
	
	private int aleatorio(int min, int max){
		return (int)((max-min+1)*Math.random())+min;
	}
	
}
