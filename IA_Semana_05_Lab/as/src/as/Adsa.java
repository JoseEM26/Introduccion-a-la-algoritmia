package as;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adsa extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblPrecio;
	private JLabel lblCAntidad;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adsa frame = new Adsa();
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
	public Adsa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 11, 46, 14);
		contentPane.add(lblPrecio);
		
		lblCAntidad = new JLabel("CAntidad");
		lblCAntidad.setBounds(10, 36, 46, 14);
		contentPane.add(lblCAntidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(60, 8, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(60, 33, 86, 20);
		contentPane.add(txtCantidad);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(335, 32, 89, 23);
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 414, 185);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		double precio,impCompra,impDescuento,impPagar,obsequio;
		int Cantidad;
		
		precio=Double.parseDouble(txtPrecio.getText());
		Cantidad=Integer.parseInt(txtCantidad.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
