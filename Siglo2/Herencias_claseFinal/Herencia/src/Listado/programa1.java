package Listado;
import Padre.Persona;
import Hijo.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class programa1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					programa1 frame = new programa1();
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
	public programa1() {
		setResizable(false);
		setBounds(100, 100, 450, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(166, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 424, 306);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Persona p=new Persona("Juan","Matos",18);
		listado(p);
		Alumno a=new Alumno("Marco","Salazar",23,14,16,15);
		listado(a);
		Docente d=new Docente("Pedro","Rojas",31,100,35.9);
		listado(d);
	}
	
	void listado(Persona x){
		imprimir(">>>Persona");
		imprimir(x.datosDeLaPersona());
		imprimir("Correo: "+x.GenerarCorreo());
		imprimir("");
	}
	
	void listado(Alumno x){
		imprimir(">>>Alumno");
		imprimir(x.datosCompletos());
		imprimir("Correo: "+x.GenerarCorreo());
		imprimir("Promedio: "+x.calcularPromedio());
		imprimir("");
	}
	
	void listado(Docente x){
		imprimir(">>>Docente");
		imprimir(x.datosCompletos());
		imprimir("Correo: "+x.GenerarCorreo());
		imprimir("Sueldo: "+x.calcularSueldo());
	}
	
	void imprimir(){
		imprimir("");
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
}
