package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empleado;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;

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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 414, 172);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnNewButton = new JButton("BOTONCITO");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 11, 414, 56);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		
	    Empleado e1=new Empleado("Jose Miguel",18,79456824,1);
	    Empleado e2=new Empleado("Daniel Boluarte",79456852);
	    Empleado e3=new Empleado();
	    
	    Lista(e1);
	    Lista(e2);
	    Lista(e3);
		Imprimir("");
		Imprimir("");
	    Imprimir("NAME OF THE EMPRESA AND CANT OF THE PEOPLE");
		Imprimir("-----------------------------------------------------------------------------------------");
		
	    Imprimir("Cantidad Trabajadores:"+"\t"+e3.getCantidad());
		Imprimir("Nombre Empresa:"+"\t"+e3.getEmpresa());
	
		
	}
	
	void Imprimir (String s){
		txtS.append(s+"\n");
	}
	void Lista(Empleado x){
		Imprimir("");
		Imprimir("LISTA DE TRABAJADORES");
		Imprimir("-----------------------------------------------------------------------------------------");
		Imprimir("Nombre Completo:"+"\t"+x.getNombre());
		Imprimir("Edad:"+"\t"+"\t"+x.getEdad());
		Imprimir("DNI:"+"\t"+"\t"+x.getDni());
		Imprimir("Categoria:"+"\t"+"\t"+x.getCategoria());
		Imprimir("Sueldo Bruto:"+"\t"+"\t"+x.getSueldoBruto(x));
		Imprimir("Descuento:"+"\t"+"\t"+x.getDescuento(x));
		Imprimir("Sueldo Neto:"+"\t"+"\t"+x.getSueldoNeto(x));
		Imprimir("Proyeccion:"+"\t"+"\t"+x.getProyeccion(x));
		
	}
}














