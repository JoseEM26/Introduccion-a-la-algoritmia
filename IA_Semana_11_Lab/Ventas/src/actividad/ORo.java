package actividad;

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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ORo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCatnidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ORo frame = new ORo();
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
	public ORo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 15, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 40, 46, 14);
		contentPane.add(lblCantidad);
		
		txtCatnidad = new JTextField();
		txtCatnidad.setColumns(10);
		txtCatnidad.setBounds(64, 37, 86, 20);
		contentPane.add(txtCatnidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 414, 186);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Cobre", "bronze", "silver", "gold"}));
		cboTipo.setBounds(66, 11, 84, 22);
		contentPane.add(cboTipo);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			///////////////////////////////////////////////////
			
			
int entradaTopo() {
	return cboTipo.getSelectedIndex();
}
int entradaCantidad() {
	return Integer.parseInt(txtCatnidad.getText());
}
		
double CalcularImpPago(int licencia, int cantidad){
	double impPago=0;
	   switch(licencia) {
	   case 0:
		   impPago=cantidad*510;
		   break;
	   case 1:
		   impPago=cantidad*1500;
		   break;
	   case 2:
		   impPago=cantidad*3100;
		   break;
	   case 3:
		   impPago=cantidad*4500;
		   break;
	   
	   }
	return impPago;
}
			
void calculaReturn(double impPago,int cantidad,int licencia) {
		switch(licencia) {
		case 0:
			iT+=impPago;
			cL+=cantidad;
			cV++;
			break;
		case 1:
			iT1+=impPago;
			cL1+=cantidad;
			cV1++;
			break;
		case 2:
			iT2+=impPago;
			cL2+=cantidad;
			cV2++;
			break;
		case 3:
			iT3+=impPago;
			cL3+=cantidad;
			cV3++;
			break;
		}
}
			
void Salida(double impPago,int canLicencia) {
	txtS.setText("Importe a pagar............\t:"+impPago);
	IMPRIMIR("Importe ttal recaudado");
	IMPRIMIR("Por licenica de cobre:"+iT);
	IMPRIMIR("Por licenica de bronze"+iT1);
	IMPRIMIR("Por licenica de silver"+iT2);
	IMPRIMIR("Por licenica de gold"+iT3);
	IMPRIMIR("");
	IMPRIMIR("Cantidad de licencias venidad");
	IMPRIMIR("Por licenica de cobre:"+cL);
	IMPRIMIR("Por licenica de bronze"+cL1);
	IMPRIMIR("Por licenica de silver"+cL2);
	IMPRIMIR("Por licenica de gold"+cL3);
	IMPRIMIR("");
	IMPRIMIR("cantidad de ventas efectuadas");
	IMPRIMIR("Por licenica de cobre:"+cV);
	IMPRIMIR("Por licenica de bronze"+cV1);
	IMPRIMIR("Por licenica de silver"+cV2);
	IMPRIMIR("Por licenica de gold"+cV3);
	IMPRIMIR("");
}
	void IMPRIMIR(String ss) {
		txtS.append(ss+"\n");
	}
			///////////////////////////////////////////////////
			int c,t;
			double ip;
			double iT,iT1,iT2,iT3;
			int cL,cL1,cL2,cL3;
			int cV,cV1,cV2,cV3;
			
			public void actionPerformed(ActionEvent e) {
		t=entradaTopo();
		c=entradaCantidad();
		ip=CalcularImpPago(t, c);
		calculaReturn(ip,c,t);
		Salida(ip, t);
				
				
			}
		});
		btnNewButton_1.setBounds(335, 36, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
