package semana4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Dulceria extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lbltipo;
	private JLabel lblCantidad;
	private JComboBox cmbTipo;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dulceria frame = new Dulceria();
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
	public Dulceria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltipo = new JLabel("Tipo");
		lbltipo.setBounds(10, 11, 46, 14);
		contentPane.add(lbltipo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 34, 46, 14);
		contentPane.add(lblCantidad);
		
		cmbTipo = new JComboBox();
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"Primor\t", "Dulzura", "Tentacion", "Explosion"}));
		cmbTipo.setBounds(81, 7, 149, 22);
		contentPane.add(cmbTipo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(74, 31, 156, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(290, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 394, 161);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
	//determinacion de variables
		int Cantidad ,obsequio =0 ,tipo ;
		double impCompra = 0 ,impDescuento = 0,impPagar;
		
	//entrada
		Cantidad = Integer.parseInt(txtCantidad.getText());
		tipo= cmbTipo.getSelectedIndex();  
	
	//Proceso de precio de compra
		if (tipo == 0) 
			impCompra = Cantidad * 8.5;
		if (tipo == 1) 
			impCompra = Cantidad * 10.0;
		if (tipo == 2) 
			impCompra = Cantidad * 7.0;
		if (tipo == 3) 
			impCompra = Cantidad * 12.5;
	//	Proceso de precio de descuento
		if (Cantidad<5) 
			impDescuento = impCompra*0.04;
		
	    if (Cantidad>=5 && Cantidad < 10) 
			impDescuento = impCompra*0.065;
	    
	    if (Cantidad>=10 && Cantidad < 15) 
			impDescuento = impCompra*0.09;
			
		if (Cantidad>=15)
			impDescuento = impCompra*0.115;
		impPagar=impCompra-impDescuento;
	//Obsequio
		if (impPagar <250)
			obsequio = 2*Cantidad;
		if (impPagar >250) 
			obsequio = 3*Cantidad;
		
		
	//Salida
		txtS.setText("Importe de compra\t:" + impCompra + "\n");
		txtS.append("Importe de descuento\t:" + impDescuento + "\n");
		txtS.append("Importe a pagar\t\t:" + impPagar + "\n");
		txtS.append("obsequi\t\t"
				+ ":" + obsequio +"\n" );
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	  	 
		
		
		
		
		
		
		
		
		
	}
}
