package semana_03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Objetos.Arreglo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Semana03 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JButton btnGenerar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	Arreglo a= new Arreglo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semana03 frame = new Semana03();
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
	public Semana03() {
		setTitle("Ejercicio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(43, 24, 89, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(180, 24, 89, 23);
		contentPane.add(btnReportar);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(319, 24, 89, 23);
		contentPane.add(btnGenerar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 424, 271);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		textArea.setText("");
		for(int i=0;i<a.tamaño();i++)
			imprimir("n["+i+"]"+a.obtener(i));
	}
	

	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		textArea.setText("");
		imprimir("Capacidad máxima: "+
				a.tamaño());
		imprimir("Suma de los números: "+
		a.sumaNumeros());
		imprimir("Posición del primer número menor a 25: "+
		a.posPrimerNumeroMenorA25());
		
	}

	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
		a.generar();
		textArea.setText("Los números han sido generados");
	
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
}
