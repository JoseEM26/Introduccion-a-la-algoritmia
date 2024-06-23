package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import org.graalvm.compiler.nodes.extended.MonitorEnter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import arreglos.ArregloProducto;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Dlg_Ventas extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtComprarCantidad;
	private JTextField txtConsultarCodigo;
	private JTextField txtConsultarPrecio;
	private JTextField txtConsultarStockMinimo;
	private JTextField txtConsultarStockMaximo;
	private JTextField txtComprarCodigo;
	ArregloProducto pro=new ArregloProducto();
	DefaultTableModel modelo=new DefaultTableModel();
	private JTextField txtConsultarNombrePro;
	private JTextField txtConsultarNombreProductito;
	private JTable table;
	private JButton btnConsultarCerrar;
	private JButton btnConsultar11;
	private JLabel lblCodigoProducto;
	private JLabel lblNombre;
	private JLabel lblPrecio;
	private JLabel lblCodigoVenta;
	private JLabel lblCodigoVenta_1;
	private JButton btnConsultardatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dlg_Ventas dialog = new Dlg_Ventas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dlg_Ventas() {
		setTitle("Ventas");
		setBounds(100, 100, 576, 251);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(316, 40, 65, 14);
		contentPanel.add(lblNewLabel);
		
		txtComprarCantidad = new JTextField();
		txtComprarCantidad.setBounds(365, 37, 86, 20);
		contentPanel.add(txtComprarCantidad);
		txtComprarCantidad.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 158, 540, 47);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		//////////////////////////////////
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Monto");
		modelo.addColumn("IGV");
		modelo.addColumn("StockActual");
		table.setModel(modelo);
		///////////////////////////////////
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setBounds(461, 11, 89, 23);
		contentPanel.add(btnNewButton);
		
		txtConsultarCodigo = new JTextField();
		txtConsultarCodigo.setColumns(10);
		txtConsultarCodigo.setBounds(107, 12, 86, 20);
		contentPanel.add(txtConsultarCodigo);
		
		txtConsultarPrecio = new JTextField();
		txtConsultarPrecio.setColumns(10);
		txtConsultarPrecio.setBounds(107, 96, 86, 20);
		contentPanel.add(txtConsultarPrecio);
		
		txtConsultarStockMinimo = new JTextField();
		txtConsultarStockMinimo.setColumns(10);
		txtConsultarStockMinimo.setBounds(107, 65, 86, 20);
		contentPanel.add(txtConsultarStockMinimo);
		
		txtConsultarStockMaximo = new JTextField();
		txtConsultarStockMaximo.setColumns(10);
		txtConsultarStockMaximo.setBounds(107, 127, 86, 20);
		contentPanel.add(txtConsultarStockMaximo);
		
		lblCodigoProducto = new JLabel("Codigo Producto");
		lblCodigoProducto.setBounds(25, 15, 101, 14);
		contentPanel.add(lblCodigoProducto);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(25, 68, 101, 14);
		contentPanel.add(lblPrecio);
		
		lblCodigoVenta = new JLabel("SctockMinimo");
		lblCodigoVenta.setBounds(25, 99, 101, 14);
		contentPanel.add(lblCodigoVenta);
		
		lblCodigoVenta_1 = new JLabel("StockMaximo");
		lblCodigoVenta_1.setBounds(25, 127, 101, 14);
		contentPanel.add(lblCodigoVenta_1);
		
		btnConsultar11 = new JButton("Consultar");
		btnConsultar11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnConsultar(e);
			}
		});
		btnConsultar11.setBounds(203, 11, 89, 23);
		contentPanel.add(btnConsultar11);
		
		txtComprarCodigo = new JTextField();
		txtComprarCodigo.setColumns(10);
		txtComprarCodigo.setBounds(365, 12, 86, 20);
		contentPanel.add(txtComprarCodigo);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(316, 15, 46, 14);
		contentPanel.add(lblCodigo);
		
		
		
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(25, 40, 101, 14);
		contentPanel.add(lblNombre);
		
		txtConsultarNombreProductito = new JTextField();
		txtConsultarNombreProductito.setColumns(10);
		txtConsultarNombreProductito.setBounds(107, 37, 86, 20);
		contentPanel.add(txtConsultarNombreProductito);
		
		
		
		
		txtConsultarNombrePro = new JTextField();
		txtConsultarNombrePro.setColumns(10);
		txtConsultarNombrePro.setBounds(81, 46, 86, 20);
		btnConsultarCerrar = new JButton("Cerrar");
		btnConsultarCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnConsultarCerrar(e);
			}
		});
		btnConsultarCerrar.setBounds(203, 36, 89, 23);
		contentPanel.add(btnConsultarCerrar);
		btnConsultardatos = new JButton("Consultar Datos");
		btnConsultardatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnConsultardatos(e);
			}
		});
		btnConsultardatos.setBounds(107, 11, 141, 23);
		contentPanel.add(btnConsultardatos);
