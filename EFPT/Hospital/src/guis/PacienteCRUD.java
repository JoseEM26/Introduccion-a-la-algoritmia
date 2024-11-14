package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Date;
import java.awt.event.ActionEvent;
import guis.*;
import clases.*;

public class PacienteCRUD extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField txtDNI;
	private JTextField txtApellido;
	private JTextField txtEnfermedad;
	private JButton btnCrearPaciente;
	private JButton btnActualizarTabla;
	DefaultTableModel model= new DefaultTableModel();
	Paciente paciente= new Paciente();
	private JButton btnSeleccionaPaciente;
	private JButton btnActualizarPaciente;
	private JTextField txtNombre;
	private JButton btnELiminarPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TratamientoCRUD dialog = new TratamientoCRUD();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PacienteCRUD() {
		setBounds(100, 100, 591, 569);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 224, 555, 306);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		///////////
		
		///////////
		
		JLabel lblNewLabel = new JLabel("Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 12, 208, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DNI ");
		lblNewLabel_1.setBounds(10, 51, 102, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setBounds(10, 74, 102, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(108, 48, 175, 19);
		getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1_1.setBounds(10, 105, 102, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(108, 102, 175, 19);
		getContentPane().add(txtApellido);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Enfermedad");
		lblNewLabel_1_1_1_1.setBounds(10, 128, 102, 13);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		txtEnfermedad = new JTextField();
		txtEnfermedad.setColumns(10);
		txtEnfermedad.setBounds(108, 128, 175, 19);
		getContentPane().add(txtEnfermedad);
		
		btnCrearPaciente = new JButton("Crear Nueva Cita");
		btnCrearPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCrearCitaJButton(e);
			}
		});
		btnCrearPaciente.setBounds(300, 43, 133, 21);
		getContentPane().add(btnCrearPaciente);
		
		btnELiminarPaciente = new JButton("Eliminar Cita");
		btnELiminarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnELiminarCitaJButton(e);
			}
		});
		btnELiminarPaciente.setBounds(309, 124, 276, 21);
		getContentPane().add(btnELiminarPaciente);
		
		btnActualizarTabla = new JButton("Actualizar Tabla");
		btnActualizarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnActualizarTablaJButton(e);
			}
		});
		btnActualizarTabla.setBounds(432, 203, 133, 21);
		getContentPane().add(btnActualizarTabla);
		paciente.MostrarRegistroTabla(table);
		
		btnSeleccionaPaciente = new JButton("Seleccionar");
		btnSeleccionaPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSeleccionarMedicamenJButton(e);
			}
		});
		btnSeleccionaPaciente.setBounds(309, 97, 276, 21);
		getContentPane().add(btnSeleccionaPaciente);
		
		btnActualizarPaciente = new JButton("Actualizar Cita");
		btnActualizarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnActualizarCitaJButton(e);
			}
		});
		btnActualizarPaciente.setBounds(443, 43, 133, 21);
		getContentPane().add(btnActualizarPaciente);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(111, 70, 175, 19);
		getContentPane().add(txtNombre);
	}
	
	////////////////////////////////////////////////////////
	protected void actionPerformedBtnCrearCitaJButton(ActionEvent e) {
		Paciente s=new Paciente(LeerDNI(),LeerNombre(),LeerApellido(),LeerEnfermedad());
	    CrearRegistroPaciente(
	    		s.getDNI(),
	    		s.getNombre(),
	    		s.getApellido(), 
	    		s.getEmfermedad());
	}
	protected void actionPerformedBtnActualizarTablaJButton(ActionEvent e) {
		paciente.MostrarRegistroTabla(table);
	    txtDNI.setText("");
		txtEnfermedad.setText("");	    
		txtNombre.setText("");
		txtApellido.setText("");
	}
	protected void actionPerformedBtnELiminarCitaJButton(ActionEvent e) {
		paciente.EliminarRegistrotabla(table, txtDNI);
	    txtDNI.setText("");
		txtEnfermedad.setText("");	        txtNombre.setText("");

		txtApellido.setText("");
	}
	protected void actionPerformedBtnSeleccionarMedicamenJButton(ActionEvent e) {
		txtDNI.setText(String.valueOf(paciente.getDNI()));
		txtApellido.setText(paciente.getApellido());
		txtEnfermedad.setText(String.valueOf(paciente.getEmfermedad()));
		txtNombre.setText(String.valueOf(paciente.getNombre()));
		paciente.Seleccionar(table);
		
		
	}  
	protected void actionPerformedBtnActualizarCitaJButton(ActionEvent e) {
		
		paciente.EditarCita(table);
	}
	/////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////

	
	public int LeerDNI() {
		return Integer.parseInt(txtDNI.getText());	}
	
	public String LeerNombre() {
		return txtNombre.getText();
	}
	public String LeerApellido() {
		return txtApellido.getText();	}
	
	public String LeerEnfermedad() {
		return txtEnfermedad.getText();}
	
	
	
	public void CrearRegistroPaciente(int id ,String nombre,String apellido,String enfermedad) {
	    try (FileWriter f = new FileWriter("Paciente.txt", true)) { // true para agregar
	        f.write(id + "," + nombre + "," + apellido + "," + enfermedad + "\n");
	        System.out.println("Se registró correctamente");
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
	    }
	}
}