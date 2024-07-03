package Guis;

import java.awt.BorderLayout;
import java.awt.Component;

import Arreglos.ArregloCliente;
import Clases.Cliente;
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
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Dlg_Clientes extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigoCliente;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtDni;
	private JTextField txtTelefono;
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
	ArregloCliente ac =new ArregloCliente();
     private JButton btnSalir;
	private JTable table;
	private JScrollPane scrollPaneTable;
	private JTable table_1;
	private JScrollPane scrollPaneTable2;
	private JButton btnBuscar;
	private JLabel lblModificar;
	private JButton btnCambiar;
	private JTextField txtDatoCambiar;
	
	//LANZAR APLICACIÓN:
	
	public static void main(String[] args) {
		try {
			Dlg_Clientes dialog = new Dlg_Clientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ELEMENTOS DEL GUI:
	
	public Dlg_Clientes() {
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigoProducto = new JLabel("Código      :");
			lblCodigoProducto.setBounds(10, 40, 62, 14);
			contentPanel.add(lblCodigoProducto);
		}
		{
			JLabel lblNombres = new JLabel("Nombres   :");
			lblNombres.setBounds(10, 65, 62, 14);
			contentPanel.add(lblNombres);
		}
		{
			JLabel lblApellidos = new JLabel("Apellidos   :");
			lblApellidos.setBounds(10, 90, 62, 14);
			contentPanel.add(lblApellidos);
		}
		{
			JLabel lblDireccion = new JLabel("Dirección   :");
			lblDireccion.setBounds(10, 115, 62, 14);
			contentPanel.add(lblDireccion);
		}
		{
			JLabel lblDni = new JLabel("DNI           :");
			lblDni.setBounds(10, 140, 62, 14);
			contentPanel.add(lblDni);
		}
		{
			JLabel lblTelefono = new JLabel("Teléfono   :");
			lblTelefono.setBounds(10, 165, 62, 14);
			contentPanel.add(lblTelefono);
		}
		{
			JLabel lblClientes = new JLabel("CLIENTES");
			lblClientes.setFont(new Font("Times New Roman", Font.BOLD, 30));
			lblClientes.setBounds(10, 0, 175, 42);
			contentPanel.add(lblClientes);
		}
		{
			lblModificar = new JLabel("Modificar:");
			lblModificar.setFont(new Font("Times New Roman", Font.ITALIC, 12));
			lblModificar.setBounds(227, 20, 56, 14);
			contentPanel.add(lblModificar);
		}
		{
			txtDatoCambiar = new JTextField();
			txtDatoCambiar.setBounds(231, 37, 39, 20);
			contentPanel.add(txtDatoCambiar);
			txtDatoCambiar.setColumns(10);
		}
		{
			txtCodigoCliente = new JTextField();
			txtCodigoCliente.setBounds(82, 38, 138, 20);
			contentPanel.add(txtCodigoCliente);
			txtCodigoCliente.setColumns(10);
		}
		{
			txtNombres = new JTextField();
			txtNombres.setColumns(10);
			txtNombres.setBounds(82, 61, 138, 20);
			contentPanel.add(txtNombres);
		}
		{
			txtApellidos = new JTextField();
			txtApellidos.setColumns(10);
			txtApellidos.setBounds(82, 86, 138, 20);
			contentPanel.add(txtApellidos);
		}
		{
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(82, 111, 138, 20);
			contentPanel.add(txtDireccion);
		}
		{
			txtDni = new JTextField();
			txtDni.setColumns(10);
			txtDni.setBounds(82, 136, 138, 20);
			contentPanel.add(txtDni);
		}
		{
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(82, 162, 138, 20);
			contentPanel.add(txtTelefono);
		}
		{
			scrollPaneTable = new JScrollPane();
			scrollPaneTable.setBounds(10, 193, 664, 257);
			contentPanel.add(scrollPaneTable);
			{
				table = new JTable();
				scrollPaneTable.setViewportView(table);
				modelo.addColumn("Código");
				modelo.addColumn("Nombres");
				modelo.addColumn("Apellidos");
				modelo.addColumn("Dirección");
				modelo.addColumn("DNI");
				modelo.addColumn("Teléfono");
				table.setModel(modelo);
			}
		}
		{
			scrollPaneTable2 = new JScrollPane();
			scrollPaneTable2.setBounds(10, 193, 664, 257);
			contentPanel.add(scrollPaneTable2);
			{
				table_1 = new JTable();
				scrollPaneTable2.setViewportView(table_1);
                modelo2.addColumn("Codigo");
                modelo2.addColumn("Nombre");
                modelo2.addColumn("Precio");
                modelo2.addColumn("StockActual");
                modelo2.addColumn("StockMinimo");
                modelo2.addColumn("StockMaximo");
                table_1.setModel(modelo2);
			}
		}
		
		//BOTONES:
		
		{
			btnIngreso = new JButton("Ingreso");
			btnIngreso.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnIngreso(e);
				}
			});
			btnIngreso.setBounds(565, 24, 109, 23);
			contentPanel.add(btnIngreso);
		}
		{
			btnModificacion = new JButton("Modificacion");
			btnModificacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnModificacion(e);
				}
			});
			btnModificacion.setBounds(565, 54, 109, 23);
			contentPanel.add(btnModificacion);
		}
		{
			btnConsulta = new JButton("Consulta");
			btnConsulta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnConsulta(e);
				}
			});
			btnConsulta.setBounds(565, 131, 109, 23);
			contentPanel.add(btnConsulta);
		}
		{
			btnEliminacion = new JButton("Eliminacion");
			btnEliminacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnEliminacion(e);
				}
			});
			btnEliminacion.setBounds(565, 159, 109, 23);
			contentPanel.add(btnEliminacion);
		}
		{
			btnListado = new JButton("Listado");
			btnListado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnListado(e);
				}
			});
			btnListado.setBounds(409, 56, 109, 23);
			contentPanel.add(btnListado);
		}
		{
			btnExtraAgregar = new JButton("Agregar");
			btnExtraAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnAgregar(e);
				}
			});
			btnExtraAgregar.setBounds(277, 56, 89, 23);
			contentPanel.add(btnExtraAgregar);
		}
		{
			btnExtraModificar = new JButton("Modificar");
			btnExtraModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnExtraModificar(e);
				}
			});
			btnExtraModificar.setBounds(409, 86, 109, 23);
			contentPanel.add(btnExtraModificar);
		}
		{
			btnExtraEliminar = new JButton("Eliminar");
			btnExtraEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnExtraEliminar(e);
				}
			});
			btnExtraEliminar.setBounds(277, 86, 89, 23);
			contentPanel.add(btnExtraEliminar);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnSalir(e);
				}
			});
			btnSalir.setBounds(277, 161, 89, 23);
			contentPanel.add(btnSalir);
		}	
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnBuscar(e);
				}
			});
			btnBuscar.setBounds(277, 115, 89, 23);
			contentPanel.add(btnBuscar);
		}
		{
			btnCambiar = new JButton("Cambiar");
			btnCambiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnCambiar(e);
				}
			});
			btnCambiar.setBounds(409, 131, 109, 23);
			contentPanel.add(btnCambiar);
		}
		OcultarBotonesExtras();
		scrollPaneTable.setVisible(false);
		scrollPaneTable2.setVisible(false);
		DesactivarCampos();
		txtDatoCambiar.setVisible(false);
		lblModificar.setVisible(false);	
		}
	
	
	
	//METODOS ESTÉTICA
	
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
		btnBuscar.setVisible(false);
		btnCambiar.setVisible(false);
	}
	public void Limpiar() {
		txtCodigoCliente.setText("");
		txtNombres.setText("");
		txtApellidos.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtDni.setText("");
	}
	public void DesactivarCampos() {
		txtCodigoCliente.setEditable(false);
		txtNombres.setEditable(false);
		txtApellidos.setEditable(false);
		txtDireccion.setEditable(false);
		txtTelefono.setEditable(false);
		txtDni.setEditable(false);
	}
	public void ActivarCampos() {
		txtCodigoCliente.setEditable(true);
		txtNombres.setEditable(true);
		txtApellidos.setEditable(true);
		txtDireccion.setEditable(true);
		txtTelefono.setEditable(true);
		txtDni.setEditable(true);
	}
	
	//METODO COMPLEMENTARIO
	
	public void Listado() {
		modelo.setRowCount(0);
		for(int i=0;i<ac.tamano();i++) {
		Object fila[]= {
		ac.obtener(i).getCodigoCliente(),
		ac.obtener(i).getNombres(),
		ac.obtener(i).getApellidos(),
		ac.obtener(i).getDireccion(),
		ac.obtener(i).getDni(),
		ac.obtener(i).getTelefono(),
		};
		modelo.addRow(fila);
		}
	}
	
	int LeerDatoCambiar() {
		return Integer.parseInt(txtDatoCambiar.getText().trim());
	}
	String LeerNombres() {
		return txtNombres.getText().trim();
		}
	String LeerApellidos() {
		return txtApellidos.getText().trim();
		}
	String LeerDireccion() {
		return txtDireccion.getText().trim();
		}
	String LeerDni() {
		return txtDni.getText().trim();
		}
	String LeerTelefono() {
		return txtTelefono.getText().trim();
		}
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(null, s);
		}
	int LeerCodigo() {
		return Integer.parseInt(txtCodigoCliente.getText().trim());
		}
	
	public void IngresoDatos() {
	    try {
	        String nombres = LeerNombres();
	        if (nombres.length() > 0) {
	            try {
	                String apellidos = LeerApellidos();
	                if (apellidos.length() > 0) {
	                    try {
	                        String direccion = LeerDireccion();
	                        if (direccion.length() > 0) {
	                            try {
	                                String dni = LeerDni();
	                                if (dni.length() > 0) {
	                                    try {
	                                        String telefono = LeerTelefono();
	                                        if (telefono.length() > 0) {
	                                            ac.adicionar(new Cliente(ac.codigoCorrelativo(), nombres, apellidos, direccion, dni, telefono));
	                                            Listado();
	                                            Limpiar();
	                                            Mensaje("Ha ingresado correctamente un nuevo cliente");
	                                        } else {
	                                            Mensaje("Ingrese el teléfono");
	                                            txtTelefono.setText("");
	                                            txtTelefono.requestFocus();
	                                        }
	                                    } catch (Exception e) {
	                                        Mensaje("Error al leer el teléfono");
	                                        txtTelefono.setText("");
	                                        txtTelefono.requestFocus();
	                                    }
	                                } else {
	                                    Mensaje("Ingrese el DNI");
	                                    txtDni.setText("");
	                                    txtDni.requestFocus();
	                                }
	                            } catch (Exception e) {
	                                Mensaje("Error al leer el DNI");
	                                txtDni.setText("");
	                                txtDni.requestFocus();
	                            }
	                        } else {
	                            Mensaje("Ingrese la dirección");
	                            txtDireccion.setText("");
	                            txtDireccion.requestFocus();
	                        }
	                    } catch (Exception e) {
	                        Mensaje("Error al leer la dirección");
	                        txtDireccion.setText("");
	                        txtDireccion.requestFocus();
	                    }
	                } else {
	                    Mensaje("Ingrese los apellidos");
	                    txtApellidos.setText("");
	                    txtApellidos.requestFocus();
	                }
	            } catch (Exception e) {
	                Mensaje("Error al leer los apellidos");
	                txtApellidos.setText("");
	                txtApellidos.requestFocus();
	            }
	        } else {
	            Mensaje("Ingrese los nombres");
	            txtNombres.setText("");
	            txtNombres.requestFocus();
	        }
	    } catch (Exception e) {
	        Mensaje("Error al leer los nombres");
	        txtNombres.setText("");
	        txtNombres.requestFocus();
	    }
	}

	//METODOS PRINCIPALES

	protected void actionPerformedBtnIngreso(ActionEvent e) {
		ActivarCampos();
		scrollPaneTable.setVisible(true);
		btnSalir.setVisible(true);
		btnExtraAgregar.setVisible(true);
		DesactivarBotonesPrincipales();
		btnIngreso.setEnabled(true);
		txtCodigoCliente.requestFocus();
		txtCodigoCliente.setEditable(false);
		txtCodigoCliente.setText(ac.codigoCorrelativo()+"");
	}
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		txtCodigoCliente.setText(ac.codigoCorrelativo()+"");
		IngresoDatos();
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		ActivarBotonesPrincipales();
		OcultarBotonesExtras();
		txtCodigoCliente.setText("");
		txtCodigoCliente.setEditable(true);
		ActivarCampos();
        scrollPaneTable.setVisible(false);
        scrollPaneTable2.setVisible(false);
        DesactivarCampos();
        modelo2.setRowCount(0);
        modelo.setRowCount(0);
        lblModificar.setVisible(false);
        txtDatoCambiar.setVisible(false);
        Limpiar();
	}
	protected void actionPerformedBtnEliminacion(ActionEvent e) {
		DesactivarBotonesPrincipales();
		DesactivarCampos();
		txtCodigoCliente.setEditable(true);
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
        txtDatoCambiar.setEditable(true);
        lblModificar.setVisible(true);
        txtDatoCambiar.setVisible(true);
	}
	protected void actionPerformedBtnExtraModificar(ActionEvent e) {
		btnCambiar.setVisible(false);
		btnCambiar.setVisible(true);
		btnExtraModificar.setVisible(false);
		ActivarCampos();
		txtCodigoCliente.setEditable(false);
		try {
			for(int i=0;i<ac.tamano();i++) {
				if(LeerDatoCambiar()!=ac.obtener(i).getCodigoCliente()) {
					Limpiar();
					txtCodigoCliente.requestFocus();
					DesactivarCampos();
					OcultarBotonesExtras();
					btnExtraModificar.setVisible(true);
				}
			}
			Mensaje("escriba nuevamente los datos");
		} catch (Exception e2) {
			Limpiar();
			txtCodigoCliente.requestFocus();
			DesactivarCampos();
			OcultarBotonesExtras();
			btnExtraModificar.setVisible(true);
			Mensaje("No mande un Espacio Vacio");
		} 
	}
	protected void actionPerformedBtnCambiar(ActionEvent e) {
		try {
			for(int i=0;i<ac.tamano();i++) {
				if(LeerDatoCambiar()==ac.obtener(i).getCodigoCliente()){
					ac.obtener(i).setNombres(LeerNombres());
					ac.obtener(i).setApellidos(LeerApellidos());
					ac.obtener(i).setDireccion(LeerDireccion());
					ac.obtener(i).setDni(LeerDni());
					ac.obtener(i).setTelefono(LeerTelefono());
					Mensaje("Se cambio Correctamente los Datos");
					Limpiar();
					scrollPaneTable.setVisible(true);
					Listado();
				}
			}	
		}catch (Exception e2) {
			Mensaje("No se Encuentra El producto , usa otro codigo");
			}
		}
	protected void actionPerformedBtnConsulta(ActionEvent e) {
		btnBuscar.setVisible(true);
		txtCodigoCliente.setEditable(true);
		scrollPaneTable2.setVisible(true);
		btnSalir.setVisible(true);
		scrollPaneTable2.setVisible(true);
	}
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		try {
			int Codigo=LeerCodigo();
			for(int i=0;i<ac.tamano();i++) {
				if(Codigo==ac.obtener(i).getCodigoCliente()) {
					modelo2.setRowCount(0);
					Object[] fila2= {
							ac.obtener(i).getCodigoCliente(),
							ac.obtener(i).getNombres(),
							ac.obtener(i).getApellidos(),
							ac.obtener(i).getDireccion(),
							ac.obtener(i).getDni(),
							ac.obtener(i).getTelefono(),
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
			int codigo=(Integer.parseInt(txtCodigoCliente.getText()))-1001;
		    ac.eliminarCliente(codigo);
		    Mensaje("Se Elimino Correctamente");
		    Limpiar();
		    Listado();
		} catch (Exception e2) {
			Mensaje("El codigo Que acaba de Brindar no es valido");
			}
		}	
}