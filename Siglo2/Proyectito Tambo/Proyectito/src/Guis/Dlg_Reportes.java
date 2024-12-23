package Guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Arreglos.ArregloCliente;
import Arreglos.ArregloProducto;
import Arreglos.ArregloVenta;
import Clases.*;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Dlg_Reportes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	ArregloProducto pro=new ArregloProducto();
	ArregloVenta ven=new ArregloVenta();
	ArregloCliente cli =new ArregloCliente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dlg_Reportes dialog = new Dlg_Reportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dlg_Reportes() {
		getContentPane().setBackground(new Color(128, 0, 255));
		setBounds(100, 100, 467, 427);
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(143, 11, 117, 23);
		getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 431, 332);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		listarBoleta();
		
		
		
	}
	
	
	void listarBoleta() {
		ArrayList<Ventas> ventas = ven.obtener();
		
	
		for (Ventas venta : ventas ) {
         String textoVenta="Codigo Venta: " + venta.getCodigoVenta()+"\n"+
        		 			"Codigo Cliente: " + ""+"\n"+
        		 			"Codigo Producto:" +""+"\n"+
        		 			"Fecha:  " + venta.getFecha()+"\n"+
        		 			"Subtotal: " + venta.SubTotal()+"\n"+
        		 			"IGV: " + venta.IGV()+"\n"+
        		 			"Total: " + venta.TotalPagar()+"\n"+
        		 			"_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"+"\n";
        		 			
         
         textArea.append(textoVenta);
		}
		}
	
	/*void listarBoleta1() {
		ArrayList<Cliente> cliente = cli.obtener();
		for(Cliente cliente1 :cliente) {
			String textoCliente="codigo: " + cliente1.getCodigoCliente();
			textArea.append(textoCliente);
		}
	}
	
	void listarBoleta2() {
		ArrayList<Producto> producto = pro.obtener();
		for(Producto producto1 : producto) {
			String textoCliente="codigo: " + producto1.getCodigoProducto();
			textArea.append(textoCliente);
		}
	}
	
	void listarBoleta3 () {
		ArrayList<Ventas> ventas = ven.obtener();
		for (Ventas venta : ventas) {
         String textoVenta=" Fecha: " + venta.getFecha()+"\n"+
         					"Subtotal: " + venta.SubTotal()+"\n"+
         					"IGV: " + venta.IGV()+"\n"+
         					"Total: " + venta.TotalPagar()+"\n"+
         					"_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"+"\n";
         textArea.append(textoVenta);
		}
		}*/
	
	/*void listarBoleta() {
        ArrayList<Ventas> ventas = ven.obtener();
        ArrayList<Cliente> clientes = cli.obtener();
        ArrayList<Producto> productos = pro.obtener();

        StringBuilder sb = new StringBuilder();

        sb.append("Listado general de ventas:\n");
        for (Ventas venta : ventas) {
            Cliente cliente = clientes.stream().filter(c -> c.getCodigoCliente() == venta.getCodigoCliente()).findFirst().orElse(null);
            Producto producto = productos.stream().filter(p -> p.getCodigoProducto() == venta.getCodigoProducto()).findFirst().orElse(null);

            sb.append("Código de Venta: " + venta.getCodigoVenta()+"\n");
            sb.append("Código de Cliente: "+cliente != null ? cliente.getCodigoCliente() : "N/A" + "\n");
            sb.append("Código de Producto: ").append(producto != null ? producto.getCodigoProducto() : "N/A").append("\n");
            sb.append("Fecha: ").append(venta.getFecha()).append("\n");
            sb.append("Subtotal: "+ venta.SubTotal()+"\n");
            sb.append("IGV: "+ venta.IGV()+"\n");
            sb.append("Total: "+venta.TotalPagar()+"\n");
            sb.append("--------------------------------------------------\n");
        }*/

	
	
	
	
	
	
}
