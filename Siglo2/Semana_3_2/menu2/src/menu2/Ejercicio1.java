package menu2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Objetos.Alumno;

public class Ejercicio1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setResizable(false);
		setBounds(100, 100, 471, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(26, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 42, 445, 271);
		contentPane.add(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Alumno a=new Alumno(123456,"Francisco",15,16);
		Alumno b=new Alumno(789012,"Alejandro",14,18);
		imprimir("LISTA DE LOS ALUMNOS");
		imprimir("-----------------------------");
		Listado(a);
		Listado(b);
		
		imprimir("-----------------------------");
		String mejor=a.mejorAlumno(b);
		imprimir("El mejor alumno es: "+mejor);
		imprimir("La cantidad de alumnos son: "+a.getCantidad());
	}
	
	void Listado(Alumno x){
		imprimir("DATOS DEL ALUMNO");
		imprimir("-----------------------------");
		imprimir("Codigo del alumno: "+x.getCodigo());
		imprimir("Nombre del alumno: "+x.getNombre());
		imprimir("Promedio del alumno: "+x.promedio());
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
}
