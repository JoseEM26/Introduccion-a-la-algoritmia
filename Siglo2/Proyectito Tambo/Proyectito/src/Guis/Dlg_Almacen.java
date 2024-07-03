package Guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Clases.*;
import Arreglos.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;

public class Dlg_Almacen extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtIngresoCodigo;
	private final JLabel lblCantidad = new JLabel("Cantidad");
	private final JTextField txtIngresoCantidad = new JTextField();
	private JTable table;
	 ArregloProducto pro=new ArregloProducto();
     DefaultTableModel modelo=new DefaultTableModel();
	public static void main(String[] args) {
		try {
			Dlg_Almacen dialog = new Dlg_Almacen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Dlg_Almacen() {
		setTitle("Tambo");
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(128, 0, 255));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(128, 0, 255));
		contentPanel.setForeground(new Color(128, 0, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtIngresoCodigo = new JTextField();
		txtIngresoCodigo.setBounds(77, 51, 86, 20);
		contentPanel.add(txtIngresoCodigo);
		txtIngresoCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(21, 54, 46, 14);
		contentPanel.add(lblNewLabel);
		lblCantidad.setForeground(new Color(255, 255, 255));
		lblCantidad.setBounds(21, 79, 46, 14);
		
		contentPanel.add(lblCantidad);
		txtIngresoCantidad.setColumns(10);
		txtIngresoCantidad.setBounds(77, 76, 86, 20);
		
		contentPanel.add(txtIngresoCantidad);
		
		JButton btnIngreso = new JButton("Ingresar");
		btnIngreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnIngreso(e);
			}
		});
		btnIngreso.setBounds(315, 61, 109, 32);
		contentPanel.add(btnIngreso);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 104, 414, 146);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		////////////////////
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("P. Unidad");
		modelo.addColumn("StockActual");
		modelo.addColumn("StockMaximo");
		table.setModel( modelo);
		
		JLabel lblNewLabel_1 = new JLabel("Almacen");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(21, 14, 200, 26);
		contentPanel.add(lblNewLabel_1);
		///////////////////
	}
	protected void actionPerformedBtnIngreso(ActionEvent e) {
		IngresoDatos();
	}
	public void IngresoDatos() {
		boolean EncontradoCodigo=false;
		try {
			int Codigo=LeerCodigo();
            for(int i=0;i<pro.Tamano();i++) {
            	if(Codigo==pro.Obtener(i).getCodigoProducto()) {
            		EncontradoCodigo=true;
            		try {
						int Cantidad=LeerCantidad();
						int StockActualizado=LeerCantidad()+pro.Obtener(i).getStockActual();
						if(StockActualizado<pro.Obtener(i).getStockMaximo()) {
							pro.Obtener(i).setStockActual(StockActualizado);
							
							modelo.setRowCount(0);
							Object filas[]= {
								Codigo,
								pro.Obtener(i).getNombre(),
								pro.Obtener(i).getPrecio(),
								StockActualizado,
								pro.Obtener(i).getStockMaximo()
							};
							modelo.addRow(filas);
							Mensaje("Nuevo Stock de "+pro.Obtener(i).getNombre()+"Fue agregado Correctamente");
							
						}else {
							Mensaje("La cantidad ingresada supera nuestro stock Maximo");
						}
					} catch (Exception e) {
						Mensaje("El dato ingresado no es entero");
					}
            		
            	}
            	
            }
            if(!EncontradoCodigo) {
        		Mensaje("Codigo no existe, intenta con otro");
        	}
		} catch (Exception e) {
			Mensaje("El dato ingresado no es entero");
		}
	}
    public int LeerCodigo() {
    	return Integer.parseInt(txtIngresoCodigo.getText());
    	
    }
    public int LeerCantidad() {
    	return Integer.parseInt(txtIngresoCantidad.getText());
    }
    public void Mensaje(String s) {
    	JOptionPane.showMessageDialog(null, s);
    }
}