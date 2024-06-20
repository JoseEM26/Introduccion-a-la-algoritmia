package guis;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Hijos.*;
import padre.*;

public class Menu extends JFrame {
	

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnProcesar(e);
			}
		});
		btnProcesar.setBounds(172, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 414, 210);
		contentPane.add(scrollPane);
		
		txtS = new JTextField();
		scrollPane.setViewportView(txtS);
		txtS.setColumns(10);
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	    Persona p=new Persona("Juam", "Matos", 19);
	    
	    Alumno a=new Alumno("Marcos", "Salazar", 23, 14, 16, 25);

	    DOcente d=new DOcente("Pedro", "Rojas", 31, 100, 26.5);
	}
}
