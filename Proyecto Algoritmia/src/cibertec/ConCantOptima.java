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

public class ConCantOptima extends JDialog {
	private JTextField txtCAntidadIprtima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConCantOptima dialog = new ConCantOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConCantOptima() {
		setTitle("Configuracion Cantidad Optimas");
		setBounds(100, 100, 450, 108);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cantidad optima de unidad vendida");
			lblNewLabel.setBounds(10, 11, 177, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			txtCAntidadIprtima = new JTextField();
			txtCAntidadIprtima.setText("10");
			txtCAntidadIprtima.setBounds(195, 8, 86, 20);
			getContentPane().add(txtCAntidadIprtima);
			txtCAntidadIprtima.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnAceptarActionPerformed(e);
				}
			});
			btnAceptar.setBounds(335, 7, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnCancelarActionPerformed(e);
				}
			});
			btnCancelar.setBounds(335, 33, 89, 23);
			getContentPane().add(btnCancelar);
		}
	}

	protected void btnAceptarActionPerformed(ActionEvent e) {
		Ceramicas.cantidadOptima=Integer.parseInt(txtCAntidadIprtima.getText());
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		setVisible(false);
	}
}
