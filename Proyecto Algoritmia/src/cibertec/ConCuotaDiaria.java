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

public class ConCuotaDiaria extends JDialog {
	private JTextField txtCuota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConCuotaDiaria dialog = new ConCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConCuotaDiaria() {
		setTitle("Configuracion cuota diaria");
		setBounds(100, 100, 450, 100);
		getContentPane().setLayout(null);
		{
			JLabel lblCuotaDiaria = new JLabel("Cuota Diaria Esperada(S/.)");
			lblCuotaDiaria.setBounds(10, 11, 134, 14);
			getContentPane().add(lblCuotaDiaria);
		}
		{
			txtCuota = new JTextField();
			txtCuota.setText("30000.0");
			txtCuota.setBounds(142, 8, 86, 20);
			getContentPane().add(txtCuota);
			txtCuota.setColumns(10);
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
			btnCancelar.setBounds(335, 30, 89, 23);
			getContentPane().add(btnCancelar);
		}
	}

	protected void btnCancelarActionPerformed(ActionEvent e) {
		setVisible(false);
	}
	protected void btnAceptarActionPerformed(ActionEvent e) {
	Ceramicas.cuotaDiaria=Double.parseDouble(txtCuota.getText());
	}
}
