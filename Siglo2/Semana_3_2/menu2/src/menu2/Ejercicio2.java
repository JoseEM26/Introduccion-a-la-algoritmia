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
import Objetos.Libro;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Ejercicio2 extends JFrame implements ActionListener {

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
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(23, 26, 93, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 445, 374);
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
		Libro a=new Libro(123456,300,"Harry Potter","","");
		Libro b=new Libro(123456,325,"Volar sobre el pantano","","");
		Libro c=new Libro(123456,450,"Los triunfadores","","");
		Libro d=new Libro(123456,327,"Sangre de campeon","","");
		
		imprimir("LISTA DE LOS Libros");
		imprimir("-----------------------------");
		Listado(a);
		Listado(b);
		Listado(c);
		Listado(d);
		
		imprimir("-----------------------------");
		String mejor=a.precioLibro(b,c,d);
		imprimir("El libro con mayor precio es: "+mejor);
		imprimir("La cantidad de libros son: "+a.getCantidad());
		
	}
	
	void Listado(Libro x){
		imprimir("DATOS DEL LIBRO");
		imprimir("-----------------------------");
		imprimir("Codigo del libro: "+x.getCodigo());
		imprimir("Nombre del libro: "+x.getNombre());
		imprimir("Nombre del autor: "+x.getAutor());
		imprimir("Precio del libro: "+x.getPrecio());
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
}
