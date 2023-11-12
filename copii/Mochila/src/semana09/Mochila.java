package semana09;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

public class Mochila extends JFrame implements ActionListener {

	// Declaraci�n de variables
	private static final long serialVersionUID = 9206324162700448001L;
	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblCantidad;
	private JComboBox<String> cboModelo;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	// Lanza la aplicaci�n
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mochila frame = new Mochila();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Mochila() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 65, 14);
		contentPane.add(lblModelo);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 36, 65, 14);
		contentPane.add(lblCantidad);

		cboModelo = new JComboBox<String>();
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Sherman", "Faguo", "Aldo", "Suburban"}));
		cboModelo.setBounds(85, 8, 100, 20);
		contentPane.add(cboModelo);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(85, 33, 100, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 32, 89, 23);
		contentPane.add(btnBorrar);

		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 61, 414, 190);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);
		
		btnBorarrr = new JButton("New button");
		btnBorarrr.setBounds(335, 32, 89, 23);
		contentPane.add(btnBorarrr);
	}

	// Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	// Procesa la pulsaci�n del bot�n Borrar
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtCantidad.setText("");
		txtS.setText("");
		cboModelo.setSelectedIndex(0);
		txtCantidad.requestFocus();
	}

	double impCompra,impDescuento,impPagar;
	int cantidad,obsequio,modelo;
	private JButton btnBorarrr;
	
	void calcularImporteCompra(){
		switch(modelo) {
		case 0:
			impCompra=cantidad*149.9;
			break;
		case 1:
			impCompra=cantidad*89.9;
			break;
		case 2:
			impCompra=cantidad*119.9;
			break;
		case 3:
			impCompra=cantidad*174.9;
			break;
		}
	}
	void calcularImporteDescuento() {
		
		if(cantidad<5)
			impDescuento=0;
		else if(cantidad>=5 && cantidad<7) 
		   impDescuento=0.05*impDescuento;			
		else if(cantidad>=7 && cantidad<9) 
			   impDescuento=0.07*impDescuento;
		else
			impDescuento=0.09*impCompra;		
	}
    void calcularObsequio() {

    	
    
    if(cantidad<200)
		impDescuento=0;
	else if(cantidad>=200 && cantidad<500) 
	   impDescuento=1*cantidad;			
	else if(cantidad>=500 && cantidad<700) 
	    impDescuento=2*cantidad;
	else
		impDescuento=3*cantidad;
	
}
	void CalcularImportePagar() {
		impPagar=impCompra-impDescuento;
	}
	// Procesa la pulsaci�n del bot�n Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {

	calcularImporteCompra();
	calcularImporteDescuento();
	calcularObsequio();
	CalcularImportePagar();
		
		// Salida de resultados
		txtS.setText("Importe compra    : S/. " +impCompra+ "\n");
		txtS.append ("Importe descuento : S/. " +impDescuento+ "\n");
		txtS.append ("Importe pagar     : S/. " +impPagar+ "\n");
		txtS.append ("Chocolates        : " +obsequio+ "\n");
	}
}