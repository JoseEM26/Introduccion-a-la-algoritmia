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

public class SueldoEmpresa extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblCategorias;
	private JLabel lblCantidad;
	private JTextField txtcantidad;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JComboBox cboTipo;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SueldoEmpresa frame = new SueldoEmpresa();
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
	public SueldoEmpresa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCategorias = new JLabel("categorias");
		lblCategorias.setBounds(10, 11, 63, 14);
		contentPane.add(lblCategorias);
		
		lblCantidad = new JLabel("cantidad");
		lblCantidad.setBounds(10, 36, 46, 14);
		contentPane.add(lblCantidad);
		
		txtcantidad = new JTextField();
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(93, 33, 86, 20);
		contentPane.add(txtcantidad);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 399, 546);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		cboTipo = new JComboBox();
		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D"}));
		cboTipo.setBounds(83, 7, 106, 22);
		contentPane.add(cboTipo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(201, 8, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	//================================================================================
	double tSueldo0,tSueldo1,tSueldo2,tSueldo3;
	int SHoras0,SHoras1,SHoras2,SHoras3;
	int cEmpleados0,cEmpleados1,cEmpleados2,cEmpleados3;
	private JTextArea txtS;
	
	int EntradaCantidad() {
		return Integer.parseInt(txtcantidad.getText());
	}
	int EntradaCategoria() {
		return cboTipo.getSelectedIndex();
	}

	double SueldoBruto(int can,int cat) {
		double sb=0;
		switch(cat) {
		case 0:
			txtPrecio.setText(""+45);
			sb=can*Double.parseDouble(txtPrecio.getText());
			break;
		case 1:
			txtPrecio.setText(""+42.5);
			sb=can*Double.parseDouble(txtPrecio.getText());
			break;
		case 2:
			txtPrecio.setText(""+40);
			sb=can*Double.parseDouble(txtPrecio.getText());
			break;
		case 3:
			txtPrecio.setText(""+37.5);
			sb=can*Double.parseDouble(txtPrecio.getText());
			break;
		}
		return sb;
	}

	void CalcularCalculos(double sb,int can,int cat) {
		switch(cat) {
		case 0:
			tSueldo0+=sb;
			SHoras0+=can;
			cEmpleados0++;
			break;
		case 1:
			tSueldo1+=sb;
			SHoras1+=can;
			cEmpleados1++;
			break;
		case 2:
			tSueldo2+=sb;
			SHoras2+=can;
			cEmpleados2++;
			break;
		case 3:
			tSueldo3+=sb;
			SHoras3+=can;
			cEmpleados3++;
			break;
		}
	}
	
    void Salida(double sb) {
    	txtS.setText("");
		imprimir("Importe a pagar...........: " + sb);
		imprimir("");
		imprimir("Importe total recaudado");
		imprimir("- Por licencias Cobre....: " + tSueldo0);
		imprimir("- Por licencias Bronze...: " + tSueldo1);
		imprimir("- Por licencias Silver...: " + tSueldo2);
		imprimir("- Por licencias Gold.....: " + tSueldo3);
		imprimir("");
		imprimir("Cantidad de licencias vendidas");
		imprimir("- Por licencias Cobre....: " + SHoras0);
		imprimir("- Por licencias Bronze...: " + SHoras1);
		imprimir("- Por licencias Silver...: " + SHoras2);
		imprimir("- Por licencias Gold.....: " + SHoras3);
		imprimir("");
		imprimir("Cantidad de ventas efectuadas");
		imprimir("- Por licencias Cobre....: " + cEmpleados0);
		imprimir("- Por licencias Bronze...: " + cEmpleados1);
		imprimir("- Por licencias Silver...: " + cEmpleados2);
		imprimir("- Por licencias Gold.....: " + cEmpleados3);
		}
		// Imprime una cadena con un salto de línea al final
		void imprimir(String espacio) {
		txtS.append(espacio+"\n");
		}
    
	
	
	
	
	
	
	
	//================================================================================

	protected void actionPerformedBtnProcesar(ActionEvent e) {
		int cantidad,categoria;
		double sueldoBruto;
		
		cantidad=EntradaCantidad();
		categoria=EntradaCategoria();
		sueldoBruto=SueldoBruto(cantidad, categoria);
		CalcularCalculos(sueldoBruto, cantidad, categoria);
		Salida(sueldoBruto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
