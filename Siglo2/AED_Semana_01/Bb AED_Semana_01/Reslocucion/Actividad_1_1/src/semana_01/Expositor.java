package semana_01;

public class Expositor {
    public int codigo;
    public String nombre;
    public int trabajdasHoras;
    public double HoraTarifa;
    
    public double SuelfoBruto() {
    	return trabajdasHoras*HoraTarifa;
    }
    public double DescAFP() {
    	return SuelfoBruto()*0.10;
    }
    public double DescEPS() {
    	return SuelfoBruto()*0.05;
    }
    public double SueldoNETO() {
    	return SuelfoBruto()-(DescAFP()+DescEPS());
    }
}
