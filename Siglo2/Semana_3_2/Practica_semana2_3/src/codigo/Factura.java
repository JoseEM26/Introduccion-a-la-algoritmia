package codigo;

public class Factura {
	private String ruc;
	private String empresa;
	private int unidades;
	private double PrecioUnitario;
	
	
	


	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.PrecioUnitario = precioUnitario;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public double getPrecioUnitario() {
		return PrecioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	
	public double ImporteFactura() {
		return unidades * PrecioUnitario;
	}
	
	
	

}
