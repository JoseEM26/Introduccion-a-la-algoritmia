package semana4;

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

public class Angulos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JLabel lblGrados;
	private JLabel lblMinutos;
	private JLabel lblSegundos;
	private JTextField txtGrados;
	private JTextField txtMinutos;
	private JTextField txtSegundos;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Angulos frame = new Angulos();
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
	public Angulos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		lblGrados = new JLabel("Grados");
		lblGrados.setBounds(10, 15, 46, 14);
		contentPane.add(lblGrados);
		
		lblMinutos = new JLabel("Minutos");
		lblMinutos.setBounds(10, 37, 46, 14);
		contentPane.add(lblMinutos);
		
		lblSegundos = new JLabel("Segundos");
		lblSegundos.setBounds(10, 62, 46, 14);
		contentPane.add(lblSegundos);
		
		txtGrados = new JTextField();
		txtGrados.setBounds(79, 12, 86, 20);
		contentPane.add(txtGrados);
		txtGrados.setColumns(10);
		
		txtMinutos = new JTextField();
		txtMinutos.setColumns(10);
		txtMinutos.setBounds(79, 34, 86, 20);
		contentPane.add(txtMinutos);
		
		txtSegundos = new JTextField();
		txtSegundos.setColumns(10);
		txtSegundos.setBounds(79, 59, 86, 20);
		contentPane.add(txtSegundos);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 87, 374, 163);
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
		//Decalracion de variables
		   int grado ,segundos ,minutos;
		   double Beta;
		   String Tipo="";
		   
		//Entrada
		   grado = Integer.parseInt(txtGrados.getText());
		   segundos = Integer.parseInt(txtSegundos.getText());
		   minutos = Integer.parseInt(txtMinutos.getText());
		   
		 //Proceso
		   if (Beta == 0)
			   Tipo = "Nulo";
			
		
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
