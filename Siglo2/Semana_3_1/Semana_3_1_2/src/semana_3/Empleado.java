package semana_3;

public class Empleado {
    private int codigo;
    private String nombre;
    private int categorioa;
    private int NumeroCel;
    
    private static int contador;
    private static double AcumuladorSueldos;
    private static final double FactorDesc;
    private static double SumatoriaTotal;
    
    static {
    	FactorDesc=0.15;
    	contador=0;
    	AcumuladorSueldos=0;
    }

	public Empleado(int codigo, String nombre, int categorioa, int numeroCel) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categorioa = categorioa;
		this.NumeroCel = numeroCel;
		
		contador++;
		this.AcumuladorSueldos+=this.SueldoNeto();
	}

	
	



	public Empleado(int codigo, String nombre) {
		this(codigo,nombre,2,99999999);
	}
	
	public Empleado() {
		this(4444, "ninguno");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategorioa() {
		return categorioa;
	}

	public void setCategorioa(int categorioa) {
		this.categorioa = categorioa;
	}

	public int getNumeroCel() {
		return NumeroCel;
	}

	public void setNumeroCel(int numeroCel) {
		NumeroCel = numeroCel;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Empleado.contador = contador;
	}

	public static double getAcumuladorSueldos() {
		return AcumuladorSueldos;
	}

	public static void setAcumuladorSueldos(double acumuladorSueldos) {
		AcumuladorSueldos = acumuladorSueldos;
	}

	public static double getFactordesc() {
		return FactorDesc;
	}
    
	public double SueldoBruto() {
		switch (categorioa) {
		case 0: {
			return 7200;
			
		}
		case 1: {
			return 6300;
		}
		default:
			return 6300;
		}
	}
    
    public double Descuento() {
    	return SueldoBruto()*(FactorDesc);
    }
    
    public double SueldoNeto() {
    	return SueldoBruto()-Descuento();
    }
    

    
    
    
    
    
    
    
    
}
