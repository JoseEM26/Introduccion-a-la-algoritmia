package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.ArregloCliente;
import clases.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgCliente extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textCodigo;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDni;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JButton btnIngreso;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnEliminacion;
	private JButton btnListado;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnBuscar;
	//variables globales
	ArregloCliente ac=new ArregloCliente();
	String nombres, apellidos, direccion, dni, telefono;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCliente dialog = new DlgCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCliente() {
		setTitle("Cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("MANTENIMIENTO CLIENTE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Código:");
		lblNewLabel_1.setBounds(10, 36, 62, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setBounds(10, 61, 62, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Apellidos:");
		lblNewLabel_3.setBounds(10, 84, 62, 14);
		contentPanel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Dirección:");
		lblNewLabel_4.setBounds(10, 109, 62, 14);
		contentPanel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("DNI:");
		lblNewLabel_5.setBounds(10, 132, 62, 14);
		contentPanel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Teléfono:");
		lblNewLabel_6.setBounds(10, 157, 62, 14);
		contentPanel.add(lblNewLabel_6);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(82, 33, 86, 20);
		contentPanel.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNombres = new JTextField();
		textNombres.setBounds(82, 58, 86, 20);
		contentPanel.add(textNombres);
		textNombres.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(82, 81, 86, 20);
		contentPanel.add(textApellidos);
		textApellidos.setColumns(10);
		
		textDni = new JTextField();
		textDni.setBounds(82, 106, 86, 20);
		contentPanel.add(textDni);
		textDni.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(82, 129, 86, 20);
		contentPanel.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(82, 154, 86, 20);
		contentPanel.add(textTelefono);
		textTelefono.setColumns(10);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.addActionListener(this);
		btnIngreso.setBounds(309, 32, 115, 23);
		contentPanel.add(btnIngreso);
		
		btnModificacion = new JButton("Modificacion");
		btnModificacion.setBounds(309, 57, 115, 23);
		contentPanel.add(btnModificacion);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(this);
		btnConsulta.setBounds(309, 80, 115, 23);
		contentPanel.add(btnConsulta);
		
		btnEliminacion = new JButton("Eliminacion");
		btnEliminacion.setBounds(309, 105, 115, 23);
		contentPanel.add(btnEliminacion);
		
		btnListado = new JButton("Listado");
		btnListado.setBounds(309, 128, 115, 23);
		contentPanel.add(btnListado);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(177, 32, 89, 23);
		contentPanel.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(178, 57, 89, 23);
		contentPanel.add(btnModificar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(178, 80, 89, 23);
		contentPanel.add(btnBuscar);
		
		desactivarCampos();
		ocultarExtras();
	}
	
	//metodos complementarios
	public void limpiar() {
		textNombres.setText("");
		textApellidos.setText("");
		textDireccion.setText("");
		textDni.setText("");
		textTelefono.setText("");
	}
	public void desactivarCampos() {
		textCodigo.setEditable(false);
		textNombres.setEditable(false);
		textApellidos.setEditable(false);
		textDireccion.setEditable(false);
		textDni.setEditable(false);
		textTelefono.setEditable(false);
	}
	public void activarCampos() {
		textCodigo.setEditable(true);
		textNombres.setEditable(true);
		textApellidos.setEditable(true);
		textDireccion.setEditable(true);
		textDni.setEditable(true);
		textTelefono.setEditable(true);
	}
	public void ocultarExtras() {
		btnAgregar.setVisible(false);
		btnBuscar.setVisible(false);
		btnModificar.setVisible(false);
	}
	public void mostrarPrincipales() {
		btnIngreso.setEnabled(true);
		btnModificacion.setEnabled(true);
		btnConsulta.setEnabled(true);
		btnEliminacion.setEnabled(true);
		btnListado.setEnabled(true);
	}
	
	//METODOS PRINCIPALES
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
		if (e.getSource() == btnConsulta) {
			actionPerformedBtnConsulta(e);
		}
		if (e.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(e);
		}
		if (e.getSource() == btnIngreso) {
			actionPerformedBtnIngreso(e);
		}
	}
	protected void actionPerformedBtnIngreso(ActionEvent e) {
		limpiar();
		activarCampos();
		mostrarPrincipales();
		textCodigo.setEditable(false);
		btnIngreso.setEnabled(false);
		btnAgregar.setVisible(true);
		textCodigo.setText(ac.codigoCorrelativo()+"");
	}
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		
		nombres=textNombres.getText();
		apellidos=textApellidos.getText();
		direccion=textDireccion.getText();
		dni=textDni.getText();
		telefono=textTelefono.getText();
		
		ac.adicionar(new Cliente(ac.codigoCorrelativo(),nombres,apellidos,direccion,dni,telefono));
		
		limpiar();
		int input2=JOptionPane.showConfirmDialog(this, "Cliente agregado","Confirmación", JOptionPane.DEFAULT_OPTION);
		textCodigo.setText(ac.codigoCorrelativo()+"");
	}
	protected void actionPerformedBtnConsulta(ActionEvent e) {
	
		limpiar();
		desactivarCampos();
		ocultarExtras();
		mostrarPrincipales();
		textCodigo.setEditable(true);
		btnConsulta.setEnabled(false);
		btnBuscar.setVisible(true);
	}
	
	
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		int pos=Integer.parseInt(textCodigo.getText())-1001;
		textNombres.setText(ac.obtener(pos).getNombres());
		textApellidos.setText(ac.obtener(pos).getApellidos());
		textDireccion.setText(ac.obtener(pos).getDireccion());
		textDni.setText(ac.obtener(pos).getDni());
		textTelefono.setText(ac.obtener(pos).getTelefono());
	}
}
