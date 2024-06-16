package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingreso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcodigoCliente;
	private JTextField txtnombres;
	private JTextField txtdirección;
	private JTextField txtteléfono;
	private JTextField txtapellidos;
	private JTextField txtdni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingreso frame = new Ingreso();
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
	public Ingreso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("codigoCliente");
		lblNewLabel.setBounds(10, 11, 86, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("nombres");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("tel\u00E9fono");
		lblNewLabel_1_1.setBounds(242, 42, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("direcci\u00F3n");
		lblNewLabel_1_1_1.setBounds(242, 11, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtcodigoCliente = new JTextField();
		txtcodigoCliente.setBounds(91, 11, 86, 20);
		contentPane.add(txtcodigoCliente);
		txtcodigoCliente.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setColumns(10);
		txtnombres.setBounds(91, 39, 86, 20);
		contentPane.add(txtnombres);
		
		txtdirección = new JTextField();
		txtdirección.setColumns(10);
		txtdirección.setBounds(314, 11, 86, 20);
		contentPane.add(txtdirección);
		
		txtteléfono = new JTextField();
		txtteléfono.setColumns(10);
		txtteléfono.setBounds(314, 39, 86, 20);
		contentPane.add(txtteléfono);
		
		txtapellidos = new JTextField();
		txtapellidos.setColumns(10);
		txtapellidos.setBounds(91, 70, 86, 20);
		contentPane.add(txtapellidos);
		
		txtdni = new JTextField();
		txtdni.setColumns(10);
		txtdni.setBounds(314, 64, 86, 20);
		contentPane.add(txtdni);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("dni");
		lblNewLabel_1_1_2.setBounds(242, 67, 46, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("apellidos");
		lblNewLabel_1_1_3.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JButton btnNewButton = new JButton("Registrar Datos");
		btnNewButton.setBounds(178, 123, 146, 30);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
