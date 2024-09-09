package proyecto_Bucles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercisio4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField txtnumero;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JTextField txtNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercisio4 frame = new Ejercisio4();
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
	public Ejercisio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 11, 46, 14);
		contentPane.add(lblNumero);
		
		txtnumero = new JTextField();
		txtnumero.setBounds(83, 8, 86, 20);
		contentPane.add(txtnumero);
		txtnumero.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 202);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JLabel lblNumero_1 = new JLabel("Numero");
		lblNumero_1.setBounds(10, 23, 46, 14);
		contentPane.add(lblNumero_1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(83, 33, 86, 20);
		contentPane.add(txtNumero2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	int i,nI,nF,c=0;
	nI=Integer.parseInt(txtnumero.getText());
	nF=Integer.parseInt(txtNumero2.getText());
		
	i=nI+1;
	while(i<nF) {
		c++;
		i++;
		
	}
		txtS.setText("Salida\t:"+c);
		
		
	}
}
