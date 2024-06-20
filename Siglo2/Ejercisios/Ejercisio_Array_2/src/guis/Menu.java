package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import clase.*;
import arreglos.*;
import javax.swing.table.DefaultTableModel;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTable table;
	private JTextField txtEliminarCodigo;
     DefaultTableModel modelo=new DefaultTableModel();
     ArreglosAlumno alu=new ArreglosAlumno();
     private JButton btnListar;
     private JButton btnAdicionar;
     private JButton btnEliminarTodo;
     private JButton btnEliminarultimo;
     private JButton btnEliminarcodigo;
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
		setBounds(100, 100, 485, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(132, 11, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nota1");
		lblNewLabel_1_1.setBounds(254, 11, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nota2");
		lblNewLabel_1_1_1.setBounds(369, 11, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 25, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(132, 25, 86, 20);
		contentPane.add(txtNombre);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(251, 25, 86, 20);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(369, 25, 86, 20);
		contentPane.add(txtNota2);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnAdicionar(e);
			}
		});
		btnAdicionar.setBounds(369, 99, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnEliminarTodo = new JButton("EliminarTodo");
		btnEliminarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnEliminarTodo(e);
			}
		});
		btnEliminarTodo.setBounds(347, 132, 121, 23);
		contentPane.add(btnEliminarTodo);
		
		btnEliminarultimo = new JButton("EliminarUltimo");
		btnEliminarultimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnEliminarultimo(e);
			}
		});
		btnEliminarultimo.setBounds(357, 169, 101, 23);
		contentPane.add(btnEliminarultimo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 351, 184);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		///////////////////////////////////////////
		modelo.addColumn("Codigo");
		modelo.addColumn("Nota1");
		modelo.addColumn("Nota2");
		modelo.addColumn("Nombre");
		modelo.addColumn("Promedio");
		table.setModel(modelo);
		///////////////////////////////////////////
		
		btnEliminarcodigo = new JButton("EliminarCodigo");
		btnEliminarcodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnEliminarcodigo(e);
			}
		});
		btnEliminarcodigo.setBounds(347, 203, 121, 23);
		contentPane.add(btnEliminarcodigo);
		
		txtEliminarCodigo = new JTextField();
		txtEliminarCodigo.setBounds(379, 230, 86, 20);
		contentPane.add(txtEliminarCodigo);
		txtEliminarCodigo.setColumns(10);
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnListar(e);
			}
		});
		btnListar.setBounds(369, 65, 89, 23);
		contentPane.add(btnListar);
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		Listar();
		
		
		
		
		
		
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
		Adicionar();
	}
	protected void actionPerformedBtnEliminarcodigo(ActionEvent e) {
		ELiminarCodigo();
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent e) {
		EliminarTOdo();
	}
	protected void actionPerformedBtnEliminarultimo(ActionEvent e) {
		EliminarFInal();
	}
	/////////////////EnCapsulamientos/////////////////////////////////////
	void Listar() {
		modelo.setRowCount(0);
		for(int i=0;i<alu.Tamaño();i++) {
			Object fila[]= {
					alu.Obtener(i).getCodigo(),
					alu.Obtener(i).getNota1(),
					alu.Obtener(i).getNota2(),
					alu.Obtener(i).getNombre(),
					alu.Obtener(i).Promedio(),
			};
			modelo.addRow(fila);
		}
	}

	String leerNombre() {
		return txtNombre.getText();
	}
	
	int LeerCodigo() {
		return  Integer.parseInt(txtCodigo.getText());
	}
	
	int LeerNota1() {
		return Integer.parseInt(txtNota1.getText());
	}
	
	int LeerNota2() {
		return Integer.parseInt(txtNota2.getText());
	}
	
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(null,s);
	}
	
	void Limpiar() {
	       txtCodigo.setText("");
	       txtEliminarCodigo.setText("");
	       txtNombre.setText("");
	       txtNota1.setText("");
	       txtNota2.setText("");
	}
	
	public void Adicionar() {
		
		try {
			int Codigo=LeerCodigo();
			if(alu.BuscarCodigp(Codigo)==null && Codigo ==Codigo) {
				try {
					String Nombre=leerNombre();
					if(Nombre.length()>0 ) {
						try {
							int Nota1=LeerNota1();
							if(Nota1 == (int)Nota1 && Nota1<20 && Nota1==Nota1) {
								try {
									int Nota2=LeerNota1();
									if(Nota2 == (int)Nota2 && Nota2<20 && Nota2==Nota2) {
										Alumno nuevo=new Alumno(Codigo, Nota1, Nota2, Nombre);
										alu.Adicionar(nuevo);
										Listar();
										Limpiar();
										
									}else {
										Mensaje("No es tipo de dato int en Nota2");
										txtNota2.setText("");
										txtNota2.requestFocus();
									}
								} catch (Exception e) {
									Mensaje("No haz ingresado un dato");
									txtNota2.setText("");
									txtNota2.requestFocus();
								}
								
							}else {
								Mensaje("No es tipo de dato int en Nota1");
								txtNota1.setText("");
								txtNota1.requestFocus();
							}
						} catch (Exception e) {
							Mensaje("No haz ingresado un dato");
							txtNota1.setText("");
							txtNota1.requestFocus();
						}
						
						
					}else {
						Mensaje("No puede Devoler una casilla en blanco");
						txtNombre.setText("");
						txtNombre.requestFocus();
					}
				} catch (Exception e) {
					Mensaje("Dato no valido");
					txtNombre.setText("");
					txtNombre.requestFocus();
				}
			}else {
				Mensaje("El codigo ya existe");
				txtCodigo.setText("");
				txtCodigo.requestFocus();
			}
		} catch (Exception e) {
			Mensaje("El no es valido");
			txtCodigo.setText("");
			txtCodigo.requestFocus();
		}
		
	}
	
	void EliminarTOdo() {
		if(alu.Tamaño()>0) {
			alu.EliminarTodo();
			Listar();
		}else {
			Mensaje("Esta Vacip");
		}
	}
	
	
	void EliminarFInal() {
		if(alu.Tamaño()>0) {
			alu.EliminarFinal();
			Listar();
			
		}
	}

    void ELiminarCodigo() {
    	for(int i=0;i<alu.Tamaño();i++) {
    		if(alu.Obtener(i).getCodigo()==Integer.parseInt(txtEliminarCodigo.getText())) {
    			alu.EliminarCodigo(i);
    			Listar();
    		}
    	}
    	txtEliminarCodigo.setText("");
    }
	



	///////////////////////////////////////////////////////////////////
	
}
