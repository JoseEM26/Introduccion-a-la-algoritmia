package semana07;

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

public class Jabon extends JFrame implements ActionListener {

	// Declaraci�n de variables
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
					Jabon frame = new Jabon();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Jabon() {
		setTitle("Jabon");
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
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Palmolive Tripack", "Nivea Tripack", "Rexona Tripack", "Neko Tripack"}));
		cboMarca.setBounds(67, 8, 125, 20);
		contentPane.add(cboMarca);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(67, 33, 125, 20);
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

	// Procesa la pulsaci�n del bot�n Borrar
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtCantidad.setText("");
		txtS.setText("");
		cboMarca.setSelectedIndex(0);
		txtCantidad.requestFocus();
	}

	// Procesa la pulsaci�n del bot�n Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		int marca, cantidad, lapiceros;
		double precio, imppag, impdes, impcom;
		
		cantidad = Integer.parseInt(txtCantidad.getText());
		marca = cboMarca.getSelectedIndex();
		
		switch (marca) {
		case 0:
			impcom = cantidad * 5.2;
			break;
		case 1:
			impcom = cantidad * 8.2;
			break;
		case 2:
			impcom = cantidad * 6.5;
			break;
		default:
			impcom = cantidad * 7.4;
		}
		
		if (cantidad >= 18)
			impdes = impcom * 0.125;
		else if (cantidad >= 12 && cantidad < 18)
			impdes = impcom * 0.10;
		else if (cantidad >= 6 && cantidad < 12)
			impdes = impcom * 0.075;
		else
			impdes = impcom * 0;
		
		
		if (cantidad < 12)
			lapiceros = 2;
		else if (cantidad >= 12 && cantidad < 24)
			lapiceros = 4;
		else if (cantidad >= 24 && cantidad < 36)
			lapiceros = cantidad * 1;
		else
			lapiceros = cantidad * 2;
		
		imppag = impcom - impdes;
		
		txtS.setText("Datos" + "\n"); 
		txtS.append("Importe de Compra \t:" + String.format("%,8.2f", impcom) + "\n"); 
		txtS.append("Importe de Descuento \t:" + String.format("%,8.2f", impdes) + "\n"); 
		txtS.append("Importe a Pagar \t\t:" + String.format("%,8.2f", imppag) + "\n"); 
		txtS.append("Lapiceros de Obsequio \t: " + lapiceros + " lapiceros" + "\n");
		
		
		

	}
}