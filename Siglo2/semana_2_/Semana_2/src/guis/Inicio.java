package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.Celular;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

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
		btnNewButton.setBounds(165, 30, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(10, 49, 414, 201);
		contentPane.add(txtS);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Celular c=new Celular(975026835,"Nombre123",20,100);
				
				
				Imprimir("Numero"+"\t\t"+c.getNumero());
				Imprimir("Usuario"+"\t\t"+c.getUsuario());
				Imprimir("Segundos Consumidos"+"\t"+c.getSegundos_const()+20);
				Imprimir("Precio Por Segundos"+"\t"+c.getPrecio_Seg()*0.95);
				Imprimir("Consumo Costo"+"\t"+c.CostoConsumo());
				Imprimir("IGV"+"\t\t"+c.Impuesto());
				Imprimir("PagoTotal"+"\t\t"+c.Totalapagar());

			}
			void Imprimir(String s) {
				txtS.append(s+"\n");
			}
		});
		
	}
}
