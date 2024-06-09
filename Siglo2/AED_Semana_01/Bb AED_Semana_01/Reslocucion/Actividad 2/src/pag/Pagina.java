package pag;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 import cod.Codigo;
public class Pagina extends JFrame {

	private JPanel contentPane;
    private JTextArea txtS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagina frame = new Pagina();
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
	public Pagina() {
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
		btnNewButton.setBounds(34, 35, 89, 23);
		contentPane.add(btnNewButton);
		
	    txtS = new JTextArea();
		txtS.setBounds(10, 69, 283, 181);
		contentPane.add(txtS);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Codigo c=new Codigo();
		
		c.codigo=112333 ;
		c.nombre= "Espinoza";
		c.Categoria= 1;
		c.Cel= 999999999;
		
		

		Imprimir("codigo"+c.codigo);
		Imprimir("nombre"+c.nombre);
		Imprimir("Categoria"+c.Categoria);
		Imprimir("Cel"+c.Cel);
		Imprimir("SueldoCoordinador"+c.SueldoCoordinador());
		
		
		
		
		
		
	}
}
