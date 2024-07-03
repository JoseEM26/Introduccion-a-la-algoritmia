package Guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Arreglos.*;
import javax.swing.table.DefaultTableModel;

public class Dlg_Boleta_ventas extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtRuc;
	private JTextField txtBoletaDeVenta;
	private JTextField txtCodigoBolera;
	private JTextField txtVendedor;
	private JLabel lblCodigo;
	private JLabel lblNewLabel_2;
	private JTextField txtCliente;
	private JLabel lblNewLabel_3;
	private JTextField txtDireccion;
	private JTextField txtStockActual;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtCantidad;
	private JTable table;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField txtSubTotal;
	private JTextField txtIGV;
	ArregloProducto pro=new ArregloProducto();
    DefaultTableModel modelo=new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dlg_Boleta_ventas dialog = new Dlg_Boleta_ventas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dlg_Boleta_ventas() {
		setBounds(100, 100, 594, 377);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 223, 15));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tambo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 49));
		lblNewLabel.setBounds(10, 11, 219, 52);
		contentPanel.add(lblNewLabel);
		
		txtRuc = new JTextField();
		txtRuc.setForeground(new Color(255, 255, 255));
		txtRuc.setBackground(new Color(156, 7, 188));
		txtRuc.setHorizontalAlignment(SwingConstants.CENTER);
		txtRuc.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtRuc.setText("R.U.C : 15489652358");
		txtRuc.setBounds(317, 25, 219, 29);
		contentPanel.add(txtRuc);
		txtRuc.setColumns(10);
		
		txtBoletaDeVenta = new JTextField();
		txtBoletaDeVenta.setText("Boleta de Venta");
		txtBoletaDeVenta.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoletaDeVenta.setForeground(Color.WHITE);
		txtBoletaDeVenta.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtBoletaDeVenta.setColumns(10);
		txtBoletaDeVenta.setBackground(new Color(156, 7, 188));
		txtBoletaDeVenta.setBounds(362, 45, 121, 29);
		contentPanel.add(txtBoletaDeVenta);
		
		txtCodigoBolera = new JTextField();
		txtCodigoBolera.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodigoBolera.setForeground(Color.WHITE);
		txtCodigoBolera.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtCodigoBolera.setColumns(10);
		txtCodigoBolera.setBackground(new Color(156, 7, 188));
		txtCodigoBolera.setBounds(362, 65, 121, 29);
		contentPanel.add(txtCodigoBolera);
		
		txtVendedor = new JTextField();
		txtVendedor.setBounds(100, 70, 86, 20);
		contentPanel.add(txtVendedor);
		txtVendedor.setColumns(10);
		
		lblCodigo = new JLabel("Vendedor");
		lblCodigo.setBackground(new Color(204, 51, 51));
		lblCodigo.setBounds(34, 74, 70, 14);
		contentPanel.add(lblCodigo);
		
		lblNewLabel_2 = new JLabel("Cliente");
		lblNewLabel_2.setBounds(34, 95, 70, 14);
		contentPanel.add(lblNewLabel_2);
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBounds(100, 92, 86, 20);
		contentPanel.add(txtCliente);
		
		lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setBounds(34, 120, 70, 14);
		contentPanel.add(lblNewLabel_3);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(100, 117, 86, 20);
		contentPanel.add(txtDireccion);
		
		txtStockActual = new JTextField();
		txtStockActual.setColumns(10);
		txtStockActual.setBounds(269, 163, 86, 20);
		contentPanel.add(txtStockActual);
		
		lblNewLabel_5 = new JLabel("SctockActual");
		lblNewLabel_5.setBounds(200, 166, 81, 14);
		contentPanel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Cantidad");
		lblNewLabel_6.setBounds(386, 166, 81, 14);
		contentPanel.add(lblNewLabel_6);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(450, 163, 86, 20);
		contentPanel.add(txtCantidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 191, 545, 59);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		modelo.addColumn("Codigo Producto");
		modelo.addColumn("Nombre");
		modelo.addColumn("Precio");
		modelo.addColumn("StockMaximo");
		modelo.addColumn("StockMinimo");
		table.setModel(modelo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 261, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(111, 261, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(204, 261, 89, 23);
		contentPanel.add(btnNewButton_1_1);
		
		lblNewLabel_7 = new JLabel("SubTotal");
		lblNewLabel_7.setBounds(362, 270, 81, 14);
		contentPanel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("IGV");
		lblNewLabel_8.setBounds(362, 291, 81, 14);
		contentPanel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Total a Pagar");
		lblNewLabel_9.setBounds(362, 313, 81, 14);
		contentPanel.add(lblNewLabel_9);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(436, 262, 86, 20);
		contentPanel.add(txtSubTotal);
		
		txtIGV = new JTextField();
		txtIGV.setColumns(10);
		txtIGV.setBounds(436, 288, 86, 20);
		contentPanel.add(txtIGV);
		
		txtTotalPaga = new JTextField();
		txtTotalPaga.setColumns(10);
		txtTotalPaga.setBounds(436, 310, 86, 20);
		contentPanel.add(txtTotalPaga);
		
		txtFecha = new JTextField();
		txtFecha.setHorizontalAlignment(SwingConstants.CENTER);
		txtFecha.setForeground(Color.WHITE);
		txtFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtFecha.setColumns(10);
		txtFecha.setBackground(new Color(156, 7, 188));
		txtFecha.setBounds(362, 92, 121, 29);
		contentPanel.add(txtFecha);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(156, 7, 188));
		textField_1.setBounds(362, 92, 121, 29);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.GREEN);
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(156, 7, 188));
		textField_2.setBounds(269, 11, 294, 123);
		contentPanel.add(textField_2);
		
		
		///////////////////////////////////////////////////
		txtBoletaDeVenta.setEditable(false);
		txtCantidad.setEditable(false);
		txtCliente.setEditable(false);
		txtCodigoBolera.setEditable(false);
		txtDireccion.setEditable(false);
		txtFecha.setEditable(false);
		txtIGV.setEditable(false);
		txtRuc.setEditable(false);
		txtStockActual.setEditable(false);
		txtSubTotal.setEditable(false);
		txtVendedor.setEditable(false);
		txtTotalPaga.setEditable(false);

		///////////////////////////////////////////////////
	}
	private JTextField txtTotalPaga;
	
	public void Listar() {
		
		}
	
	private int codigo;
	public void setBoletaCodigo(int codigo) {
	    this.codigo = codigo;
	    txtCodigoBolera.setText(String.valueOf(codigo));
	}
	
    private String NombreCliente;
	public void setBoletaNombreCliente(String nombreCliente) {
			this.NombreCliente=nombreCliente;
			txtCliente.setText(nombreCliente);
			
	}
	
	private String NombreVendedor;
	public void setBoletaNombreVendedor(String nombreVendedor) {
		this.NombreVendedor=nombreVendedor;
		txtVendedor.setText(nombreVendedor);
	}
	
	private int Cantidad;
	public void setBoletacantidad(int cantidad) {
		this.Cantidad=cantidad;
		txtCantidad.setText(String.valueOf(Cantidad));
	}
	
	private String Direccion;
	public void setBoletaDireccion(String Direccion) {
		this.Direccion=Direccion;
		txtDireccion.setText(Direccion);
	}
	 
	private double IGV;
	public void setIGV(double IGV) {
		this.IGV=IGV;
		txtIGV.setText(String.valueOf(IGV));
	}
	
	private double Pago;
	public void SetPagoCompleto(double pago) {
		this.Pago=Pago;
		txtTotalPaga.setText(String.valueOf(pago));
	}
	
	private double SubTotal;
	public void SetSubTotal(double subTotal) {
		this.SubTotal=subTotal;
		txtSubTotal.setText(String.valueOf(subTotal));

	}
	private int actual;
	private JTextField txtFecha;
	public void StockActual(int Actual) {
		this.actual=Actual;
		txtStockActual.setText(String.valueOf(Actual));
	}
	
	private int codigoPro;
	public void ListarCodigoPro(int codigo) {
		this.codigoPro=codigo;
		
		modelo.setRowCount(0);
		Object filas[]= {
				pro.Obtener(codigo-2001).getCodigoProducto(),
				pro.Obtener(codigo-2001).getNombre(),
				pro.Obtener(codigo-2001).getPrecio(),
				pro.Obtener(codigo-2001).getStockMaximo(),
				pro.Obtener(codigo-2001).getStockMinimo(),
		};
		modelo.addRow(filas);
	}
	
	private String fecha;
	private JTextField textField_1;
	private JTextField textField_2;
	public void Fecha(String fecha) {
		this.fecha=fecha;
		txtFecha.setText(fecha);
	}
	
}