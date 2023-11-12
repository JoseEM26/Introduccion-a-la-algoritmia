package actividad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conjuntoDeSueldoEmpleados extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblSueldo;
	private JTextField txtSueldo;
	private JButton btnProcesar;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conjuntoDeSueldoEmpleados frame = new conjuntoDeSueldoEmpleados();
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
	public conjuntoDeSueldoEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSueldo = new JLabel("Sueldo");
		lblSueldo.setBounds(10, 36, 46, 14);
		contentPane.add(lblSueldo);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(93, 33, 86, 20);
		contentPane.add(txtSueldo);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 399, 546);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	private JTextArea txtS;
	//================================================================================
	double sueldo1,sueldo2,sueldo3,sueldo4;
	
	int EntradaSueldo() {
	   return Integer.parseInt(txtSueldo.getText());
	}
	
	void CalcularSueldos(double su) {
		if(su<=2500)
			sueldo1++;
		else if(su>2500 && su<=3000)
			sueldo2++;
		else if(su>3000 && su<=3500)
			sueldo3++;
		else
			sueldo4++;
	}
	
    void Salida() {
    	txtS.setText("");
    	imprimir("Cantidad de sueldo<=2500 \t\t"+sueldo1);
    	imprimir("Cantidad de sueldo >2500 <=3000 \t"+sueldo2);
    	imprimir("Cantidad de sueldo >3000 <=3500 \t"+sueldo3);
    	imprimir("Cantidad de sueldo >3500 \t\t"+sueldo4);
    	
    }
	void imprimir(String ss) {
		txtS.append(ss+"\n");
	}
	
	
	
	//================================================================================

	protected void actionPerformedBtnProcesar(ActionEvent e) {
		int sueldo;
		
		sueldo=EntradaSueldo();
		
		CalcularSueldos(sueldo);
		Salida();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
