package semana09;

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

public class Libreria2 extends JFrame implements ActionListener {

	// Declaración de variables
	private static final long serialVersionUID = 9206324162700448001L;
	private JPanel contentPane;
	private JLabel lblMarca;
	private JLabel lblCantidad;
	private JComboBox<String> cboMarca;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	// Lanza la aplicación
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
					Libreria2 frame = new Libreria2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Libreria2() {
		setTitle("Librer\u00EDa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 233);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 11, 47, 14);
		contentPane.add(lblMarca);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 36, 47, 14);
		contentPane.add(lblCantidad);

		cboMarca = new JComboBox<String>();
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Standford", "Alpha", "Justus", "Loro" }));
		cboMarca.setBounds(67, 8, 100, 20);
		contentPane.add(cboMarca);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(67, 33, 100, 20);
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
		scpScroll.setBounds(10, 61, 414, 123);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);
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

	// Procesa la pulsación del botón Borrar
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtCantidad.setText("");
		txtS.setText("");
		cboMarca.setSelectedIndex(0);
		txtCantidad.requestFocus();
	}

	double impCompra,impDescuento,impPago;
	int marca , obsequio,cantidad;
	
void declaradores() {
		marca=cboMarca.getSelectedIndex();
		cantidad=Integer.parseInt(txtCantidad.getText());
	}	
void procesarCompra(){
	switch(marca) {
	case 0:
		impCompra=cantidad*4.85;
	break;
	case 1:
		impCompra=cantidad*4.35;
	break;
	case 2:
		impCompra=cantidad*4.50;
	break;
	case 3:
		impCompra=cantidad*4.55;
	break;
	}
		
	}
void procesarDescuenti(){
	if (cantidad>=8)
		impDescuento=impCompra*0.135;
	else if(cantidad>=6 && cantidad<8)
		impDescuento=impCompra*0.115;
	else if(cantidad>=4 && cantidad<6)
		impDescuento=impCompra*0.95;
	else
		impDescuento=impCompra*0.75;
	
	}
void obtenerObsequio(){
	switch(marca) {
	case 0:
		obsequio=5;
		break;
	case 1:
		obsequio=4;
		break;
	case 2:
		obsequio=3*cantidad;
		break;
	case 3:
		obsequio=2*cantidad;
		break;
	}
}
void procesarPagar(){
	impPago=impCompra-impDescuento;
}

	
	// Procesa la pulsación del botón Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		declaradores();
		procesarCompra();
		procesarDescuenti();
		obtenerObsequio();
		procesarPagar();
		

		
		// Salida de resultados
		txtS.setText("Importe compra    : S/. " +impCompra+ "\n");
		txtS.append ("Importe descuento : S/. " +impDescuento+"\n");
		txtS.append ("Importe pagar     : S/. " +impPago+ "\n");
		txtS.append ("Lapiceros         : " +obsequio+ "\n");
	}
}