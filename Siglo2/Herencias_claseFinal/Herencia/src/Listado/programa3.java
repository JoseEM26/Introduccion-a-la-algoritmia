package Listado;
import Padre.Animal;
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

public class programa3 extends JFrame implements ActionListener {

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
					programa3 frame = new programa3();
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
	public programa3() {
		setBounds(100, 100, 450, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(161, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 414, 362);
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
		//uppCasting
		Object oa = new Animal();
		Object om = new Mamifero();
		Object op = new Perro();
		//Animal am = new Mamifero();
	    //Animal ap = new Perro();
		//Mamifero mp=new Perro();
		
		//DownCasting
		Animal ao = (Animal) oa;
		Mamifero mo=(Mamifero) om;
		Perro po = (Perro) op;
		Mamifero ma=(Mamifero) om;
		Perro pa = (Perro) op;
		Perro pm = (Perro) op;
		
		imprimir("DOWNCASTING");
		imprimir(">>>Objeto ao");
		imprimir("hacer ruido: "+ao.hacerRuido());
		imprimir("");
		imprimir(">>>Objeto mo");
		imprimir("mensaje :"+mo.mensaje());
		imprimir("hacer ruido: "+mo.hacerRuido());
		imprimir("");
		imprimir(">>>Objeto ma");
		imprimir("mensaje :"+ma.mensaje());
		imprimir("hacer ruido: "+ma.hacerRuido());
		imprimir("");
		imprimir(">>>Objeto po");
		imprimir("mensaje :"+po.mensaje());
		imprimir("hacer ruido: "+po.HacerRuido());
		imprimir("");
		imprimir(">>>Objeto pa");
		imprimir("mensaje :"+pa.mensaje());
		imprimir("hacer ruido: "+pa.HacerRuido());
		imprimir("");
		imprimir(">>>Objeto pm");
		imprimir("mensaje :"+pm.mensaje());
		imprimir("hacer ruido: "+pm.HacerRuido());
		
		
	}
	
	void imprimir(){
		imprimir("");
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
	
}
