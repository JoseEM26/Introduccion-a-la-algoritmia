package bvccbv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Repaso_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Repaso_1 frame = new Repaso_1();
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
	public Repaso_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEliminar = new JButton("New button");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(335, 45, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 15, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblCantiadad = new JLabel("Cantidad");
		lblCantiadad.setBounds(10, 34, 46, 14);
		contentPane.add(lblCantiadad);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(66, 12, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(66, 46, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 396, 150);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 11, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		double precio,impCompra,impDescuento,impPago,obsequioCaramelos,ObsMascar;
		int cantidad;
		
		precio = Double.parseDouble(txtPrecio.getText());
		cantidad= Integer.parseInt(txtCantidad.getText());
		
		impCompra=cantidad*precio;
		impDescuento=impCompra*0.05;
		impPago=impCompra-impDescuento;
		obsequioCaramelos=cantidad*2;
		ObsMascar=cantidad*3;
		
		txtS.setText("Importe de compra\t:S/." + String.format("%,8.2f",impCompra)+"\n");
		txtS.append("Importe de Descuento\t:S/." + String.format("%,8.2f",impDescuento)+"\n");
		txtS.append("Importe de Pagar\t:S/." + String.format("%,8.2f",impPago)+"\n");
		txtS.append("Caramelos\t\t:S/." + String.format("%,8.2f",obsequioCaramelos)+"\n");
		txtS.append("Gomitas de mascar\t:S/." + String.format("%,8.2f",ObsMascar)+"\n");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		txtCantidad.setText("");
		txtPrecio.setText("");
		txtS.setText("");
		txtCantidad.requestFocus();
	}
}
