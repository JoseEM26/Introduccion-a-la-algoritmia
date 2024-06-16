package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import objetos.Alumno;
import objetos.ArreglosAlumnos;

public class Menu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTexto;
	private JTextField txtCodigo;
	private JLabel lblNombre;
	private JLabel lblNota;
	private JLabel lblNota_1;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnListar;
	private JButton btnAdicionar;
	private JButton btnEliminarFinal;
	private JButton btnEliminarTodo;
	DefaultTableModel modelo=new DefaultTableModel();
	ArreglosAlumnos alu=new ArreglosAlumnos();

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
		setBounds(100, 100, 462, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTexto = new JLabel("Codigo");
		lblTexto.setBounds(10, 19, 46, 14);
		contentPane.add(lblTexto);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(41, 8, 63, 36);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(113, 19, 46, 14);
		contentPane.add(lblNombre);
		
		lblNota = new JLabel("Nota1");
		lblNota.setBounds(223, 19, 46, 14);
		contentPane.add(lblNota);
		
		lblNota_1 = new JLabel("Nota2");
		lblNota_1.setBounds(334, 19, 46, 14);
		contentPane.add(lblNota_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(144, 8, 63, 36);
		contentPane.add(txtNombre);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(254, 8, 63, 36);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(371, 8, 63, 36);
		contentPane.add(txtNota2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 62, 340, 188);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		//////////////////////////////////////////////////////////////
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Nota1");
		modelo.addColumn("Nota2");
		modelo.addColumn("Promedio");
	    table.setModel(modelo);

		
		
		
		//////////////////////////////////////////////////////////////
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(355, 59, 79, 23);
		contentPane.add(btnListar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(355, 86, 79, 23);
		contentPane.add(btnAdicionar);
		
		btnEliminarFinal = new JButton("ElimFinal");
		btnEliminarFinal.addActionListener(this);
		btnEliminarFinal.setBounds(355, 114, 79, 23);
		contentPane.add(btnEliminarFinal);
		
		btnEliminarTodo = new JButton("ElimTodo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(355, 143, 79, 23);
		contentPane.add(btnEliminarTodo);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminar_1(arg0);
		}
		if (arg0.getSource() == btnEliminarFinal) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		Listado();
		
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		
		try {
		    int codigo = leerCodigo();
		    if (alu.buscar(codigo) == null) {
		        String nombre = leerNombre();
		        if (nombre.length() > 0) {
		            try {
		                int nota1 = leerNota1();
		                try {
		                    int nota2 = leerNota2();
		                    Alumno nuevo = new Alumno(codigo, nota1, nota2, nombre);
		                    alu.Adicionar(nuevo);
		                    Listado();
		                    Limpiar();
		                } catch (Exception e1) {
		                    mensaje("Ingrese Nota2 Correcta");
		                    txtNota2.setText("");
		                    txtNota2.requestFocus();
		                }
		            } catch (Exception e1) {
		                mensaje("Ingrese Nota1 Correcta");
		                txtNota1.setText("");
		                txtNota1.requestFocus();
		            }
		        } else {
		            mensaje("Ingrese Nombre Correcto");
		            txtNombre.setText("");
		            txtNombre.requestFocus();
		        }
		    } else {
		        mensaje("El c�digo ya existe");
		        txtNombre.setText("");
		        txtNombre.requestFocus();
		    }
		} catch (Exception e1) {
		    mensaje("Ingresar c�digo correcto");
		    txtNombre.setText("");
		    txtNombre.requestFocus();
		}
		
		
		
		

	}
	
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
	 JButton btnEliminarFinal=new JButton("Eliminar Final");

      if(alu.Tamaño()>0){
    	  alu.EliminarFinal();
    	  Listado();
      }
      
      ////////////////////////////
      try {
		    int codigo = leerCodigo();
		    if (alu.buscar(codigo) == null) {
		        String nombre = leerNombre();
		        if (nombre.length() > 0) {
		            try {
		                int nota1 = leerNota1();
		                try {
		                    int nota2 = leerNota2();
		                    Alumno nuevo = new Alumno(codigo, nota1, nota2, nombre);
		                    alu.Adicionar(nuevo);
		                    Listado();
		                    Limpiar();
		                } catch (Exception e1) {
		                    mensaje("Ingrese Nota2 Correcta");
		                    txtNota2.setText("");
		                    txtNota2.requestFocus();
		                }
		            } catch (Exception e1) {
		                mensaje("Ingrese Nota1 Correcta");
		                txtNota1.setText("");
		                txtNota1.requestFocus();
		            }
		        } else {
		            mensaje("Ingrese Nombre Correcto");
		            txtNombre.setText("");
		            txtNombre.requestFocus();
		        }
		    } else {
		        mensaje("El c�digo ya existe");
		        txtNombre.setText("");
		        txtNombre.requestFocus();
		    }
		} catch (Exception e1) {
		    mensaje("Ingresar c�digo correcto");
		    txtNombre.setText("");
		    txtNombre.requestFocus();
		}
      //////////////////////////////
      
	}
	
	
	protected void actionPerformedBtnEliminar_1(ActionEvent arg0) {
	JButton btnEliminarTodo=new JButton("Aliminar Todo");
	if(alu.Tamaño()>0){
		alu.EliminarTodo();
		Listado();
	}
	
	
	
	
	
	
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////
	////////////////////Vaciosss//////////////////////////////
	
	void Listado(){
       modelo.setRowCount(0);
		
		for(int i=0;i<alu.Tamaño();i++){
			Object Listado[]={
					alu.Obtener(i).getCodigo(),
					alu.Obtener(i).getNombre(),
					alu.Obtener(i).getNota1(),
					alu.Obtener(i).getNota2(),
					alu.Obtener(i).Promedio()

			};
			modelo.addRow(Listado);
		}
	}
	
	
	void Limpiar(){
		txtCodigo.setText("");
		txtNombre.setText("");
		txtNota1.setText("");
		txtNota2.setText("");
		txtCodigo.requestFocus();
	}
	
	
	void mensaje(String s){
		JOptionPane.showMessageDialog(null, s);
	}
	
	
	int leerCodigo(){
		return Integer.parseInt(txtCodigo.getText());
	}
	
	
	String leerNombre(){
		return txtNombre.getText().trim();
	}
	
	
	int leerNota1(){
		return Integer.parseInt(txtNota1.getText().trim());
	}
	
	
	int leerNota2(){
		return Integer.parseInt(txtNota2.getText().trim());
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////
	
}
