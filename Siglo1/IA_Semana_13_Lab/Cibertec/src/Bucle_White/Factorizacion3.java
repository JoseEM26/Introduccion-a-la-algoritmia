package Bucle_White;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Factorizacion3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lbltabla;
	private JTextField txtNumero;
	private JScrollPane scrollPane;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JLabel lblLimite;
	private JTextField txtLimite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorizacion3 frame = new Factorizacion3();
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
	public Factorizacion3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltabla = new JLabel("Tabla");
		lbltabla.setBounds(10, 11, 46, 14);
		contentPane.add(lbltabla);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(47, 8, 86, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 404, 631);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		lblLimite = new JLabel("Limite");
		lblLimite.setBounds(159, 11, 46, 14);
		contentPane.add(lblLimite);
		
		txtLimite = new JTextField();
		txtLimite.setColumns(10);
		txtLimite.setBounds(195, 8, 86, 20);
		contentPane.add(txtLimite);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
void IMPRIMIR(String ss) {
	txtS.append(ss+"\n");
}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		int i=0, t ,m ,l;
		t=Integer.parseInt(txtNumero.getText());
		l=Integer.parseInt(txtLimite.getText());
	
		
		txtS.setText("TABLA DE MULTIPLICAR DEL 1 AL 12 \n\n");
		while(i<=l) {
			txtS.append(i+"x"+t+"="+(i*t)+"\n");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
