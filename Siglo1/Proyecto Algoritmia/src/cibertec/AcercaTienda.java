package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaTienda extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaTienda dialog = new AcercaTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaTienda() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tienda T1BL");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
			lblNewLabel.setBounds(149, 11, 144, 40);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("_______________________________________________________________________________________");
			lblNewLabel_1.setBounds(0, 37, 444, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Autores");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setBounds(190, 62, 89, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Frank especial");
			lblNewLabel_2.setBounds(173, 87, 86, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Mauricio");
			lblNewLabel_2.setBounds(193, 110, 46, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Joaquin");
			lblNewLabel_2.setBounds(193, 135, 100, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Jose Em pingon");
			lblNewLabel_2.setBounds(179, 160, 100, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Junior didi");
			lblNewLabel_2.setBounds(193, 185, 86, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnCerrarActionPerformed(e);
				}
			});
			btnCerrar.setBounds(170, 227, 89, 23);
			getContentPane().add(btnCerrar);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		setVisible(false);
	}
}
