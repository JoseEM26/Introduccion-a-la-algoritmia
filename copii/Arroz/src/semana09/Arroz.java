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

public class Arroz extends JFrame implements ActionListener {

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
	private JTextField txtPrecio;

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
					Arroz frame = new Arroz();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Arroz() {
		setTitle("Arroz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMarca = new JLabel("Marca de arroz");
		lblMarca.setBounds(10, 11, 91, 14);
		contentPane.add(lblMarca);

		lblCantidad = new JLabel("Cantidad de bolsas");
		lblCantidad.setBounds(10, 36, 91, 14);
		contentPane.add(lblCantidad);

		cboMarca = new JComboBox<String>();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Coste\u00F1o", "Paisana del Norte", "Tropical Superior", "Norte\u00F1o Superior"}));
		cboMarca.setBounds(111, 8, 100, 20);
		contentPane.add(cboMarca);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(111, 33, 100, 20);
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
		
		txtPrecio = new JTextField();
		txtPrecio.addActionListener(this);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(221, 8, 100, 20);
		contentPane.add(txtPrecio);
	}

	// Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == txtPrecio) {
			actionPerformedTxtPrecio(arg0);
		}
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

	// Procesa la pulsación del botón Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		double impCompra=0,impDescuento,impPagar;
		int caramelo=0,gomitas,marca ,cantidad;
		
		
		cantidad=Integer.parseInt(txtCantidad.getText());
		marca=cboMarca.getSelectedIndex();
		
	switch(marca) {
	case 0:
		impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	break;
	case 1:
		impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	break;	
	case 2:
		impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	break;
	case 3:
		impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	break;
	}
	
	if(cantidad<4 ) 
		impDescuento=0.09*impCompra;
	else if (cantidad>=4 && cantidad < 7)
		impDescuento=0.11*impCompra;
	else if (cantidad>=7 && cantidad < 10)
		impDescuento=0.13*impCompra;
	else 
		impDescuento=0.15*impCompra;
	
   switch (marca) {
   case 0:
	   caramelo=3;
	   break;
   case 1:
	   caramelo=2;
	   break;
   case 2:
	   caramelo=2*cantidad;
	   break;
   case 3:
	   caramelo=1*cantidad;
	   break;
   }
   
   if(cantidad<50)
	   gomitas=5;
   else if(cantidad>=50 && cantidad<100 )
	   gomitas=10;
   else if(cantidad>=100 && cantidad <150)
	   gomitas=15;
   else
	   gomitas=20;
   
   impPagar=impCompra-impDescuento;
	

		
		// Salida de resultados
		txtS.setText("Importe compra    : S/ " +impCompra+ "\n");
		txtS.append ("Importe descuento : S/ " +impDescuento+ "\n");
		txtS.append ("Importe pagar     : S/ "+impPagar + "\n");
		txtS.append ("Caramelos         : " +caramelo+ "\n");
		txtS.append ("Gomitas           : " +gomitas+ "\n");
	}
	protected void actionPerformedTxtPrecio(ActionEvent arg0) {
		
		
		
		
		
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
int valor=cboMarca.getSelectedIndex();
		
		switch(valor) {
		case 0:
			txtPrecio.setText(""+14.5);
			break;
		case 1:
			txtPrecio.setText(""+12.6);
			break;
		case 2:
			txtPrecio.setText(""+10);
			break;
		case 3:
			txtPrecio.setText(""+12.8);
			break;
		}
		
	}
}