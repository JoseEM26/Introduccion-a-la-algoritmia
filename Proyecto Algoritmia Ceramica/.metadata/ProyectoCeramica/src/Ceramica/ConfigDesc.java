package Ceramica;

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
import java.awt.Toolkit;
import java.awt.Color;

public class ConfigDesc extends JDialog {
	private JTextField txt1a5;
	private JTextField txt5a10;
	private JTextField txt11a15;
	private JTextField txtMas15;
	private Menu parentFrame;
	
	public ConfigDesc(Menu parentFrame) {  
        this.parentFrame = parentFrame;  
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigDesc dialog = new ConfigDesc();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 double por1 = Menu.porcentaje1;
   	 double por2 = Menu.porcentaje2;
   	 double por3 = Menu.porcentaje3;
   	 double por4 = Menu.porcentaje4; 
   	 
   	String po1 = String.valueOf(por1);
   	String po2 = String.valueOf(por2);
   	String po3 = String.valueOf(por3);
   	String po4 = String.valueOf(por4);
   	private JLabel lblMas15;
   	private JButton btnAceptar;
	/**
	 * Create the dialog.
	 */
	public ConfigDesc() {
		getContentPane().setBackground(new Color(238, 232, 170));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto Algoritmia Ceramica\\img\\configuracion.png"));
		setTitle("Configurar porcentajes de descuento\r");
		setBounds(100, 100, 417, 172);
		getContentPane().setLayout(null);
		{
			JLabel lbl1a5 = new JLabel("1 a 5 unidades");
			lbl1a5.setBounds(10, 28, 107, 14);
			getContentPane().add(lbl1a5);
		}
		{
			JLabel lbl5a10 = new JLabel("5 a 10 unidades");
			lbl5a10.setBounds(10, 53, 107, 14);
			getContentPane().add(lbl5a10);
		}
		{
			JLabel lbl11a15 = new JLabel("11 a 15 unidades");
			lbl11a15.setBounds(10, 78, 107, 14);
			getContentPane().add(lbl11a15);
		}
		{
			lblMas15 = new JLabel("M\u00E1s de 15 unidades");
			lblMas15.setBounds(10, 103, 114, 14);
			getContentPane().add(lblMas15);
		}
		{
			txt1a5 = new JTextField();
			txt1a5.setText(po1);
			txt1a5.setBounds(127, 25, 104, 20);
			getContentPane().add(txt1a5);
			txt1a5.setColumns(10);
		}
		{
			txt5a10 = new JTextField();
			txt5a10.setText(po2);
			txt5a10.setBounds(127, 50, 104, 20);
			getContentPane().add(txt5a10);
			txt5a10.setColumns(10);
		}
		{
			txt11a15 = new JTextField();
			txt11a15.setText(po3);
			txt11a15.setBounds(127, 75, 104, 20);
			getContentPane().add(txt11a15);
			txt11a15.setColumns(10);
		}
		{
			txtMas15 = new JTextField();
			txtMas15.setText(po4);
			txtMas15.setBounds(127, 100, 104, 20);
			getContentPane().add(txtMas15);
			txtMas15.setColumns(10);
		}
		{
			JLabel lbl_1 = new JLabel("%");
			lbl_1.setBounds(241, 28, 16, 14);
			getContentPane().add(lbl_1);
		}
		{
			JLabel lbl_2 = new JLabel("%");
			lbl_2.setBounds(241, 53, 16, 14);
			getContentPane().add(lbl_2);
		}
		{
			JLabel lbl_3 = new JLabel("%");
			lbl_3.setBounds(241, 78, 16, 14);
			getContentPane().add(lbl_3);
		}
		{
			JLabel lbl_4 = new JLabel("%");
			lbl_4.setBounds(241, 103, 16, 14);
			getContentPane().add(lbl_4);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
                    parentFrame.porcentaje1 = Double.parseDouble(txt1a5.getText());
                    parentFrame.porcentaje2 = Double.parseDouble(txt5a10.getText());
                    parentFrame.porcentaje3 = Double.parseDouble(txt11a15.getText());
                    parentFrame.porcentaje4 = Integer.parseInt(txtMas15.getText());
		           	 
		           	
                     
					
                    dispose();
				}
			});
			btnAceptar.setBounds(291, 24, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancelar.setBounds(291, 53, 89, 23);
			getContentPane().add(btnCancelar);
		}
	}

}
