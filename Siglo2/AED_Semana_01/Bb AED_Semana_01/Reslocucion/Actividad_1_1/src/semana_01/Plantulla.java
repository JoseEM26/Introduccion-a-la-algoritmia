package semana_01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import semana_01.Expositor;
public class Plantulla extends JFrame {
  
	private JPanel contentPane;
    private JTextArea txtS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plantulla frame = new Plantulla();
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
	public Plantulla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnS = new JButton("New button");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnS(e);
			}
		});
		btnS.setBounds(29, 11, 89, 23);
		contentPane.add(btnS);
		
		 txtS = new JTextArea();
		txtS.setBounds(10, 59, 257, 149);
		contentPane.add(txtS);
	}
    void Imprimir(String S) {
    	txtS.append(S+"\n");
    }
	protected void actionPerformedBtnS(ActionEvent e) {
		Expositor a=new Expositor();
		
		a.codigo=1111;
		a.nombre="Espinoza";
		a.trabajdasHoras=55;
		a.HoraTarifa=100;
		
		Imprimir(""+a.codigo  );
		Imprimir(""+ a.nombre);
		Imprimir(""+ a.trabajdasHoras );
		Imprimir(""+ a.SuelfoBruto() );
		Imprimir(""+ a.DescAFP() );
		Imprimir(""+ a.DescEPS() );
		Imprimir(""+ a.SueldoNETO() );
		
		
	}
}
