package Listado;
import Padre.Mamifero;
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

public class programa4 extends JFrame implements ActionListener {

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
					programa4 frame = new programa4();
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
	public programa4() {
		setResizable(false);
		setBounds(100, 100, 450, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(175, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 50, 444, 399);
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
		Gato g = new Gato();
		listado(g);
		Perro2 p = new Perro2();
		listado(p);
	}
	
	void listado(Mamifero x){
		if(x instanceof Gato)
			imprimir(">>> Objeto Gato");
		else
			imprimir(">>> Objeto Perro");
		
		imprimir("mensaje :"+x.mensaje());
		imprimir("hacer ruido: "+x.hacerruido());
		
		if(x instanceof Gato){
			imprimir("Vacuna A : "+((Gato)x).vacunaA);
			imprimir("cuidado : "+((Gato)x).cuidado());
			
		}else{
			imprimir("Vacuna A : "+((Perro2)x).vacunaA);
			imprimir("Vacuna A : "+((Perro2)x).vacunaB);
			imprimir("cuidado : "+((Perro2)x).cuidado());
			imprimir("cuidado : "+((Perro2)x).peligro());
		}
	}
	
	void imprimir(){
		imprimir("");
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
	
}