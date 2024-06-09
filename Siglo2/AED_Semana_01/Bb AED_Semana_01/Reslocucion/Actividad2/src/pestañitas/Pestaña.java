package pestañitas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import calcilo.Calculos;
public class Pestaña extends JFrame {
	

	private JPanel contentPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pestaña frame = new Pestaña();
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
	public Pestaña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setBounds(44, 32, 89, 23);
		contentPane.add(btnNewButton);
		
	    txtS = new JTextArea();
		txtS.setBounds(26, 79, 244, 171);
		contentPane.add(txtS);
	}
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Calculos c= new Calculos();
		
		  c.nombre="Naudeñon";
		  c.apellido="Espinoza";
		  c.edad=21;
		  c.peso=40;
		  c.estatura=1.5;
		  
		  imprimir("Estado Corporal"+c.EstadoPersona());
		  imprimir("Ibdice Corporal"+c.IndiceMasaCorporal());
		  
	}
	
}

