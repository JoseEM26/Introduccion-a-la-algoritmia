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
import javax.swing.JComboBox;

public class Factorizacion4_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTTablas;
	private JTextField txtNumero;
	private JScrollPane scrollPane;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JLabel lblLimite;
	private JComboBox cboTabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorizacion4_1 frame = new Factorizacion4_1();
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
	public Factorizacion4_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTTablas = new JLabel("TTablas");
		lblTTablas.setBounds(10, 11, 46, 14);
		contentPane.add(lblTTablas);
		
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
		
		cboTabla = new JComboBox();
		cboTabla.addActionListener(this);
		cboTabla.setBounds(193, 7, 74, 22);
		contentPane.add(cboTabla);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTabla) {
			actionPerformedComboBox(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
void CalcularMultiplicacion(int t,int i){
	txtS.setText("TABLA DE MULTIPLICAR "+t);
	while(i<=12) {
		txtS.append(i+"x"+t+"="+(i*t)+"\n");
		i++;
	}
	txtS.append("<<FIN DE LA TABLA>>\n");
	
}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		int n,i=1;
		n=Integer.parseInt(txtNumero.getText());
		
		while(i<=n) {
			cboTabla.addItem(i);
			i++;
		}
	}
	protected void actionPerformedComboBox(ActionEvent e) {
	CalcularMultiplicacion(cboTabla.getSelectedIndex()+1,0);	
		
		
		
		
		
		
		
		
	}
}
	

