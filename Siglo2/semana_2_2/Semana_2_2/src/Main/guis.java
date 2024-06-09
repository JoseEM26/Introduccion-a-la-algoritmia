package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.Paciente;

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
		setResizable(false);
		setBounds(100, 100, 450, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setBounds(10, 11, 206, 84);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 106, 404, 353);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paciente p1=new Paciente("nombre1", "Apellido1", 11, 1.70, 66, 450);
				Paciente p2=new Paciente("nombre2", "Apellido2", 15, 1.20, 60, 200);
				Paciente p3=new Paciente("nombre3", "Apellido3", 19, 1.60, 46, 300);
				Paciente p4=new Paciente("nombre4", "Apellido4", 25, 1.90, 96, 400);
				
				Lista(p1);
				Lista(p2);
				Lista(p3);
				Lista(p4);
				
                Imprimir("");
				Imprimir("Cantidad de PAcientes"+p4.ContadorPacientes());
                Imprimir("");
                Imprimir("Persona Que Pago mas"+"\t"+p1.PersonaPAgoMAs(p2, p3, p4));

			}
			
			void Lista(Paciente x) {
				Imprimir("");
				Imprimir("DATOS DE LOS PACIENTES");
				Imprimir("________________________________________________________________");
				Imprimir("Nombre"+"\t"+"\t"+ x.getApellido());
				Imprimir("Apellido"+"\t"+"\t"+ x.getApellido());
				Imprimir("Edad"+"\t"+"\t"+ x.getEdad());
				Imprimir("Talla"+"\t"+"\t"+ x.getTalla());
				Imprimir("Peso"+"\t"+"\t"+ x.getPeso());
				Imprimir("Pago por Servicio"+"\t"+ x.getPago());
				Imprimir("Verificacion de la Edad"+"\t"+ x.MenorMayorEdad(x));
			}
			
			void Imprimir(String s) {
				txtS.append(s+"\n");
			}
		});

		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
			}
		});
		btnNewButton_1.setBounds(218, 11, 206, 84);
		contentPane.add(btnNewButton_1);
	}
}
