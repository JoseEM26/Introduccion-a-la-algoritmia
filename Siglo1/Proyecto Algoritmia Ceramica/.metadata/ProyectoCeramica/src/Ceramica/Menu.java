package Ceramica;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame {
	
    private JPanel contentPane;
    private JMenuItem mntmConsultar;

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
    
    
    private JMenuItem mntmSalir;
    private JMenu mnAyuda;
    private JMenu mnConfiguracion;
    private JMenu mnVender;
    private JMenu mnMantenimiento;
    private JMenu mnArchivo;
    
  
	

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu frame = new Menu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Menu() {
    	setTitle("Tienda Ceramica");
    	setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto Algoritmia Ceramica\\img\\losas (1).png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 569, 343);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(240, 248, 255));
        setJMenuBar(menuBar);

        mnArchivo = new JMenu("Archivo");
        menuBar.add(mnArchivo);

        mntmSalir = new JMenuItem("Salir");
        mntmSalir.setBackground(Color.RED);
        mntmSalir.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\cerrar-sesion.png"));
        mntmSalir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        mnArchivo.add(mntmSalir);
        
        mntmSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        mnMantenimiento = new JMenu("Mantenimiento");
        mnMantenimiento.setBackground(new Color(152, 251, 152));
        menuBar.add(mnMantenimiento);

        mntmConsultar = new JMenuItem("Consultar cerámico");
        mntmConsultar.setBackground(Color.WHITE);
        mntmConsultar.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\losas.png"));
        mnMantenimiento.add(mntmConsultar);
        mntmConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 ConsultarCeramica consultarCeramica = new ConsultarCeramica();
                 consultarCeramica.setVisible(true);
            }
        });
		
		JMenuItem mntmModificar = new JMenuItem("Modificar cer\u00E1mico");
		mntmModificar.setBackground(Color.WHITE);
		mntmModificar.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\editar.png"));
		mnMantenimiento.add(mntmModificar);
		mntmModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ModicarCeramica ModicarCeramica = new ModicarCeramica();
                ModicarCeramica.setVisible(true);
            }
        });

		JMenuItem mntmListar = new JMenuItem("Listar cer\u00E1micos\r");
		mntmListar.setBackground(Color.WHITE);
		mntmListar.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\portapapeles.png"));
		mnMantenimiento.add(mntmListar);
		mntmListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ListadoCer ListadoCer = new ListadoCer();
            	ListadoCer.setVisible(true);
            }
        });

		
		mnVender = new JMenu("Ventas");
		menuBar.add(mnVender);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mntmVender.setBackground(Color.WHITE);
		mntmVender.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\comercio.png"));
		mnVender.add(mntmVender);
		mntmVender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Vender Vender = new Vender();
            	Vender.setVisible(true);
            }
        });
		
		JMenuItem mntmGenerar = new JMenuItem("Generar reportes\r");
		mntmGenerar.setBackground(Color.WHITE);
		mntmGenerar.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\reporte.png"));
		mnVender.add(mntmGenerar);
		mntmGenerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	GenReporte GenRepor = new GenReporte();
            	GenRepor.setVisible(true);
            }
        });
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setBackground(Color.WHITE);
		menuBar.add(mnConfiguracion);
		
		JMenuItem mntmDescuento = new JMenuItem("Configurar descuentos");
		mntmDescuento.setBackground(Color.WHITE);
		mntmDescuento.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\configuracion.png"));
		mnConfiguracion.add(mntmDescuento);
		mntmDescuento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ConfigDesc ConfigDesc = new ConfigDesc();
            	ConfigDesc.setVisible(true);
            }
        });
		
		JMenuItem mntmObsequios = new JMenuItem("Configurar obsequios");
		mntmObsequios.setBackground(Color.WHITE);
		mntmObsequios.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\obsequio.png"));
		mnConfiguracion.add(mntmObsequios);
		mntmObsequios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ConfigObse ConfigObse = new ConfigObse();
            	ConfigObse.setVisible(true);
            }
        });
		JMenuItem mntmCanOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmCanOptima.setBackground(Color.WHITE);
		mntmCanOptima.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\cajas.png"));
		mnConfiguracion.add(mntmCanOptima);
		mntmCanOptima.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ConfigOptima ConfigOptima = new ConfigOptima();
            	ConfigOptima.setVisible(true);
            }
        });
		
		JMenuItem mntmCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmCuotaDiaria.setBackground(Color.WHITE);
		mntmCuotaDiaria.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\mano.png"));
		mnConfiguracion.add(mntmCuotaDiaria);
		mntmCuotaDiaria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ConfigDiaria ConfigDiaria = new ConfigDiaria();
            	ConfigDiaria.setVisible(true);
            }
        });
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setBackground(Color.WHITE);
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcerca = new JMenuItem("Acerca de Tienda\r");
		mntmAcerca.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\acerca-de.png"));
		mnAyuda.add(mntmAcerca);
		mntmAcerca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Tienda Tienda = new Tienda();
            	Tienda.setVisible(true);
            }
        });
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Proyecto Algoritmia Ceramica\\img\\ceramicas.jpg"));
		lblNewLabel.setBounds(0, 0, 553, 282);
		contentPane.add(lblNewLabel);
	}
}
