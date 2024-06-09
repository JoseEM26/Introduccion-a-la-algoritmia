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

public class Ejercisio6 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField txtnumero;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JTextField txtF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercisio6 frame = new Ejercisio6();
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
	public Ejercisio6() {
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
		
		JLabel lblNumeroF = new JLabel("NumeroF");
		lblNumeroF.setBounds(10, 23, 46, 14);
		contentPane.add(lblNumeroF);
		
		txtF = new JTextField();
		txtF.setColumns(10);
		txtF.setBounds(93, 30, 86, 20);
		contentPane.add(txtF);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		int i=1,nI,nF,c=0;
		nI=Integer.parseInt(txtnumero.getText());
		nF=Integer.parseInt(txtF.getText());
			
		i=nI+1;
		while(i<nF) {
			
			if(i%2==0)
				c++;
			i++;
		}
		
		

		
			txtS.setText("Salida\t:"+c);
			
			
		}
}
