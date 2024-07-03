package padre;

public class Figura {
	private int x,y;

	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String Ubicacion() {
		return "Ubicacion X:"+x+"\n"+
	           "Ubicacion Y"+y;
	}
	
	

}
