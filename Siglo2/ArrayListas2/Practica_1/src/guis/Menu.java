package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import clases.*;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNota1;
	private JTextField txtNombre;
	private JTextField txtNota2;
	private JTable table;
	
	DefaultTableModel modelo=new DefaultTableModel();
	ArregloAlumno alu=new ArregloAlumno();

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
		setBounds(100, 100, 518, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Listar");
		btnNewButton.setBounds(403, 26, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Adicionar");
		btnNewButton_1.setBounds(403, 74, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EliminarTodo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alu.Tamaño()>0) {
					alu.Eliminartodo();
					Listar();
				}else {
					Mensaje("El arreglo no tiene nada esta vacio");
				}
			}
		});
		btnNewButton_2.setBounds(398, 126, 104, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar Finañ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alu.Tamaño()>0 ) {
					alu.EliminarFinal();
					Listar();
				}else {
					Mensaje("Esta vacio el arreglo");
				}
			}
		});
		btnNewButton_3.setBounds(398, 180, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("codigo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(67, 8, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("nombre");
		lblNewLabel_1.setBounds(183, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nora1");
		lblNewLabel_2.setBounds(10, 48, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("nota2");
		lblNewLabel_3.setBounds(183, 48, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(66, 45, 86, 20);
		contentPane.add(txtNota1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(236, 8, 86, 20);
		contentPane.add(txtNombre);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(236, 45, 86, 20);
		contentPane.add(txtNota2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 74, 383, 319);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>	
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Nota1");
		modelo.addColumn("Nota2");
		modelo.addColumn("Promedio");
		table.setModel(modelo);
		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		
		
		
		//BOTON ADICIONAR
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					int codigo=leerCodigo();
					if(alu.Buscar(codigo)==null) {
						String nombre=leerNombre();
						if(nombre.length()>0) {
						   	try {
						   		int nota1=leerNota1();
						   		   try {
									  int nota2=leerNota2();
									  Alumno nuevo=new Alumno(codigo, nota1, nota2, nombre);
									  alu.Adicionar(nuevo);
									  Listar();
									  Limpieza();
									 
								} catch (Exception e2) {
									Mensaje("Ingrese una nota Valida");
									Limpieza();
									txtNota2.requestFocus();
								}
								
							} catch (Exception e2) {
								Mensaje("Ingrese una nota Valida");
								Limpieza();
								txtNota1.requestFocus();
							}
						   }else {
						Mensaje("Ingresa un dato de texto");
						Limpieza();
						txtNombre.requestFocus();
						}
					}else {
						Mensaje("EL CODIGO YA EXISTE PUTO");
						Limpieza();
						txtCodigo.requestFocus();
					}
					
				} catch (Exception e2) {
					Mensaje("INGRESE Algun dato");
					Limpieza();
					txtCodigo.requestFocus();
				}
				
			}
	///////////////////////////////////////////////////////////////////
			void Limpieza() {
		           txtCodigo.setText("");
		           txtNombre.setText("");
		           txtNota1.setText("");
		           txtNota2.setText("");
		           txtCodigo.requestFocus();
			}
			
			
			
		    public int leerCodigo() {
				return Integer.parseInt(txtCodigo.getText().trim());
			}
			
			String leerNombre() {
				return txtNombre.getText().trim();
			}
			
			int leerNota1() {
				return Integer.parseInt(txtNota1.getText().trim());
			}
			
			int leerNota2() {
				return Integer.parseInt(txtNota2.getText().trim());
			}
	////////////////////////////////////////////////////////////////////////
		});
		
		
		
		
		
		
		
		//BOTON LISTAR
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar();
			}});
		
	}
	private void Mensaje(String s) {
		JOptionPane.showMessageDialog(null,s);
	}
	
	private void Listar() { 
		modelo.setRowCount(0);
		for(int i=0;i<alu.Tamaño();i++) {
			Object fila[]= {
					alu.Obtener(i).getCodigo(),
					alu.Obtener(i).getNombre(),
					alu.Obtener(i).getNota1(),
					alu.Obtener(i).getNota2(),
					alu.Obtener(i).promedio(),
			};
			modelo.addRow(fila);
		}
	}
}
