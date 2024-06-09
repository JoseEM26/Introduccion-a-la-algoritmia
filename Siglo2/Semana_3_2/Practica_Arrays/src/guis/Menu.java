package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import objetos.Alumno;
import objetos.ArregloAlumno;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo=new DefaultTableModel();
 
	ArregloAlumno au=new ArregloAlumno();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(155, 11, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(290, 11, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 53, -355, 87);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 45, 414, 135);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		//////////////////////////////////////////////////////
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("Nota1");
		modelo.addColumn("Nota2");
		modelo.addColumn("Promedio");
		table.setModel(modelo);
		
		
		
		
		
		//////////////////////////////////////////////////////

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 191, 414, 185);
		contentPane.add(scrollPane_2);
		
		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				au.agregar();
				modelo.setRowCount(0);
				
				for(int i=0;i<au.Tamaño();i++) {
					Object[] fila= {
						     au.obtener(i).getNombre(),
						     au.obtener(i).getCodigo(),
						     au.obtener(i).getNota1(),
						     au.obtener(i).getNota2(),
						     au.obtener(i).Promedio()
						};
					modelo.addRow(fila);
				}
				
				
			
				
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
	}
}
