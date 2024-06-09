
package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guis extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guis frame = new guis();
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
	public guis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(92, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtS = new JTextArea();
		txtS.setBounds(10, 46, 397, 204);
		contentPane.add(txtS);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pelota p=new Pelota("Nike",100,150,10,600);
				
				Listado(p);
			
				
				
				
				
				
				
			}
			void Imprimir(String S) {
				txtS.append(S+"\n");
			}
			void Listado(Pelota x) {
				Imprimir("Radio"+x.Radio());
				Imprimir("Volumen Balon"+x.VolumenBalon());
				Imprimir("Descuento"+x.Descuento());
				Imprimir("Importe a Pagar"+x.ImportePagar());
			}
		});
		
	}
}
