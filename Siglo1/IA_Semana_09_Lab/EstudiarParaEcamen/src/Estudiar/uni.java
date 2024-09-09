package Estudiar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class uni extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTipo;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnPRocesar;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uni frame = new uni();
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
	public uni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 14, 46, 14);
		contentPane.add(lblTipo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 39, 46, 14);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(67, 36, 86, 20);
		contentPane.add(txtCantidad);
		
		btnPRocesar = new JButton("Procesar");
		btnPRocesar.addActionListener(this);
		btnPRocesar.setBounds(335, 10, 89, 23);
		contentPane.add(btnPRocesar);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(335, 35, 89, 23);
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 414, 181);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"12", "23", "3", "4"}));
		comboBox.setBounds(68, 10, 89, 22);
		contentPane.add(comboBox);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPRocesar) {
			actionPerformedBtnPRocesar(e);
		}
	}
	//////////////////////////////////////////////////////////////////////////////////
	int Entrada1() {
		return comboBox.getSelectedIndex();
	}
	int entrada2() {
		return Integer.parseInt(txtCantidad.getText());
	}
	
	double calcularIC(int cantidad,int tipo) {
		double ImpCompra;
		switch(tipo) {
		case 0:
			ImpCompra=cantidad*8.5;
			break;
		case 1:
			ImpCompra=cantidad*10;
			break;
		case 2:
			ImpCompra=cantidad*7;
			break;
		default:
			ImpCompra=cantidad*12.5;
			break;
		}
		return ImpCompra;
	}
	
	double CalcularID(int cantidad,double impCompra) {
		double ImpDes;
		
		if(cantidad<5) 
			ImpDes=impCompra*0.04;
		else if(cantidad<=5 &&cantidad >10)	
		ImpDes=impCompra*0.065;
		else if(cantidad<=10 &&cantidad >15)	
			ImpDes=impCompra*0.09;
		else
			ImpDes=impCompra*0.0115;
	return ImpDes;	
	}
	
	double CalcularIP(double icompra,double idescuento) {
		double ImpPago;
		ImpPago=icompra-idescuento;
		return ImpPago;
	}
	
	void Salida(double impCompra,double impDesc,double impPago) {
		txtS.setText("");
		imprimir("impCompra"+impCompra);
		imprimir("ImDescue"+impDesc);
		imprimir("impPago"+impPago);
		imprimir("Obsequio");
		
		
	}
	void imprimir(String ss) {
		txtS.append(ss+"\n");
	}
	//////////////////////////////////////////////////////////////////////////////////
	protected void actionPerformedBtnPRocesar(ActionEvent e) {
		double ip,id,ic;
		int tp,can,car;
		
		tp=Entrada1();
		can=entrada2();
		ic=calcularIC(can,tp);
		id=CalcularID(can, ic);
		ip=CalcularIP(ic, id);
		Salida(ic, id, ip);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
