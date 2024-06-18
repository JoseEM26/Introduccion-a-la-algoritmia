package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.*;
import guis.*;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloCliente;

public class Eliminacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	DefaultTableModel modelo=new DefaultTableModel();
	ArregloCliente cl=new ArregloCliente();
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminacion frame = new Eliminacion();
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
	public Eliminacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aliminar Todo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cl.Tamaño()>0) {
					cl.EliminarTodo();
					Listar2();
					Mensaje("Acaba de Eliminar Toda la base de Datos");
					
					
				}else {
				Mensaje("Ya no hay Datos que Eliminar");
				}
			}
		});
		btnNewButton.setBounds(10, 11, 185, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEliminarUltimo = new JButton("Eliminar Ultimo");
		btnEliminarUltimo.setBounds(205, 11, 219, 23);
		contentPane.add(btnEliminarUltimo);
		
		JButton btnNewButton_1 = new JButton("Mostrar Tabla");
		btnNewButton_1.setBounds(10, 37, 414, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 404, 179);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		//>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
				modelo.addColumn("Codigo");
				modelo.addColumn("Nombre");
				modelo.addColumn("Apellido");
				modelo.addColumn("Direcion");
				modelo.addColumn("Telefono");
				modelo.addColumn("DNI");
				table.setModel(modelo);
				
		//>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar();}
		});
		
	}
	void Listar2() {
		modelo.setRowCount(0);
		
			for(int i=0;i<cl.Tamaño();i++) {
				Object Lista[] ={
						cl.Obtener(i).getCodigoCliente(),
						cl.Obtener(i).getNombres(),
						cl.Obtener(i).getApellido(),
						cl.Obtener(i).getDireccion(),
						cl.Obtener(i).getTelefono(),
						cl.Obtener(i).getDni(),
						
						
				};
				modelo.addRow(Lista);
			}
		
		}
	void Listar() {
		modelo.setRowCount(0);
		if(cl.Tamaño()>0) {
			for(int i=0;i<cl.Tamaño();i++) {
				Object Lista[] ={
						cl.Obtener(i).getCodigoCliente(),
						cl.Obtener(i).getNombres(),
						cl.Obtener(i).getApellido(),
						cl.Obtener(i).getDireccion(),
						cl.Obtener(i).getTelefono(),
						cl.Obtener(i).getDni(),
						
						
				};
				modelo.addRow(Lista);
			}
		}else {
			Mensaje("No Hay Datos Que Mostrar");
		}
		}
	
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
}
