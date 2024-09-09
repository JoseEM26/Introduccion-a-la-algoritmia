package Ceramica;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;


public class ConfigOptima extends JDialog {
	private JTextField txtCantopt;
private Menu parentFrame;
	
	public ConfigOptima(Menu parentFrame) {  
        this.parentFrame = parentFrame;  
    }

	/**
	 * Launch the application.
	 */
	int cantop = Menu.cantidadOptima;
	String cantopt = String.valueOf(cantop);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigOptima dialog = new ConfigOptima();
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
	public ConfigOptima() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto Algoritmia Ceramica\\img\\cajas.png"));
		getContentPane().setBackground(new Color(238, 232, 170));
		setTitle("Configuracion Cantidad Optima");
		setBounds(100, 100, 450, 118);
		getContentPane().setLayout(null);
		
		JLabel lblCantidadOptima = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblCantidadOptima.setBounds(21, 22, 223, 14);
		getContentPane().add(lblCantidadOptima);
		
		txtCantopt = new JTextField();
		txtCantopt.setText(cantopt);
		txtCantopt.setBounds(254, 19, 49, 20);
		getContentPane().add(txtCantopt);
		txtCantopt.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parentFrame.cantidadOptima = Integer.parseInt(txtCantopt.getText());
				
				dispose();
			}
		});
		btnAceptar.setBounds(335, 18, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(335, 43, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
