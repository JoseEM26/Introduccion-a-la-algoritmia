package guis;

import java.awt.BorderLayout;
import arreglos.ArregloProducto;
import Clases.Producto;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dlg_Productos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigoProducto;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtstockActual;
	private JTextField txtstockMinimo;
	private JTextField txtstockmax;
	private JButton btnIngreso;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnEliminacion;
	private JButton btnListado;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	
	ArregloProducto apro=new ArregloProducto();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dlg_Productos dialog = new Dlg_Productos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dlg_Productos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel_1 = new JLabel("codigoProducto");
			lblNewLabel_1.setBounds(10, 33, 62, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("nombre");
			lblNewLabel_2.setBounds(10, 58, 62, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("precio");
			lblNewLabel_3.setBounds(10, 83, 62, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("stockActual");
			lblNewLabel_4.setBounds(10, 108, 62, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("stockMinimo");
			lblNewLabel_5.setBounds(10, 133, 62, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			txtcodigoProducto = new JTextField();
			txtcodigoProducto.setBounds(82, 30, 86, 20);
			contentPanel.add(txtcodigoProducto);
			txtcodigoProducto.setColumns(10);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setColumns(10);
			txtNombre.setBounds(82, 55, 86, 20);
			contentPanel.add(txtNombre);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(82, 80, 86, 20);
			contentPanel.add(txtPrecio);
		}
		{
			txtstockActual = new JTextField();
			txtstockActual.setColumns(10);
			txtstockActual.setBounds(82, 105, 86, 20);
			contentPanel.add(txtstockActual);
		}
		{
			txtstockMinimo = new JTextField();
			txtstockMinimo.setColumns(10);
			txtstockMinimo.setBounds(82, 130, 86, 20);
			contentPanel.add(txtstockMinimo);
		}
		{
			btnIngreso = new JButton("Ingreso");
			btnIngreso.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnIngreso(e);
				}
			});
			btnIngreso.setBounds(335, 29, 89, 23);
			contentPanel.add(btnIngreso);
		}
		{
			btnModificacion = new JButton("Modificacion");
			btnModificacion.setBounds(335, 54, 89, 23);
			contentPanel.add(btnModificacion);
		}
		{
			btnConsulta = new JButton("Consulta");
			btnConsulta.setBounds(335, 79, 89, 23);
			contentPanel.add(btnConsulta);
		}
		{
			btnEliminacion = new JButton("Eliminacion");
			btnEliminacion.setBounds(335, 104, 89, 23);
			contentPanel.add(btnEliminacion);
		}
		{
			btnListado = new JButton("Listado");
			btnListado.setBounds(335, 129, 89, 23);
			contentPanel.add(btnListado);
		}
		{
			btnAgregar = new JButton("Agregar");
			btnAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnAgregar(e);
				}
			});
			btnAgregar.setBounds(178, 29, 89, 23);
			contentPanel.add(btnAgregar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setBounds(178, 54, 89, 23);
			contentPanel.add(btnModificar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(178, 79, 89, 23);
			contentPanel.add(btnEliminar);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("stockMaximo");
			lblNewLabel_5.setBounds(10, 155, 62, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			txtstockmax = new JTextField();
			txtstockmax.setColumns(10);
			txtstockmax.setBounds(82, 152, 86, 20);
			contentPanel.add(txtstockmax);
		}
		OcultarBotonesExtras();
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void DesactivarBotonesPrincipales() {
		btnIngreso.setEnabled(false);
		btnEliminacion.setEnabled(false);
		btnConsulta.setEnabled(false);
		btnListado.setEnabled(false);
		btnModificacion.setEnabled(false);
	}
	public void ActivarBotonesPrincipales() {
		btnIngreso.setEnabled(true);
		btnEliminacion.setEnabled(true);
		btnConsulta.setEnabled(true);
		btnListado.setEnabled(true);
		btnModificacion.setEnabled(true);
	}
	public void OcultarBotonesExtras() {
		btnAgregar.setVisible(false);
		btnModificar.setVisible(false);
		btnEliminar.setVisible(false);
	}
	public void Limpiar() {
		txtcodigoProducto.setText("");
		txtNombre.setText("");
		txtPrecio.setText("");
		txtstockActual.setText("");
		txtstockmax.setText("");
		txtstockMinimo.setText("");
	}
	public void DesactivarCampos() {
		txtcodigoProducto.setEditable(false);
		txtNombre.setEditable(false);
		txtPrecio.setEditable(false);
		txtstockActual.setEditable(false);
		txtstockmax.setEditable(false);
		txtstockMinimo.setEditable(false);
	}
	public void ActivarCampos() {
		txtcodigoProducto.setEditable(true);
		txtNombre.setEditable(true);
		txtPrecio.setEditable(true);
		txtstockActual.setEditable(true);
		txtstockmax.setEditable(true);
		txtstockMinimo.setEditable(true);
	}
    
    String LeerNombre() {
    	return txtNombre.getText();
    }
    double LeerPrecio() {
    	return Double.parseDouble(txtPrecio.getText());
    }
    int LeerStockActual() {
    	return Integer.parseInt(txtstockActual.getText());
    }
    int LeerStockMinimo() {
    	return Integer.parseInt(txtstockMinimo.getText());
    }
    int LeerStockMaximo() {

    	return Integer.parseInt(txtstockmax.getText());
    }
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	protected void actionPerformedBtnIngreso(ActionEvent e) {
		btnAgregar.setVisible(true);
		DesactivarBotonesPrincipales();
		btnIngreso.setEnabled(true);
		txtcodigoProducto.requestFocus();
		txtcodigoProducto.setEditable(false);
		txtcodigoProducto.setText(apro.CodigoCorrelativo()+"");
		
	}
	
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		apro.Adicionar(new Producto(apro.CodigoCorrelativo(), LeerNombre(), LeerPrecio(), LeerStockActual(), LeerStockMinimo()	, LeerStockMaximo()));
		Mensaje("Se Agrego Nuevo Producto Exitosamente!");
		Limpiar();
		txtcodigoProducto.setText(apro.CodigoCorrelativo()+"");
	}
}
