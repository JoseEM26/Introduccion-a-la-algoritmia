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

public class ConDescuentos extends JDialog {
	private JTextField txtUnidad1;
	private JTextField txtUnidad2;
	private JTextField txtUnidad3;
	private JTextField txtUnidad4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConDescuentos dialog = new ConDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConDescuentos() {
		setTitle("Configuracion porcentajes de descuentos");
		setBounds(100, 100, 450, 151);
		getContentPane().setLayout(null);
		
		JLabel lblUnidad1 = new JLabel("1 a 5 Unidades");
		lblUnidad1.setBounds(10, 11, 76, 14);
		getContentPane().add(lblUnidad1);
		
		JLabel lblUnidad2 = new JLabel("6 a 10 Unidades");
		lblUnidad2.setBounds(10, 36, 103, 14);
		getContentPane().add(lblUnidad2);
		
		JLabel lblUnidad3 = new JLabel("11 a 15 Unidades");
		lblUnidad3.setBounds(10, 61, 126, 14);
		getContentPane().add(lblUnidad3);
		
		JLabel lblUnidad4 = new JLabel("m\u00E1s de 15 Unidades");
		lblUnidad4.setBounds(10, 86, 126, 14);
		getContentPane().add(lblUnidad4);
		
		txtUnidad1 = new JTextField();
		txtUnidad1.setText("7.5");
		txtUnidad1.setBounds(126, 8, 86, 20);
		getContentPane().add(txtUnidad1);
		txtUnidad1.setColumns(10);
		
		txtUnidad2 = new JTextField();
		txtUnidad2.setText("10.0");
		txtUnidad2.setColumns(10);
		txtUnidad2.setBounds(126, 33, 86, 20);
		getContentPane().add(txtUnidad2);
		
		txtUnidad3 = new JTextField();
		txtUnidad3.setText("12.5");
		txtUnidad3.setColumns(10);
		txtUnidad3.setBounds(126, 58, 86, 20);
		getContentPane().add(txtUnidad3);
		
		txtUnidad4 = new JTextField();
		txtUnidad4.setText("15.0");
		txtUnidad4.setColumns(10);
		txtUnidad4.setBounds(126, 86, 86, 20);
		getContentPane().add(txtUnidad4);
		
		JLabel lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setBounds(224, 11, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(224, 36, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(222, 61, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(224, 86, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
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
		btnCancelar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCancelar);
	}
	protected void btnAceptarActionPerformed(ActionEvent e) {
		
		Ceramicas.porcentaje1=Double.parseDouble(txtUnidad1.getText());
		Ceramicas.porcentaje2=Double.parseDouble(txtUnidad2.getText());
		Ceramicas.porcentaje3=Double.parseDouble(txtUnidad3.getText());
		Ceramicas.porcentaje4=Double.parseDouble(txtUnidad4.getText());
		
		
		
		
		
		
		
		
		
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		setVisible(false);
	}
}
