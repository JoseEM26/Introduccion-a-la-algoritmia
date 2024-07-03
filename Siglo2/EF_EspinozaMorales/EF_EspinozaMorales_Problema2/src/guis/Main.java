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
import hijo.*;
public class Main extends JFrame {

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
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setBounds(10, 11, 414, 48);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 414, 180);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Persona p=new Persona("Jose",7777777, 999999999);
		Estudiante es=new Estudiante("Patricio", 7777771, 999999991, 15, 18, 20);
	    Docente d=new Docente("Naydelin", 7774521, 945625875, 48, 60);
	
	    Imprimir("");
	    Imprimir("Datos de Persona:\n" + listarDatos(p) + "\n\n");
	    Imprimir("Datos de Estudiante:\n" + listarDatos(es) + "\n\n");
	    Imprimir("Datos de Docente:\n" + listarDatos(d));
    }
	
	
	
	 
	public String listarDatos(Persona persona) {
        String datos = persona.mostrarDatos();
        if (persona instanceof Estudiante) {
            datos += "\nTipo: Estudiante";
        } else if (persona instanceof Docente) {
            datos += "\nTipo: Docente";
        }
        return datos;
    }
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
}
