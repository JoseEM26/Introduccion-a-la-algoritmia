package clase;

public class Factura {
    private String ruc;
    private String empresa;
    private int unidades;
    private double PrecioUnidad;
    
    private static int Contador;
    private static double SumaImporteFac;
    private static final String Sunat;
    
    static {
    	Contador=0;
    	SumaImporteFac=0.0;
    	Sunat="Sunat";
    }

	public Factura(String ruc, String empresa, int unidades, double precioUnidad) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.PrecioUnidad = precioUnidad;
		Contador++;
		SumaImporteFac+=this.GetImporteFacturado();
	}
	
	public Factura(String ruc,String empresa) {
		this(ruc,empresa,10,50.0);
	}
	
	public Factura() {
		this("111111111","MN-GLobal SRL");
	}
	
//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnidad() {
		return PrecioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		PrecioUnidad = precioUnidad;
	}

	public static int getContador() {
		return Contador;
	}

	public static void setContador(int contador) {
		Contador = contador;
	}

	public static double getSumaImporteFac() {
		return SumaImporteFac;
	}

	public static void setSumaImporteFac(double sumaImporteFac) {
		SumaImporteFac = sumaImporteFac;
	}

	public static String getSunat() {
		return Sunat;
	}
	
	public double GetImporteFacturado() {
		return this.unidades*this.PrecioUnidad;
	}
	
	
















}
