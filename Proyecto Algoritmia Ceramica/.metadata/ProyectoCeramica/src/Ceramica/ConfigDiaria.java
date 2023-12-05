package Ceramica;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class ConfigDiaria extends JDialog {
	private JTextField txtCuotaDiaria;
	private JButton btnAceptar;
	private JButton btnCancelar;
private Menu parentFrame;
	
	public ConfigDiaria(Menu parentFrame) {  
        this.parentFrame = parentFrame;  
    }

	/**
	 * Launch the application.
	 */
	double diario = Menu.cuotaDiaria;
	String candiar = String.valueOf(diario);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigDiaria dialog = new ConfigDiaria();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConfigDiaria() {
		getContentPane().setBackground(new Color(238, 232, 170));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto Algoritmia Ceramica\\img\\mano.png"));
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 423, 127);
		getContentPane().setLayout(null);
		
		JLabel lblCuotaDIaria = new JLabel("Cuota diaria esperada (S/.)");
		lblCuotaDIaria.setBounds(10, 21, 164, 14);
		getContentPane().add(lblCuotaDIaria);
		
		txtCuotaDiaria = new JTextField();
		txtCuotaDiaria.setText(candiar);
		txtCuotaDiaria.setBounds(184, 18, 113, 20);
		getContentPane().add(txtCuotaDiaria);
		txtCuotaDiaria.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 parentFrame.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());
				 dispose();
			}
		});
		btnAceptar.setBounds(307, 17, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(307, 51, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
