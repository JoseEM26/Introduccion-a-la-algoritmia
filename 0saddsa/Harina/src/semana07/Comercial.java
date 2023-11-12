package semana07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

public class Comercial extends JFrame implements ActionListener {

	// Declaraci�n de variables
	private static final long serialVersionUID = 9206324162700448001L;
	private JPanel contentPane;
	private JLabel lblBolos;
	private JTextField txtBolos;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;
	private JTextField txtPago;
	private JLabel lblPago;

	// Lanza la aplicaci�n
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comercial frame = new Comercial();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Comercial() {
		setTitle("Harina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 233);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblBolos = new JLabel("N Bolos");
		lblBolos.setBounds(10, 11, 47, 14);
		contentPane.add(lblBolos);

		txtBolos = new JTextField();
		txtBolos.setBounds(67, 8, 125, 20);
		contentPane.add(txtBolos);
		txtBolos.setColumns(10);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 32, 89, 23);
		contentPane.add(btnBorrar);

		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 61, 414, 123);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);
		
		txtPago = new JTextField();
		txtPago.setColumns(10);
		txtPago.setBounds(67, 34, 125, 20);
		contentPane.add(txtPago);
		
		lblPago = new JLabel("pago");
		lblPago.setBounds(10, 41, 47, 14);
		contentPane.add(lblPago);
	}

	// Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	// Procesa la pulsaci�n del bot�n Borrar
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtBolos.setText("");
		txtS.setText("");
		txtBolos.requestFocus();
	}

	// Procesa la pulsaci�n del bot�n Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		double impPago;
		int numerosBolos;
		string obseq;
		
		impPago=Double.parseDouble(txtPago.getText());
		numerosBolos=Integer.parseInt(txtBolos.getText());
		
		if (impPago>500) 
			switch(numerosBolos) { 
			case 10:obseq = "Una agenda";
			break;
			case 20:obsequio = "Un reloj";
			break;
			case 30:obsequio = "Una memoria";
			break;
			case 40:obsequio = "Un perfume";
			break;
			case 50:obsequio = "Una radio";
			break;
			default:
				obsequio= "Una pelota"
				break;
			}
			
		
		
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}