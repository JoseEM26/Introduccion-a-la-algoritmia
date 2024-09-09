package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConObsequios extends JDialog {
	private JTextField txtTipo;
	private JTextField txtTipo1;
	private JTextField txtTipo2;
	private JTextField txtTipo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConObsequios dialog = new ConObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConObsequios() {
		setBounds(100, 100, 450, 143);
		getContentPane().setLayout(null);
		{
			JLabel lbltipo = new JLabel("Tipo De Obsequio");
			lbltipo.setBounds(10, 11, 126, 14);
			getContentPane().add(lbltipo);
		}
		
		JLabel lblTipo1 = new JLabel("1 a 5 unidades");
		lblTipo1.setBounds(10, 33, 94, 14);
		getContentPane().add(lblTipo1);
		
		JLabel lbltipo2 = new JLabel("6 a 10 unidades");
		lbltipo2.setBounds(10, 56, 94, 14);
		getContentPane().add(lbltipo2);
		
		JLabel lblNewLabel_2 = new JLabel("11 a mas unidades");
		lblNewLabel_2.setBounds(10, 78, 126, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtTipo = new JTextField();
		txtTipo.setText("Lapiceros");
		txtTipo.setBounds(122, 8, 86, 20);
		getContentPane().add(txtTipo);
		txtTipo.setColumns(10);
		
		txtTipo1 = new JTextField();
		txtTipo1.setText("2");
		txtTipo1.setColumns(10);
		txtTipo1.setBounds(122, 30, 86, 20);
		getContentPane().add(txtTipo1);
		
		txtTipo2 = new JTextField();
		txtTipo2.setText("3");
		txtTipo2.setColumns(10);
		txtTipo2.setBounds(122, 53, 86, 20);
		getContentPane().add(txtTipo2);
		
		txtTipo3 = new JTextField();
		txtTipo3.setText("4");
		txtTipo3.setColumns(10);
		txtTipo3.setBounds(122, 75, 86, 20);
		getContentPane().add(txtTipo3);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptarActionPerformed(e);
			}
		});
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(335, 29, 89, 23);
		getContentPane().add(btnCancelar);
	}

	protected void btnAceptarActionPerformed(ActionEvent e) {
		
		Ceramicas.tipoObsequio=String.valueOf(txtTipo.getText());
	   Ceramicas.obsequioCantidad1=Integer.parseInt(txtTipo1.getText());
	   Ceramicas.obsequioCantidad2=Integer.parseInt(txtTipo2.getText());
	   Ceramicas.obsequioCantidad3=Integer.parseInt(txtTipo3.getText());
	   
	   
	   
	   
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		setVisible(false);
	}
}
