package guis;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.NamedNodeMap;

import arreglos.ArregloCliente;
import clases.*;

public class Consulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTable table;
	ArregloCliente al=new ArregloCliente();
	DefaultTableModel modelo=new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(335, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(90, 12, 235, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingresa Codigo");
		lblNewLabel.setBounds(10, 15, 86, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 205);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		///////////////////////////////////
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Direcion");
		modelo.addColumn("Telefono");
		modelo.addColumn("DNI");
		table.setModel(modelo);
		///////////////////////////////////
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValidarCodigo();
				
				
			}
		});
		}
	void Mostrar() {
		
	}
	int ValidarCodigo() {
		int codigo=LeerCodigo();
		
		for(int i=0;i<al.Tamaño();i++) {
			if	(al.Obtener(i).getCodigoCliente()==codigo) {
				modelo.setRowCount(0);
				Object Lista[]= {
						al.Obtener(i).getCodigoCliente(),
						al.Obtener(i).getNombres(),	
						al.Obtener(i).getApellido(),	
						al.Obtener(i).getDireccion(),	
						al.Obtener(i).getTelefono(),	
						al.Obtener(i).getDni(),	
				};
				modelo.addRow(Lista);
			}if(al.Obtener(i).getCodigoCliente()!=codigo )  {
					Mensaje("No existe Este Codigo ,Intenta De Nuevo");
			}
		}
	     return codigo;
	}
	
	int LeerCodigo() {
        if (txtCodigo == null || txtCodigo.getText().isEmpty()) {
            Mensaje("Por favor ingresa un código válido.");
            return -1;
            
        } else {
            try {
                return Integer.parseInt(txtCodigo.getText());
            } catch (NumberFormatException e) {
                Mensaje("El dato ingresado No es un numero");
                return -1; 
            }
        }
    }
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
}