/////////////////////////////////////////
txtConsultarNombreProductito.setEditable(false);
txtConsultarPrecio.setEditable(false);
txtConsultarStockMaximo.setEditable(false);
txtConsultarStockMinimo.setEditable(false);
OcultarConsultaBotones();
OcultarColsultaTexto();

/////////////////////////////////////////
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		try {
			StockActualizar(); 
			MostrarTabla();
			Mensaje("Compra Exitosa");
			LimpiarComprar();
		} catch (Exception e2) {
			Mensaje("Debe ingresar un dato");
		}
		
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
		boolean CodigoValido=false;
		try {
			for(int i=0;i<pro.Tamano();i++) {
				if(pro.Obtener(i).getCodigoProducto()==LeerConsultarCodigo()) {
					txtConsultarNombreProductito.setText(pro.Obtener(i).getNombre()+"");
					txtConsultarPrecio.setText(pro.Obtener(i).getPrecio()+"");
					txtConsultarStockMinimo.setText(pro.Obtener(i).getStockMinimo()+"");
					txtConsultarStockMaximo.setText(pro.Obtener(i).getStockMaximo()+"");
					CodigoValido=true;
				}
			}
			if(CodigoValido==false) {
				Mensaje("Ingrese un codigo Valido");
				LimpiarConsultar();
				
			}
			
		} catch (Exception e2) {
			Mensaje("Ingrese un dato Valido");
		}
		
		
		
	}
	//////////////////////////////////////////////////////////////
	public void StockActualizar() {
		for(int i=0;i<pro.Tamano();i++) {
			if(LeerComprarCodigo()==pro.Obtener(i).getCodigoProducto()) {
			  pro.Obtener(i).setStockActual(pro.Obtener(i).getStockActual()-LeerComprarCantidad());
			}
		}
		
	}
	public void MostrarTabla() {
		boolean Encontrado=false;
		
		for(int i=0;i<pro.Tamano();i++) {
			if(LeerComprarCodigo()==pro.Obtener(i).getCodigoProducto()) {
				modelo.setRowCount(0);
				Object filas[]={
						
					LeerComprarCodigo(),
					pro.Obtener(i).getNombre(),
					PagoTotalTXt(),
					IGVSegunTXT(),
					pro.Obtener(i).getStockActual(),
				};
				modelo.addRow(filas);
				Encontrado=true;
				break;
			}
		}
		if(Encontrado==false) {
			Mensaje("El codigo ingresado no es correcto");
		}
		
	}
	public double SubTotalSegunTXT() {
		double Total=0;
		for(int i=0;i<pro.Tamano();i++) {
			if(LeerComprarCodigo()==pro.Obtener(i).getCodigoProducto()) {
				
				  
				try {
					int Cantidad=LeerComprarCantidad();
					if(Cantidad>0) {
						Total= pro.Obtener(i).getPrecio()*Cantidad;
					}else {
						Mensaje("EL numero debe ser mayor a 0");
					}
				} catch (Exception e) {
					Mensaje("La cantidad debe ser un numero entero");
				}
			}
		   
			}
		return Total;
		}
	   
	   
	   public double IGVSegunTXT() {
		   return SubTotalSegunTXT()*0.18;
	   }	   
	   public double PagoTotalTXt() {
		   return SubTotalSegunTXT()-IGVSegunTXT();
	   }
	   
	int LeerComprarCodigo() {
		return Integer.parseInt(txtComprarCodigo.getText());
	}
	int LeerComprarCantidad() {
		return Integer.parseInt(txtComprarCantidad.getText());
	}
	
	int LeerConsultarCodigo() {
		return Integer.parseInt(txtConsultarCodigo.getText());
	}
	int LeerConsultarPrecio() {
		return Integer.parseInt(txtConsultarPrecio.getText());
	}
	int LeerConsultarStockMinimo() {
		return Integer.parseInt(txtConsultarStockMinimo.getText());
	}
	int LeerConsultarStockMaximo() {
		return Integer.parseInt(txtConsultarStockMaximo.getText());
	}
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	void LimpiarComprar() {
		txtComprarCodigo.setText("");
		txtComprarCantidad.setText("");
	}
	void OcultarConsultaBotones() {
		btnConsultarCerrar.setVisible(false);
		btnConsultar11.setVisible(false);
		
	}
	void MostrarConsultaBotones() {
		btnConsultarCerrar.setVisible(true);
		btnConsultar11.setVisible(true);
		
	}
	void OcultarColsultaTexto() {
		txtConsultarNombrePro.setVisible(false);
		txtConsultarNombrePro.setVisible(false);
		txtConsultarNombreProductito.setVisible(false);
		txtConsultarPrecio.setVisible(false);
		txtConsultarStockMinimo.setVisible(false);
		txtConsultarStockMaximo.setVisible(false);
		txtConsultarPrecio.setVisible(false);
		txtConsultarCodigo.setVisible(false);
        lblCodigoProducto.setVisible(false);
        lblCodigoVenta.setVisible(false);
        lblCodigoVenta.setVisible(false);
        lblCodigoVenta_1.setVisible(false);
        lblNombre.setVisible(false);
        lblPrecio.setVisible(false);
	}
	void MostrarColsultaTexto() {
		txtConsultarNombrePro.setVisible(true);
		txtConsultarNombrePro.setVisible(true);
		txtConsultarNombreProductito.setVisible(true);
		txtConsultarPrecio.setVisible(true);
		txtConsultarStockMinimo.setVisible(true);
		txtConsultarStockMaximo.setVisible(true);
		txtConsultarPrecio.setVisible(true);
		txtConsultarCodigo.setVisible(true);
        lblCodigoProducto.setVisible(true);
        lblCodigoVenta.setVisible(true);
        lblCodigoVenta.setVisible(true);
        lblCodigoVenta_1.setVisible(true);
        lblNombre.setVisible(true);
        lblPrecio.setVisible(true);
	}
	void LimpiarConsultar() {
		txtConsultarCodigo.setText("");
		txtConsultarNombrePro.setText("");
		txtConsultarNombreProductito.setText("");
		txtConsultarPrecio.setText("");
		txtConsultarStockMaximo.setText("");
		txtConsultarStockMinimo.setText("");
	}
	protected void actionPerformedBtnConsultardatos(ActionEvent e) {
		MostrarColsultaTexto();
		MostrarConsultaBotones();
		btnConsultardatos.setVisible(false);
	}
	protected void actionPerformedBtnConsultarCerrar(ActionEvent e) {
		OcultarColsultaTexto();
		OcultarConsultaBotones();
		btnConsultardatos.setVisible(true);

	}
}
