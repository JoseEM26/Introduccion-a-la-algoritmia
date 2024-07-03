package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import padre.*;
import hijos.*;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtS;

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
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 45, 404, 205);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setBounds(149, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Cuadrado cu=new Cuadrado(12, 15, 10);
		Circulo ci=new Circulo(12, 22, 12.3);
		
		Imprimir(cu.Ubicacion());
		Imprimir(cu.Area()+"");
		Imprimir("");
		Imprimir("");
		Imprimir(ci.area()+"");
		Imprimir(ci.Ubicacion());
		
		
		
		
		
		
		
		
		
	}
	void Imprimir(String s) {
		 txtS.append(s+"\n");
	}
}
