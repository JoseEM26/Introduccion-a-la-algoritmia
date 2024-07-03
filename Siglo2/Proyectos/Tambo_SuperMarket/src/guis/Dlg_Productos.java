package guis;

import java.awt.BorderLayout;
import arreglos.ArregloProducto;
import Clases.Producto;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
	private JButton btnExtraAgregar;
	private JButton btnExtraModificar;
	private JButton btnExtraEliminar;
	DefaultTableModel modelo=new DefaultTableModel();
	DefaultTableModel modelo2=new DefaultTableModel();
	ArregloProducto apro=new ArregloProducto();
     private JButton btnSalir;
	private JTable table;
	private JScrollPane scrollPaneTable;
	private JTable table_1;
	private JScrollPane scrollPaneTable2;
	private JButton btnConsulta_1;
	private JTextField txtDatoModificar;
	private JLabel lblDatoModicar;
	private JButton btnCambiar;
	

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
		setBounds(100, 100, 450, 329);
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
			btnModificacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnModificacion(e);
				}
			});
			btnModificacion.setBounds(335, 54, 89, 23);
			contentPanel.add(btnModificacion);
		}
		{
			btnConsulta = new JButton("Consulta");
			btnConsulta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnConsulta(e);
				}
			});
			btnConsulta.setBounds(335, 79, 89, 23);
			contentPanel.add(btnConsulta);
		}
		{
			btnEliminacion = new JButton("Eliminacion");
			btnEliminacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnEliminacion(e);
				}
			});
			btnEliminacion.setBounds(335, 104, 89, 23);
			contentPanel.add(btnEliminacion);
		}
		{
			btnListado = new JButton("Listado");
			btnListado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnListado(e);
				}
			});
			btnListado.setBounds(335, 129, 89, 23);
			contentPanel.add(btnListado);
		}
		{
			btnExtraAgregar = new JButton("Agregar");
			btnExtraAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnAgregar(e);
				}
			});
			btnExtraAgregar.setBounds(178, 4, 89, 23);
			contentPanel.add(btnExtraAgregar);
		}
		{
			btnExtraModificar = new JButton("Modificar");
			btnExtraModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnExtraModificar(e);
				}
			});
			btnExtraModificar.setBounds(252, 49, 89, 23);
			contentPanel.add(btnExtraModificar);
		}
		{
			btnExtraEliminar = new JButton("Eliminar");
			btnExtraEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnExtraEliminar(e);
				}
			});
			btnExtraEliminar.setBounds(178, 29, 89, 23);
			contentPanel.add(btnExtraEliminar);
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
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSalir(e);
			}
		});
		btnSalir.setBounds(178, 79, 89, 23);
		contentPanel.add(btnSalir);
		
		scrollPaneTable = new JScrollPane();
		scrollPaneTable.setBounds(10, 180, 414, 106);
		contentPanel.add(scrollPaneTable);
		
		table = new JTable();
		scrollPaneTable.setViewportView(table);
		////////////////////////////////////////
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Precio");
		modelo.addColumn("StockActual");
		modelo.addColumn("StockMinimo");
		modelo.addColumn("StockMaximo");
		table.setModel(modelo);
		{
			scrollPaneTable2 = new JScrollPane();
			scrollPaneTable2.setBounds(10, 180, 414, 106);
			contentPanel.add(scrollPaneTable2);
			{
				table_1 = new JTable();
				scrollPaneTable2.setViewportView(table_1);
                 ////////////////////////////////////////
                 modelo2.addColumn("Codigo");
                 modelo2.addColumn("Nombre");
                 modelo2.addColumn("Precio");
                 modelo2.addColumn("StockActual");
                 modelo2.addColumn("StockMinimo");
                 modelo2.addColumn("StockMaximo");
                 table_1.setModel(modelo2);
			}
		}
		
		btnConsulta_1 = new JButton("Consulta");
		btnConsulta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnConsulta_2(e);
			}
		});
		btnConsulta_1.setBounds(178, 124, 89, 23);
		contentPanel.add(btnConsulta_1);
		
		lblDatoModicar = new JLabel("Dato Modificar");
		lblDatoModicar.setBounds(10, 8, 86, 14);
		contentPanel.add(lblDatoModicar);
		
		txtDatoModificar = new JTextField();
		txtDatoModificar.setEditable(false);
		txtDatoModificar.setColumns(10);
		txtDatoModificar.setBounds(82, 5, 86, 20);
		contentPanel.add(txtDatoModificar);
		{
			btnCambiar = new JButton("Cambiar");
			btnCambiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnCambiar(e);
				}
			});
			btnCambiar.setBounds(252, 79, 89, 23);
			contentPanel.add(btnCambiar);
		}
		////////////////////////////////////////
		OcultarBotonesExtras();
		scrollPaneTable.setVisible(false);
		scrollPaneTable2.setVisible(false);
		DesactivarCampos();
		txtDatoModificar.setVisible(false);
		lblDatoModicar.setVisible(false);
	}
	

	protected void actionPerformedBtnIngreso(ActionEvent e) {
		ActivarCampos();
        scrollPaneTable.setVisible(true);
		btnSalir.setVisible(true);
		btnExtraAgregar.setVisible(true);
		DesactivarBotonesPrincipales();
		btnIngreso.setEnabled(true);
		txtcodigoProducto.requestFocus();
		txtcodigoProducto.setEditable(false);
		txtcodigoProducto.setText(apro.CodigoCorrelativo()+"");
		
		
	}
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		txtcodigoProducto.setText(apro.CodigoCorrelativo()+"");
		IngresoDatos();
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		ActivarBotonesPrincipales();
		OcultarBotonesExtras();
		txtcodigoProducto.setText("");
		txtcodigoProducto.setEditable(true);
		ActivarCampos();
        scrollPaneTable.setVisible(false);
        scrollPaneTable2.setVisible(false);
        DesactivarCampos();
        modelo2.setRowCount(0);
        modelo.setRowCount(0);

	}
	protected void actionPerformedBtnEliminacion(ActionEvent e) {
		DesactivarBotonesPrincipales();
		DesactivarCampos();
		txtcodigoProducto.setEditable(true);
		btnExtraEliminar.setEnabled(true);
		btnExtraEliminar.setVisible(true);
		btnEliminacion.setVisible(true);
		btnEliminacion.setEnabled(true);
		btnSalir.setVisible(true);
		
		
		
	}
	protected void actionPerformedBtnListado(ActionEvent e) {
        scrollPaneTable.setVisible(true);
	    Listado();
	    DesactivarBotonesPrincipales();
	    btnSalir.setVisible(true);
	}
	
	
	protected void actionPerformedBtnModificacion(ActionEvent e) {
		DesactivarBotonesPrincipales();
		btnModificacion.setEnabled(true);
		btnExtraModificar.setVisible(true);
		btnSalir.setVisible(true);
        txtDatoModificar.setEditable(true);
        lblDatoModicar.setVisible(true);
        txtDatoModificar.setVisible(true);
	}
	

	protected void actionPerformedBtnExtraModificar(ActionEvent e) {
		txtDatoModificar.setEditable(true);
		btnCambiar.setVisible(false);
		
		btnCambiar.setVisible(true);
		btnExtraModificar.setVisible(false);
		ActivarCampos();
		txtDatoModificar.setEditable(false);
		txtcodigoProducto.setEditable(false);
		txtcodigoProducto.setEditable(false);
		try {
			for(int i=0;i<apro.Tamano();i++) {
				if(LeerDatoCambiar()!=apro.Obtener(i).getCodigoProducto()) {
					Limpiar();
					txtcodigoProducto.requestFocus();
					DesactivarCampos();
					txtDatoModificar.setEditable(true);
					OcultarBotonesExtras();
					btnExtraModificar.setVisible(true);
				}
			}
			
			Mensaje("El dato no es Valido");
		} catch (Exception e2) {
			Limpiar();
			txtcodigoProducto.requestFocus();
			DesactivarCampos();
			txtDatoModificar.setEditable(true);
			OcultarBotonesExtras();
			btnExtraModificar.setVisible(true);
			Mensaje("No mande un Espacio Vacio");

		} 

	}
	protected void actionPerformedBtnCambiar(ActionEvent e) {
		
		try {
			for(int i=0;i<apro.Tamano();i++) {
				if(LeerDatoCambiar()==apro.Obtener(i).getCodigoProducto()){
					apro.Obtener(i).setNombre(LeerNombre());
					apro.Obtener(i).setPrecio(LeerPrecio());
					apro.Obtener(i).setStockActual(LeerStockActual());
					apro.Obtener(i).setStockMaximo(LeerStockMaximo());
					apro.Obtener(i).setStockMinimo(LeerStockMinimo());
							Mensaje("Se cambio Correctamente los Datos");
							Limpiar();
							scrollPaneTable.setVisible(true);
							Listado();
				}
			}
			
			
			
		} catch (Exception e2) {
			Mensaje("No se Encuentra El producto , usa otro codigo");
		}
		}
	
	
	
	////////////////////////////////////////////////////////
	
	
	protected void actionPerformedBtnConsulta(ActionEvent e) {
		btnConsulta_1.setVisible(true);
		txtcodigoProducto.setEditable(true);
		scrollPaneTable2.setVisible(true);
		btnSalir.setVisible(true);
		scrollPaneTable2.setVisible(true);
		

		
	}
	protected void actionPerformedBtnConsulta_2(ActionEvent e) {
	   
		try {
			int Codigo=LeerCodigo();
			
			for(int i=0;i<apro.Tamano();i++) {
				if(Codigo==apro.Obtener(i).getCodigoProducto()) {
					modelo2.setRowCount(0);
					Object[] fila2= {
							
							apro.Obtener(i).getCodigoProducto(),
							apro.Obtener(i).getNombre(),
							apro.Obtener(i).getPrecio(),
							apro.Obtener(i).getStockActual(),
							apro.Obtener(i).getStockMinimo(),
							apro.Obtener(i).getStockMaximo(),
					};
					modelo2.addRow(fila2);
				}
			}
			
			
		} catch (Exception e2) {
			Mensaje("Dato ingresado no es reconocido en la base de datos");
		}
	}
	protected void actionPerformedBtnExtraEliminar(ActionEvent e) {
		try {
			int codigo=(Integer.parseInt(txtcodigoProducto.getText()))-2001;
		    apro.EliminarProducto(codigo);
		    Mensaje("Se Elimino Correctamente");
		    Limpiar();
		    Listado();
		} catch (Exception e2) {
			Mensaje("El codigo Que acaba de Brindar no es valido");
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
public void IngresoDatos() {
	try {
		String nombre=LeerNombre();
		if(nombre.length()>0) {
		try {
			double Precio=LeerPrecio();
			
				try {
					int StockActual=LeerStockActual();
						try {
							int StockMinimo=LeerStockMinimo();
								try {
									int StockMaximo=LeerStockMaximo();
									
										
										apro.Adicionar(new Producto(apro.CodigoCorrelativo(), nombre, Precio, StockActual, StockMinimo, StockMaximo));
										Listado();
										Limpiar();
										Mensaje("Ha Ingresado Correctamente un Nuevo Producto");
										
									
								} catch (Exception e) {
									Mensaje("No puede mandar un campo vacio StockMaximo");
									txtstockmax.setText("");
									txtstockmax.requestFocus();
								}
							
						} catch (Exception e) {
							Mensaje("No puede mandar un campo vacio StockMinimo");
							txtstockMinimo.setText("");
							txtstockMinimo.requestFocus();
						}
					
				} catch (Exception e) {
					Mensaje("No puede mandar un campo vacio StockActual");
					txtstockActual.setText("");
					txtstockActual.requestFocus();
					}
			
		} catch (Exception e) {
			Mensaje("No puede mandar un campo vacioPrecio");
			txtPrecio.setText("");
			txtPrecio.requestFocus();
		}
		}else {
			Mensaje("Ingrese un dato");
			txtNombre.setText("");
			txtNombre.requestFocus();
		}
	} catch (Exception e) {
		Mensaje("No puede mandar un campo vacio Nombre");
		txtcodigoProducto.setText("");
		txtcodigoProducto.requestFocus();
	}
}
public void Listado() {
modelo.setRowCount(0);
for(int i=0;i<apro.Tamano();i++) {
Object fila[]= {
apro.Obtener(i).getCodigoProducto(),
apro.Obtener(i).getNombre(),
apro.Obtener(i).getPrecio(),
apro.Obtener(i).getStockActual(),
apro.Obtener(i).getStockMinimo(),
apro.Obtener(i).getStockMaximo(),
};
modelo.addRow(fila);
}
}
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
btnExtraAgregar.setVisible(false);
btnExtraModificar.setVisible(false);
btnExtraEliminar.setVisible(false);
btnSalir.setVisible(false);
btnConsulta_1.setVisible(false);
btnCambiar.setVisible(false);


}
public void Limpiar() {
txtcodigoProducto.setText("");
txtNombre.setText("");
txtPrecio.setText("");
txtstockActual.setText("");
txtstockmax.setText("");
txtstockMinimo.setText("");
txtDatoModificar.setText("");
}
public void DesactivarCampos() {
txtcodigoProducto.setEditable(false);
txtNombre.setEditable(false);
txtPrecio.setEditable(false);
txtstockActual.setEditable(false);
txtstockmax.setEditable(false);
txtstockMinimo.setEditable(false);
txtDatoModificar.setEditable(false);
}
public void ActivarCampos() {
txtcodigoProducto.setEditable(true);
txtNombre.setEditable(true);
txtPrecio.setEditable(true);
txtstockActual.setEditable(true);
txtstockmax.setEditable(true);
txtstockMinimo.setEditable(true);
txtDatoModificar.setEditable(true);
txtDatoModificar.setEditable(true);

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
 int LeerCodigo() {
	return Integer.parseInt(txtcodigoProducto.getText());
}
 int LeerDatoCambiar() {
	 return Integer.parseInt(txtDatoModificar.getText());
 }
	
	
}
