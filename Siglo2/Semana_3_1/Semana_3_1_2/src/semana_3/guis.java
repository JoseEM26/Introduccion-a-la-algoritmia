package semana_3;

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
		btnNewButton.setBounds(160, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 205);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado e1=new Empleado(11111,"Jose Angel",0,9999999);
				Empleado e2=new Empleado(11112,"Cabrooooo");
				Empleado e3=new Empleado();
				
                Lista(e1);
                Lista(e2);
                Lista(e3);
				
				Imprimir("");
				Imprimir("");

				Imprimir("Factor Descuento"+"\t"+Empleado.getFactordesc());
				Imprimir("Contador"+"\t"+Empleado.getContador());
				Imprimir("Sumatoria Sueldos"+"\t"+Empleado.getAcumuladorSueldos());

				
			}
			
			void Imprimir(String s) {
				textArea.append(s+"\n");
			}
			void Lista(Empleado x) {
				Imprimir("");
				Imprimir("");
				Imprimir("Codigo"+"\t"+x.getCodigo());
				Imprimir("Nombre"+"\t"+x.getNombre());
				Imprimir("Categoria"+"\t"+x.getCategorioa());
				Imprimir("Calular"+"\t"+x.getNumeroCel());
				Imprimir("Codigo"+"\t"+x.getCodigo());
			}
		});
		
	}

}
