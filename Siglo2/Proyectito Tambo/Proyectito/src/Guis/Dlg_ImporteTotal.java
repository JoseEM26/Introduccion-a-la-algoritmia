package Guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloProducto;
import Arreglos.ArregloVenta;
import Clases.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Dlg_ImporteTotal extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	ArregloProducto pro = new ArregloProducto();
	ArregloVenta ven = new ArregloVenta();
	
	ArrayList<Producto> producto = pro.obtener();
	ArrayList<Ventas> venta = ven.obtener();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dlg_ImporteTotal dialog = new Dlg_ImporteTotal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dlg_ImporteTotal() {
		setBounds(100, 100, 473, 417);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(128, 0, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(160, 11, 123, 29);
		contentPanel.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 437, 324);
		contentPanel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		listado();
		
	}
	
	
	void listado() {
		
		ArrayList<Producto> producto = pro.obtener();
		ArrayList<Ventas> venta = ven.obtener();
		
		for(Producto productos:producto) for(Ventas ventas: venta) {
			String textoProducto= "Codigo Producto: " + productos.getCodigoProducto()+"\n"+
									"Nombre del Producto: "+ productos.getNombre()+"\n"+
									"Importe Total: " +ventas.TotalPagar()+"\n"+
									"_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ "+"\n";
			textArea.append(textoProducto);
		}
		
		
	}
	
	
}
