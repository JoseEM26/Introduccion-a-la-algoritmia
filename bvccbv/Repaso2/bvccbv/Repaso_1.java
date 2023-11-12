package bvccbv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Repaso_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JButton btnEliminar;
	private JComboBox cboMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Repaso_1 frame = new Repaso_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Repaso_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(335, 45, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 15, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 49, 46, 14);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(66, 46, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 396, 150);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		cboMarca = new JComboBox();
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"laive", "gloria"}));
		cboMarca.setBounds(66, 11, 89, 22);
		contentPane.add(cboMarca);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	   double impCompra,impDescuento=0,impPago=0,marca;
	   int camtdidad,obsequio;
	   
	   marca = cboMarca.getSelectedIndex();
	   camtdidad=Integer.parseInt(txtCantidad.getText());
	   
	   if (marca==0) 
		   impCompra=camtdidad*5.4;
	   else 
		   impCompra=camtdidad*5.7;
	   
	   if (camtdidad<3 ) 
		   impDescuento=impCompra*0;
	   if (camtdidad >= 3 && camtdidad < 6 ) 
		   impDescuento=impCompra*0.25;
	   if (camtdidad >= 6 && camtdidad < 12 )  
		   impDescuento=impCompra*0.5;
	   if (camtdidad>=12 ) 
		   impDescuento=impCompra*0.75;
	
       if (camtdidad==0) 
    	   obsequio=camtdidad*2;
    	   else 
			obsequio=camtdidad*3;
	
	   

		
		txtS.setText("Importe de compra\t:S/." + String.format("%,8.2f",impCompra)+"\n");
		txtS.append("Importe de Descuento\t:S/." + String.format("%,8.2f",impDescuento)+"\n");
		txtS.append("Importe de Pagar\t:S/." + String.format("%,8.2f",impPago)+"\n");
		txtS.append("Obsequio\t\t:S/." + obsequio+"\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		txtCantidad.setText("");
		txtCantidad.setText("");
		txtS.setText("");
		txtCantidad.requestFocus();
	}
}
