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
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arroz frame = new Arroz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Arroz() {
		setFont(new Font("Monospaced", Font.BOLD, 12));
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
		cboMarca.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Coste\u00F1o", "Paisana del Norte", "Tropical Superior", "Norte\u00F1o Superior" }));
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
	// ====================================================================================================================

	int leerMarca() {
		return cboMarca.getSelectedIndex();
	}

	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}

	double calcularImporteCompra(int mr, int cn) {
		double ic;
		switch (mr) {
		case 0:
			ic = 14.5 * cn;
			break;
		case 1:
			ic = 12.6 * cn;
			break;
		case 2:
			ic = 10.0 * cn;
			break;
		default:
			ic = 12.8 * cn;
		}
		return ic;
	}

	double calcularImporteDescuento(int cn, double ic) {
		double id;
		switch (cn) {
		case 1:
		case 2:
		case 3:
			id = 0.09 * ic;
			break;
		case 4:
		case 5:
		case 6:
			id = 0.11 * ic;
			break;
		case 7:
		case 8:
		case 9:
			id = 0.13 * ic;
			break;
		default:
			id = 0.15 * ic;
		}
		return id;
	}

	double calcularImportePagar(double ic, double id) {
		double ip;
		ip = ic - id;
		return ip;
	}

	int calcularCaramelos(int mr, int cn) {
		int cr;
		switch (mr) {
		case 0:
			cr = 3;
			break;
		case 1:
			cr = 2;
			break;
		case 2:
			cr = 2 * cn;
			break;
		default:
			cr = 1 * cn;
		}
		return cr;
	}

	int calcularGomitas(double ip) {
		int gm;
		if (ip < 50)
			gm = 5;
		else if (ip < 100)
			gm = 10;
		else if (ip < 150)
			gm = 15;
		else
			gm = 20;
		return gm;
	}

	void imprimirResultados(double ic, double id, double ip, int cr, int gm) {
		txtS.setText("Importe compra    : S/. " + String.format("%,8.2f", ic) + "\n");
		txtS.append("Importe descuento : S/. " + String.format("%,8.2f", id) + "\n");
		txtS.append("Importe pagar     : S/. " + String.format("%,8.2f", ip) + "\n");
		txtS.append("Caramelos         : " + cr + "\n");
		txtS.append("Gomitas           : " + gm + "\n");
	}

	// ====================================================================================================================
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		// Declaraci�n de variables
		int mar, can, car, gom;
		double icom, ides, ipag;

		// Entrada de datos
		mar = leerMarca();
		can = leerCantidad();

		// C�lculo del importe compra
		icom = calcularImporteCompra(mar, can);

		// C�lculo del importe del descuento
		ides = calcularImporteDescuento(can, icom);

		// C�lculo del importe a pagar
		ipag = calcularImportePagar(icom, ides);

		// C�lculo de los caramelos de regalo
		car = calcularCaramelos(mar, can);

		// C�lculo de las gomitas de regalo
		gom = calcularGomitas(ipag);

		// Salida de resultados
		imprimirResultados(icom, ides, ipag, car, gom);
	}
}