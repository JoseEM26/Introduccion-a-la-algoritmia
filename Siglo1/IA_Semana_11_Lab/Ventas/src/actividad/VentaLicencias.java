package actividad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentaLicencias extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTipo;
	private JLabel lblCantidad;
	private JTextField txtcantidad;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox cboTipo;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaLicencias frame = new VentaLicencias();
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
	public VentaLicencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 11, 46, 14);
		contentPane.add(lblTipo);
		
		lblCantidad = new JLabel("New label");
		lblCantidad.setBounds(10, 36, 46, 14);
		contentPane.add(lblCantidad);
		
		txtcantidad = new JTextField();
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(66, 33, 86, 20);
		contentPane.add(txtcantidad);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 399, 189);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		cboTipo = new JComboBox();
		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Cobre", "Bronce", "Silver", "gold"}));
		cboTipo.setBounds(64, 7, 106, 22);
		contentPane.add(cboTipo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(180, 8, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	//================================================================================
	double toRec0,toRec1,toRec2,toRec3;
	int LicVen0,LicVen1,LicVen2,LicVen3;
	int VenEfec0,VenEfec1,VenEfec2,VenEfec3;
	
	int EntradaCantidad() {
		return Integer.parseInt(txtcantidad.getText());
	}
	
	int EntradaTipo() {
		return cboTipo.getSelectedIndex();
	}
	
	double calcularImportePagar(int tip, int can) {
		switch (tip) {
		case 0:
		return 510 * can;
		case 1:
		return 1500 * can;
		case 2:
		return 3100 * can;
		default:
		return 4500 * can;
		}
		}
	
	void efectuarIncrementos(int tip, int can, double ip) {
		switch (tip) {
		case 0:
		toRec0 += ip;
		LicVen0 += can;
		VenEfec0 ++;
		break;
		case 1:
		toRec1 += ip;
		LicVen1 += can;
		VenEfec1 ++;
		break;
		case 2:
		toRec2 += ip;
		LicVen2 += can;
		VenEfec3 ++;
		break;
		default:
		toRec3 += ip;
		LicVen3 += can;
		VenEfec3 ++;
		}
		}

	void mostrarResultados(double ip) {
		txtS.setText("");
		imprimir("Importe a pagar...........: " + ip);
		imprimir("");
		imprimir("Importe total recaudado");
		imprimir("- Por licencias Cobre....: " + toRec0);
		imprimir("- Por licencias Bronze...: " + toRec1);
		imprimir("- Por licencias Silver...: " + toRec2);
		imprimir("- Por licencias Gold.....: " + toRec3);
		imprimir("");
		imprimir("Cantidad de licencias vendidas");
		imprimir("- Por licencias Cobre....: " + LicVen0);
		imprimir("- Por licencias Bronze...: " + LicVen1);
		imprimir("- Por licencias Silver...: " + LicVen2);
		imprimir("- Por licencias Gold.....: " + LicVen3);
		imprimir("");
		imprimir("Cantidad de ventas efectuadas");
		imprimir("- Por licencias Cobre....: " + VenEfec0);
		imprimir("- Por licencias Bronze...: " + VenEfec1);
		imprimir("- Por licencias Silver...: " + VenEfec2);
		imprimir("- Por licencias Gold.....: " + VenEfec3);
		}
		// Imprime una cadena con un salto de línea al final
		void imprimir(String espacio) {
		txtS.append(espacio+"\n");
		}
	
	//================================================================================

	protected void actionPerformedBtnProcesar(ActionEvent e) {
		int cantidad,tipo;
		double ImpPagar;
		
		cantidad=EntradaCantidad();
		tipo=EntradaTipo();
		
		
		ImpPagar=calcularImportePagar(tipo, cantidad);
		efectuarIncrementos(tipo, cantidad, ImpPagar);
		mostrarResultados(ImpPagar);
		
		
		
		
		
		
		
	}
}
