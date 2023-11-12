package semana04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.print.attribute.standard.JobImpressionsCompleted;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda3 frame = new Tienda3();
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
	public Tienda3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(74, 11, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(319, 10, 89, 23);
		contentPane.add(btnProcesar);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 14, 46, 14);
		contentPane.add(lblCantidad);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 46, 46, 14);
		contentPane.add(lblPrecio);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 398, 174);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(74, 43, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	//determinacion de variables
		double impCompra=0, impDescuento=0,impPagar;
		int Unidades;
	
	//Entrada
		Unidades = Integer.parseInt(txtCantidad.getText());
		
	//Calcular el importe de compra
		if (Unidades >= 1 && Unidades <= 25)
			impCompra = Unidades * 27.5;
			if (Unidades >= 26 && Unidades <= 50)
			impCompra = Unidades * 25.5;
			if (Unidades >= 51 && Unidades <= 75)
			impCompra = Unidades * 27.5;
			if (Unidades >= 76)
			impCompra = Unidades * 27.5;
			
	//calcular el importe de descuento
		if (Unidades>50) 
			impDescuento=0.15*impCompra;
		if (Unidades<50) 
			impDescuento=0.05*impCompra;
		
	//calcular el importe a pagar
		impPagar= impCompra-impDescuento;
			
	//Salida
		txtS.setText("importe de compra \t:S/"+ impCompra + "\n");
		txtS.append("importe descuento \t:S/"+ impDescuento + "\n");
		txtS.append("importe a pagar \t:S/"+ impPagar + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
