package com.ciberfarma.model;

import lombok.Data;

@Data
public class DetalleBoleta {
	private String idprod;
	private double preciovta;
	private int cantidad;
	// campos auxiliares
	private String nomprod;
	private double importe;
	
}
