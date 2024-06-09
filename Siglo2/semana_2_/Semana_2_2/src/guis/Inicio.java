package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.Computadora;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(181, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(10, 44, 395, 206);
		contentPane.add(txtS);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Computadora c=new Computadora(1111, "GLG", "Rojo", 10);
				
				c.setDolares(c.getDolares()*0.90);
				
				Imprimir("Dolates"+"\t"+c.getDolares());
				Imprimir("Precio Soles"+"\t"+c.PrecioSoles());
				Imprimir("Precio euros"+"\t"+c.precioEuro());
				
				
			}
			void Imprimir(String s) {
				txtS.append(s+"\n");
			}
		});
		
	}

}
