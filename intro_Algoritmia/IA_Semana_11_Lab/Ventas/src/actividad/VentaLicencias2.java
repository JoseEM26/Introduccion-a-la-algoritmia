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

public class VentaLicencias2 extends JFrame implements ActionListener {

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
					VentaLicencias2 frame = new VentaLicencias2();
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
	public VentaLicencias2() {
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
	double impTotal1,impTotal2,impTotal3,impTotal4;
	int canLic1,canLic2,canLic3,canLic4;
	int canVen1,canVen2,canVen3,canVen4;
	
	int entradaCantidad() {
		return Integer.parseInt(txtcantidad.getText());
	}
	int EntradaLicencia() {
		return cboTipo.getSelectedIndex();
	}
	
	double ImporteTotal(int can,int tp) {
		double ip=0;
		switch(tp) {
		case 0:
			txtPrecio.setText(""+510);
			ip=can*Double.parseDouble(txtPrecio.getText());
			break;
		case 1:
			txtPrecio.setText(""+1500);
			ip=can*Double.parseDouble(txtPrecio.getText());
			break;
		case 2:
			txtPrecio.setText(""+3100);
			ip=can*Double.parseDouble(txtPrecio.getText());
			break;
		case 3:
			txtPrecio.setText(""+4500);
			ip=can*Double.parseDouble(txtPrecio.getText());
			break;	
		}
		return ip;
	}

	void CalcularCalculos(double ip,int tp,int can) {
		switch(tp) {
		case 0:
			impTotal1+=ip;
			canLic1+=can;
			canVen1++;
			break;
		case 1:
			impTotal2+=ip;
			canLic2+=can;
			canVen2++;
			break;
		case 2:
			impTotal3+=ip;
			canLic3+=can;
			canVen3++;
			break;
		case 3:
			impTotal4+=ip;
			canLic4+=can;
			canVen4++;
			break;
		}
	}
	void Salida(double ip) {
		txtS.setText("");
		imprimir("Importe a pagar...........: " + ip);
		imprimir("");
		imprimir("Importe total recaudado");
		imprimir("- Por licencias Cobre....: " + impTotal1);
		imprimir("- Por licencias Bronze...: " + impTotal2);
		imprimir("- Por licencias Silver...: " + impTotal3);
		imprimir("- Por licencias Gold.....: " + impTotal4);
		imprimir("");
		imprimir("Cantidad de licencias vendidas");
		imprimir("- Por licencias Cobre....: " + canLic1);
		imprimir("- Por licencias Bronze...: " + canLic2);
		imprimir("- Por licencias Silver...: " + canLic3);
		imprimir("- Por licencias Gold.....: " + canLic4);
		imprimir("");
		imprimir("Cantidad de ventas efectuadas");
		imprimir("- Por licencias Cobre....: " + canVen1);
		imprimir("- Por licencias Bronze...: " + canVen2);
		imprimir("- Por licencias Silver...: " + canVen3);
		imprimir("- Por licencias Gold.....: " + canVen4);
		}
		// Imprime una cadena con un salto de línea al final
		void imprimir(String espacio) {
		txtS.append(espacio+"\n");
	}
	
	
	
	
	
	
	
	
	
	//================================================================================

	protected void actionPerformedBtnProcesar(ActionEvent e) {
		int cantidad,licencia;
		double impPagar;
		
		cantidad=entradaCantidad();
		licencia=EntradaLicencia();
		
		impPagar=ImporteTotal(cantidad, licencia);
		CalcularCalculos(impPagar, licencia, cantidad);
		Salida(impPagar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
