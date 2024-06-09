package tabla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guia.Proyect;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabka  extends JFrame {

	private JPanel contentPane;
	private JTextArea txtS; // Declarar txtS como una variable de instancia

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabka  frame = new Tabka ();
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
	public Tabka () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setBounds(160, 31, 89, 23);
		contentPane.add(btnNewButton);
		
		txtS = new JTextArea(); // Inicializar txtS
		txtS.setBounds(34, 82, 356, 141);
		contentPane.add(txtS);
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Proyect p = new Proyect();
		p.codigo = 123;
		p.horas = 20;
		p.nombre = "Jose";
		p.tarifa = 40;
		
	
		imprimir("tarifa : "+p.tarifa +"\n");
		imprimir("SueldoBru : "+p.SueldoBruto() +"\n");
		imprimir("Desc : "+p.Descuento() +"\n");
		imprimir("Final : "+p.SueldoNeto() +"\n");
	}
}
