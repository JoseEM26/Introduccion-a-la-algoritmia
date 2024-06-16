package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.ArregloDocente;
import clase.Docente;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listado extends JFrame {

	private JPanel contentPane;
	ArregloDocente ad=new ArregloDocente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listado frame = new Listado();
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
	public Listado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Listado");
		btnNewButton.setBounds(10, 11, 186, 41);
		contentPane.add(btnNewButton);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(218, 11, 206, 41);
		contentPane.add(btnReportar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 414, 340);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
//////////////////////////////////////////////////////////////////////////////////////////////////////

		btnReportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtS.setText("");
			  Reportar();
				
				
				
				
			}
			 void Imprimir(String s) {
				txtS.append(s+"\n");
			}
			
			void Reportar() {
					Imprimir("");
					Imprimir("");
					Imprimir("");
					Imprimir(">>>>>>>>>>>>>>>>>>>Reporte De los Docentes<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
					Imprimir("sueldo promedio:"+"\t"+ad.SueldoPromedio());
					Imprimir("sueldo mayor:"+"\t"+"\t"+ad.SueldoMayor());
					Imprimir("Sueldo menor:"+"\t"+"\t"+ad.SueldoMenor());
					Imprimir("tarifa mayor:"+"\t"+"\t"+ad.TarifaMayor());
					Imprimir("tarifa menor:"+"\t"+"\t"+ad.TarifaMenor());
				
			}
			
		});
//////////////////////////////////////////////////////////////////////////////////////////////////////
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
				Listar();
				
				
			}
			
			 void Imprimir(String s) {
				txtS.append(s+"\n");
			}
			
			void Listar() {
				for(int i=0;i<ad.Tamaño();i++) {
					Imprimir("");
					Imprimir("");
					Imprimir("");
					Imprimir(">>>>>>>>>>>>>>>>>>>DOCENTE NUMERO #"+(i+1)+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
					Imprimir("Codigo:"+"\t"+ad.Obtener(i).getCodigo());
					Imprimir("Nombre:"+"\t"+ad.Obtener(i).getNombres());
					Imprimir("Horas:"+"\t"+ad.Obtener(i).getHoras());
					Imprimir("Tarifas:"+"\t"+ad.Obtener(i).getTarifa());
				}
			}
//////////////////////////////////////////////////////////////////////////////////////////////////////
		});
		
	}
}
