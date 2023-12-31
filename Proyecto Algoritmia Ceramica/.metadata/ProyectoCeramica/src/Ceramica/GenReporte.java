package Ceramica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ceramica.Menu;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class GenReporte extends JDialog implements ItemListener, ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JComboBox cmbTipoReporte;
	private JButton btnCerrar;
	private JTextArea txtAreaResultado;
	private JScrollPane scpScroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenReporte dialog = new GenReporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenReporte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto Algoritmia Ceramica\\img\\reporte.png"));
		setTitle("Generar reportes");
		setBounds(100, 100, 601, 305);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(152, 251, 152));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Tipo de reporte");
			lblNewLabel.setBounds(10, 11, 89, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			cmbTipoReporte = new JComboBox();
			cmbTipoReporte.addItemListener(this);
			cmbTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Comparaci\u00F3n de precios con el precio promedio", "Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima", "Estad\u00EDstica sobre el precio"}));
			cmbTipoReporte.setBounds(105, 7, 320, 22);
			contentPanel.add(cmbTipoReporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(485, 7, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			scpScroll = new JScrollPane();
			scpScroll.setBounds(10, 36, 564, 214);
			contentPanel.add(scpScroll);
			{
				txtAreaResultado = new JTextArea();
				scpScroll.setViewportView(txtAreaResultado);
				
				ItemEvent itemEvent = new ItemEvent(cmbTipoReporte, ItemEvent.ITEM_STATE_CHANGED, cmbTipoReporte.getItemAt(0), ItemEvent.SELECTED);
		        itemStateChanged(itemEvent);
			}
		}
	}
	
	String calcularComparacionPrecioPromedio0(double precio0) {
		precio0=Menu.precio0;
		if(precio0 > 57.73)  {
			return "m�s que el promedio";
		}
		else if(precio0 == 57.73) {
			return "igual que el promedio";
		}
		else
			return "menos que el promedio";
	}
	
	String calcularComparacionPrecioPromedio1(double precio1) {
		precio1=Menu.precio1;
		if(precio1 > 57.73)  {
			return "m�s que el promedio";
		}
		else if(precio1 == 57.73) {
			return "igual que el promedio";
		}
		else
			return "menos que el promedio";
	}
	
	String calcularComparacionPrecioPromedio2(double precio2) {
		precio2=Menu.precio2;
		if(precio2 > 57.73)  {
			return "m�s que el promedio";
		}
		else if(precio2 == 57.73) {
			return "igual que el promedio";
		}
		else
			return "menos que el promedio";
	}
	
	String calcularComparacionPrecioPromedio3(double precio3) {
		precio3=Menu.precio3;
		if(precio3 > 57.73)  {
			return "m�s que el promedio";
		}
		else if(precio3 == 57.73) {
			return "igual que el promedio";
		}
		else
			return "menos que el promedio";
	}
	
	String calcularComparacionPrecioPromedio4(double precio4) {
		precio4=Menu.precio4;
		if(precio4 > 57.73)  {
			return "m�s que el promedio";
		}
		else if(precio4 == 57.73) {
			return "igual que el promedio";
		}
		else
			return "menos que el promedio";
	}
	
	
	String calcularComparacionCajas0(double cajasVendidas0) {
		cajasVendidas0=Vender.cantidadCeramicos0;
		if(cajasVendidas0 > Menu.cantidadOptima)  {
			return "m�s que la cantidad �ptima";
		}
		else if(cajasVendidas0 == Menu.cantidadOptima) {
			return "igual que la cantidad �ptima";
		}
		else
			return "menos que la cantidad �ptima";
	}
	
	String calcularComparacionCajas1(double cajasVendidas1) {
		cajasVendidas1=Vender.cantidadCeramicos1;
		if(cajasVendidas1 > Menu.cantidadOptima)  {
			return "m�s que la cantidad �ptima";
		}
		else if(cajasVendidas1 == Menu.cantidadOptima) {
			return "igual que la cantidad �ptima";
		}
		else
			return "menos que la cantidad �ptima";
	}
	
	String calcularComparacionCajas2(double cajasVendidas2) {
		cajasVendidas2=Vender.cantidadCeramicos2;
		if(cajasVendidas2 > Menu.cantidadOptima)  {
			return "m�s que la cantidad �ptima";
		}
		else if(cajasVendidas2 == Menu.cantidadOptima) {
			return "igual que la cantidad �ptima";
		}
		else
			return "menos que la cantidad �ptima";
	}
	
	String calcularComparacionCajas3(double cajasVendidas3) {
		cajasVendidas3=Vender.cantidadCeramicos3;
		if(cajasVendidas3 > Menu.cantidadOptima)  {
			return "m�s que la cantidad �ptima";
		}
		else if(cajasVendidas3 == Menu.cantidadOptima) {
			return "igual que la cantidad �ptima";
		}
		else
			return "menos que la cantidad �ptima";
	}
	
	String calcularComparacionCajas4(double cajasVendidas4) {
		cajasVendidas4=Vender.cantidadCeramicos4;
		if(cajasVendidas4 > Menu.cantidadOptima)  {
			return "m�s que la cantidad �ptima";
		}
		else if(cajasVendidas4 == Menu.cantidadOptima) {
			return "igual que la cantidad �ptima";
		}
		else
			return "menos que la cantidad �ptima";
	}
	
	double calcularPrecioMayor() {
		double precio0, precio1, precio2, precio3, precio4, precioMayor = 0.0;
		precio0 = Menu.precio0;
		precio1 = Menu.precio1;
		precio2 = Menu.precio2;
		precio3 = Menu.precio3;
		precio4 = Menu.precio4;
		precioMayor = Math.max(precio0, precio1);
		precioMayor = Math.max(precioMayor, precio2);
		precioMayor = Math.max(precioMayor, precio3);
		precioMayor = Math.max(precioMayor, precio4);
		return precioMayor;
	}
	
	double calcularPrecioMenor() {
		double precio0, precio1, precio2, precio3, precio4, precioMenor = 0.0;
		precio0 = Menu.precio0;
		precio1 = Menu.precio1;
		precio2 = Menu.precio2;
		precio3 = Menu.precio3;
		precio4 = Menu.precio4;
		precioMenor = Math.min(precio0, precio1);
		precioMenor = Math.min(precioMenor, precio2);
		precioMenor = Math.min(precioMenor, precio3);
		precioMenor = Math.min(precioMenor, precio4);
		return precioMenor;
	}
	
	
	
	public void itemStateChanged(ItemEvent e) {
		
		int cantidadOptima,cantidadVentas0=0,cantidadVentas1=0,cantidadVentas2=0,cantidadVentas3=0,cantidadVentas4=0,cantidadCajasVendidas0=0,
		cantidadCajasVendidas1=0,cantidadCajasVendidas2=0,cantidadCajasVendidas3=0,cantidadCajasVendidas4=0,
		comparacionCajas0,comparacionCajas1,comparacionCajas2,comparacionCajas3,comparacionCajas4;
		double importeTotalVendido0=0,importeTotalVendido1=0,importeTotalVendido2=0,importeTotalVendido3=0,importeTotalVendido4=0, 
		aporteCuotaDiaria0=0,aporteCuotaDiaria1=0,aporteCuotaDiaria2=0,aporteCuotaDiaria3=0,aporteCuotaDiaria4=0,
		precio0,precio1,precio2,precio3,precio4,precioPromedio0,precioPromedio1,precioPromedio2,precioPromedio3,
		precioPromedio4,comparacion0,comparacion1,comparacion2,comparacion3,comparacion4;
		String nombreElemento,modelo0="",modelo1="",modelo2="",modelo3="",modelo4="";
		
		nombreElemento = cmbTipoReporte.getSelectedItem().toString();
		
			
		
		
		switch (nombreElemento) {
		    case "Ventas por modelo":
		    	
		    	modelo0 = Menu.modelo0;
		    	cantidadVentas0 = Vender.numeroVentaActual0;
		    	cantidadCajasVendidas0 = Vender.cantidadCeramicos0;
		    	importeTotalVendido0 = Vender.importeTotalAcumulado0;
		    	aporteCuotaDiaria0 = (importeTotalVendido0/Menu.cuotaDiaria) * 100;
		    	
		    	modelo1 = Menu.modelo1;
		    	cantidadVentas1 = Vender.numeroVentaActual1;
		    	cantidadCajasVendidas1 = Vender.cantidadCeramicos1;
		    	importeTotalVendido1 = Vender.importeTotalAcumulado1;
		    	aporteCuotaDiaria1 = (importeTotalVendido1/Menu.cuotaDiaria) * 100;
		    	
		    	modelo2 = Menu.modelo2;
		    	cantidadVentas2 = Vender.numeroVentaActual2;
		    	cantidadCajasVendidas2 = Vender.cantidadCeramicos2;
		    	importeTotalVendido2 = Vender.importeTotalAcumulado2;
		    	aporteCuotaDiaria2 = (importeTotalVendido2/Menu.cuotaDiaria) * 100;
		    	
		    	modelo3 = Menu.modelo3;
		    	cantidadVentas3 = Vender.numeroVentaActual3;
		    	cantidadCajasVendidas3 = Vender.cantidadCeramicos3;
		    	importeTotalVendido3 = Vender.importeTotalAcumulado3;
		    	aporteCuotaDiaria3 = (importeTotalVendido3/Menu.cuotaDiaria) * 100;
		    	
		    	modelo4 = Menu.modelo4;
		    	cantidadVentas4 = Vender.numeroVentaActual4;
		    	cantidadCajasVendidas4 = Vender.cantidadCeramicos4;
		    	importeTotalVendido4 = Vender.importeTotalAcumulado4;
		    	aporteCuotaDiaria4 = (importeTotalVendido4/Menu.cuotaDiaria) * 100;	
		
		txtAreaResultado.setText("VENTAS POR MODELO" + "\n");
		txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo0 + "\n");
		txtAreaResultado.append("Cantidad de ventas" + "\t:" + " " + cantidadVentas0 + "\n");
		txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas0 + "\n");
		txtAreaResultado.append("Importe total vendido" + "\t:" + " " + "S/." + String.format("%.2f",importeTotalVendido0) + "\n");
		txtAreaResultado.append("Aporte a la cuota diaria" + "\t:" + " " + String.format("%.2f",aporteCuotaDiaria0) + "%" + "\n");
		
		txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo1 + "\n");
		txtAreaResultado.append("Cantidad de ventas" + "\t:" + " " + cantidadVentas1 + "\n");
		txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas1 + "\n");
		txtAreaResultado.append("Importe total vendido" + "\t:" + " " + "S/." + String.format("%.2f",importeTotalVendido1) + "\n");
		txtAreaResultado.append("Aporte a la cuota diaria" + "\t:" + " " + String.format("%.2f",aporteCuotaDiaria1) + "%" + "\n");
		
		txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo2 + "\n");
		txtAreaResultado.append("Cantidad de ventas" + "\t:" + " " + cantidadVentas2 + "\n");
		txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas2 + "\n");
		txtAreaResultado.append("Importe total vendido" + "\t:" + " " + "S/." + String.format("%.2f",importeTotalVendido2) + "\n");
		txtAreaResultado.append("Aporte a la cuota diaria" + "\t:" + " " + String.format("%.2f",aporteCuotaDiaria2) + "%" + "\n");
		
		txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo3 + "\n");
		txtAreaResultado.append("Cantidad de ventas" + "\t:" + " " + cantidadVentas3 + "\n");
		txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas3 + "\n");
		txtAreaResultado.append("Importe total vendido" + "\t:" + " " + "S/." + String.format("%.2f",importeTotalVendido3) + "\n");
		txtAreaResultado.append("Aporte a la cuota diaria" + "\t:" + " " + String.format("%.2f",aporteCuotaDiaria3) + "%" + "\n");
		
		txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo4 + "\n");
		txtAreaResultado.append("Cantidad de ventas" + "\t:" + " " + cantidadVentas4 + "\n");
		txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas4 + "\n");
		txtAreaResultado.append("Importe total vendido" + "\t:" + " " + "S/." + String.format("%.2f",importeTotalVendido4) + "\n");
		txtAreaResultado.append("Aporte a la cuota diaria" + "\t:" + " " + String.format("%.2f",aporteCuotaDiaria4) + "%" + "\n");
		break;
		    case "Comparaci�n de precios con el precio promedio":
		    	
		    	modelo0=Menu.modelo0;
		    	precio0=Menu.precio0;
		    	precioPromedio0=57.73;
		    	comparacion0=precio0-precioPromedio0;
		    	
		    	modelo1=Menu.modelo1;
		    	precio1=Menu.precio1;
		    	precioPromedio1=57.73;
		    	comparacion1=precio1-precioPromedio1;
		    	
		    	modelo2=Menu.modelo2;
		    	precio2=Menu.precio2;
		    	precioPromedio2=57.73;
		    	comparacion2=precio2-precioPromedio2;
		    	
		    	modelo3=Menu.modelo3;
		    	precio3=Menu.precio3;
		    	precioPromedio3=57.73;
		    	comparacion3=precio3-precioPromedio3;
		    	
		    	modelo4=Menu.modelo4;
		    	precio4=Menu.precio4;
		    	precioPromedio4=57.73;
		    	comparacion4=precio4-precioPromedio4;
		    	
		    	txtAreaResultado.setText("COMPARACI�N DE PRECIOS CON EL PRECIO PROMEDIO" + "\n");
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo0 + "\n");
				txtAreaResultado.append("Precio" + "\t" + "\t:" + " " + precio0 + "\n");
				txtAreaResultado.append("Precio promedio" + "\t:" + " " + precioPromedio0 + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + String.format("%.2f",Math.abs(comparacion0)) + " " 
				+ calcularComparacionPrecioPromedio0(57.73) + " " + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo1 + "\n");
				txtAreaResultado.append("Precio" + "\t" + "\t:" + " " + precio1 + "\n");
				txtAreaResultado.append("Precio promedio" + "\t:" + " " + precioPromedio1 + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + String.format("%.2f",Math.abs(comparacion1)) + " "
				+ calcularComparacionPrecioPromedio1(57.73) + " " + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo2 + "\n");
				txtAreaResultado.append("Precio" + "\t" + "\t:" + " " + precio2 + "\n");
				txtAreaResultado.append("Precio promedio" + "\t:" + " " + precioPromedio2 + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + String.format("%.2f",Math.abs(comparacion2)) + " "
				+ calcularComparacionPrecioPromedio2(57.73) + " " + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo3 + "\n");
				txtAreaResultado.append("Precio" + "\t" + "\t:" + " " + precio3 + "\n");
				txtAreaResultado.append("Precio promedio" + "\t:" + " " + precioPromedio3 + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + String.format("%.2f",Math.abs(comparacion3)) + " "
				+ calcularComparacionPrecioPromedio3(57.73) + " " + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo4 + "\n");
				txtAreaResultado.append("Precio" + "\t" + "\t:" + " " + precio4 + "\n");
				txtAreaResultado.append("Precio promedio" + "\t:" + " " + precioPromedio4 + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + String.format("%.2f",Math.abs(comparacion4)) + " "
				+ calcularComparacionPrecioPromedio4(57.73) + " " + "\n");
				break;
		    case "Comparaci�n de cajas vendidas con la cantidad �ptima":
		    	
		    	modelo0=Menu.modelo0;
		    	cantidadCajasVendidas0 = Vender.cantidadCeramicos0;
		    	cantidadOptima=Menu.cantidadOptima;
		    	comparacionCajas0=cantidadCajasVendidas0-cantidadOptima;
		    	
		    	modelo1=Menu.modelo1;
		    	cantidadCajasVendidas1 = Vender.cantidadCeramicos1;
		    	cantidadOptima=Menu.cantidadOptima;
		    	comparacionCajas1=cantidadCajasVendidas1-cantidadOptima;
		    	
		    	modelo2=Menu.modelo2;
		    	cantidadCajasVendidas2 = Vender.cantidadCeramicos2;
		    	cantidadOptima=Menu.cantidadOptima;
		    	comparacionCajas2=cantidadCajasVendidas2-cantidadOptima;
		    	
		    	modelo3=Menu.modelo3;
		    	cantidadCajasVendidas3 = Vender.cantidadCeramicos3;
		    	cantidadOptima=Menu.cantidadOptima;
		    	comparacionCajas3=cantidadCajasVendidas3-cantidadOptima;
		    	
		    	modelo4=Menu.modelo4;
		    	cantidadCajasVendidas4 = Vender.cantidadCeramicos4;
		    	cantidadOptima=Menu.cantidadOptima;
		    	comparacionCajas4=cantidadCajasVendidas4-cantidadOptima;
		    	
		    	
		    	txtAreaResultado.setText("COMPARACI�N DE CAJAS VENDIDAS CON LA CANTIDAD �PTIMA" + "\n");
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo0 + "\n");
				txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas0 + "\n");
				txtAreaResultado.append("Cantidad �ptima" + "\t:" + " " + cantidadOptima + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + Math.abs(comparacionCajas0) + " " +
				calcularComparacionCajas0(Menu.cantidadOptima) + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo1 + "\n");
				txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas1 + "\n");
				txtAreaResultado.append("Cantidad �ptima" + "\t:" + " " + cantidadOptima + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + Math.abs(comparacionCajas1) + " " +
				calcularComparacionCajas1(Menu.cantidadOptima) + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo2 + "\n");
				txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas2 + "\n");
				txtAreaResultado.append("Cantidad �ptima" + "\t:" + " " + cantidadOptima + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + Math.abs(comparacionCajas2) + " " +
				calcularComparacionCajas2(Menu.cantidadOptima) + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo3 + "\n");
				txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas3 + "\n");
				txtAreaResultado.append("Cantidad �ptima" + "\t:" + " " + cantidadOptima + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + Math.abs(comparacionCajas3) + " " +
				calcularComparacionCajas3(Menu.cantidadOptima) + "\n");
				
				txtAreaResultado.append("\n" + "Modelo" + "\t" + "\t:" + " " + modelo4 + "\n");
				txtAreaResultado.append("Cantidad de cajas vendidas" + "\t:" + " " + cantidadCajasVendidas4 + "\n");
				txtAreaResultado.append("Cantidad �ptima" + "\t:" + " " + cantidadOptima + "\n");
				txtAreaResultado.append("Comparaci�n" + "\t" + "\t:" + " " + Math.abs(comparacionCajas4) + " " +
				calcularComparacionCajas4(Menu.cantidadOptima) + "\n"); 
				break;
			default:
				
				precioPromedio0=57.73;
				
		    	txtAreaResultado.setText("ESTAD�STICA SOBRE EL PRECIO" + "\n");
				txtAreaResultado.append("\n" + "Precio promedio" + "\t:" + " " + "S/." + " " + precioPromedio0 + "\n");
				txtAreaResultado.append("Precio mayor" + "\t" + "\t:" + " " + "S/." + " " + calcularPrecioMayor() + "\n");
				txtAreaResultado.append("Precio menor" + "\t" + "\t:" + " " + "S/." + " " + calcularPrecioMenor() + "\n");	
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		dispose();
	}
	
	

}
