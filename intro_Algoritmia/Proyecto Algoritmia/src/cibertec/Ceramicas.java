	package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ceramicas extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	// Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	//Contador
	public static int cantVendidas0; 
	public static int cantCajas0;
	public static double impAcumulado0;
	public static int cantVendidas1; 
	public static int cantCajas1;
	public static double impAcumulado1;
	public static int cantVendidas2; 
	public static int cantCajas2;
	public static double impAcumulado2;
	public static int cantVendidas3; 
	public static int cantCajas3;
	public static double impAcumulado3;
	public static int cantVendidas4; 
	public static int cantCajas4;
	public static double impAcumulado4;
	//Facturas de venta
	public static double ip0;
	public static double ip1;
	public static double ip2;
	public static double ip3;
	public static double ip4;
	public static double id;
	public static double ic0;
	public static double ic1;
	public static double ic2;
	public static double ic3;
	public static double ic4;
	public static double can;
	//Comparación de cajas vendidas con la cantidad óptima
	public static String Cprcn1;
	public static String Cprcn2;
	public static String Cprcn3;
	public static String Cprcn4;
	public static String Cprcn5;
	//Comparación de cajas vendidas con la cantidad óptima
	public static double precioMenorr;
	public static double precioMayor;
	public static double precioMedioo;
	
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ceramicas frame = new Ceramicas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ceramicas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 393);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem_3 = new JMenuItem("Salida");
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_1.add(separator);
		
		mntmNewMenuItem_1 = new JMenuItem("Consultar ceramica");
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JSeparator separator_9 = new JSeparator();
		mnNewMenu_1.add(separator_9);
		
		mntmNewMenuItem_2 = new JMenuItem("Lista de Ceramicos");
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JSeparator separator_10 = new JSeparator();
		mnNewMenu_1.add(separator_10);
		
		mntmNewMenuItem = new JMenuItem("Modificar Ceramico");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		
		JMenu mnNewMenu_1_1 = new JMenu("Venta");
		menuBar.add(mnNewMenu_1_1);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1_1.add(separator_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.addActionListener(this);
		mnNewMenu_1_1.add(mntmNewMenuItem_4);
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_1_1.add(separator_8);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Generar Reporte");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItem_5ActionPerformed(e);
			}
		});
		mnNewMenu_1_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1_2 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_1_2);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_1_2.add(separator_3);
		
		JMenuItem mntmNewMenuItem_4_3 = new JMenuItem("Configurar descuentos");
		mntmNewMenuItem_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConDescuentos confiDescuento=new ConDescuentos();
				confiDescuento.setVisible(true);
			}
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_4_3);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_1_2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_1_2.add(separator_5);
		
		JMenuItem mntmNewMenuItem_4_4 = new JMenuItem("Configurar obsequios");
		mntmNewMenuItem_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItem_4_4ActionPerformed(e);
			}
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_4_4);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_1_2.add(separator_7);
		
		JMenuItem mntmNewMenuItem_4_5 = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmNewMenuItem_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItem_4_5ActionPerformed(e);
			}
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_4_5);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_1_2.add(separator_6);
		
		JMenuItem mntmNewMenuItem_4_2 = new JMenuItem("Configurar cuota diaria");
		mntmNewMenuItem_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItem_4_2ActionPerformed(e);
			}
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_4_2);
		
		JMenu mnNewMenu_1_3 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1_3);
		
		JMenuItem mntmNewMenuItem_4_6 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItem_4_6ActionPerformed(e);
			}
		});
		mnNewMenu_1_3.add(mntmNewMenuItem_4_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == mntmNewMenuItem_4) {
			actionPerformedMntmNewMenuItem_4(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		consultaCeramica consultaCeramicap=new consultaCeramica();
		consultaCeramicap.setVisible(true);
		
		
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		listarCeramicas listarCeramicasp=new listarCeramicas();
		listarCeramicasp.setVisible(true);
		
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		modificarCeramica modificarCeramicap=new modificarCeramica();
		modificarCeramicap.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
		vender venderp=new vender();
		venderp.setVisible(true);
	}
	//Boton para salir o cerrar el programa
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		setVisible(false);
	}
	protected void mntmNewMenuItem_4_5ActionPerformed(ActionEvent e) {
		ConCantOptima optima=new ConCantOptima();
		optima.setVisible(true);
	}
	protected void mntmNewMenuItem_5ActionPerformed(ActionEvent e) {
		GenReport verventana=new GenReport();
		verventana.setVisible(true);
		
	}
	protected void mntmNewMenuItem_4_6ActionPerformed(ActionEvent e) {
		AcercaTienda acercaTiendaa=new AcercaTienda();
		acercaTiendaa.setVisible(true);
	}
	protected void mntmNewMenuItem_4_4ActionPerformed(ActionEvent e) {
		ConObsequios obsequio=new ConObsequios();
		obsequio.setVisible(true);
	}
	protected void mntmNewMenuItem_4_2ActionPerformed(ActionEvent e) {
		ConCuotaDiaria diaria=new ConCuotaDiaria();
		diaria.setVisible(true);
	}
}
