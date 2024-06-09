package actividad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class dsa extends JFrame {

	private JPanel contentPane;
	private JTextField txtxantidad;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dsa frame = new dsa();
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
	public dsa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 11, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblCantida = new JLabel("cantida");
		lblCantida.setBounds(10, 36, 46, 14);
		contentPane.add(lblCantida);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Cobre", "Bronze", "Silver", "Gold"}));
		cboTipo.setBounds(107, 7, 158, 22);
		contentPane.add(cboTipo);
		
		txtxantidad = new JTextField();
		txtxantidad.setBounds(107, 33, 158, 20);
		contentPane.add(txtxantidad);
		txtxantidad.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			int can,licencia;
		  	double impPago;
            double TRecaudado0,TRecaudado1,TRecaudado2,TRecaudado3;
		  	int canLice0,canLice1,canLice2,canLice3;
		  	int CanVent0,CanVent1,CanVent2,CanVent3;
		  	
		  	
		  	void EntradaCantidad(){
		  		can=Integer.parseInt(txtxantidad.getText());
		  	}
		  	void EntradaLicencia() {
		  		licencia=cboTipo.getSelectedIndex();		  		
		  	}
			
		  	
		  	
		  	double ProcesoImpPAgo(int cantidad) {
		  		double ip;
		  		switch(licencia) {
		  		case 0:
		  			ip=can*510;
		  		break;
		  		case 1:
		  			ip=can*1500;
		  		break;
		  		case 2:
		  			ip=can*3100;
		  		break;
		  		default:
		  			ip=can*4500;
		  		break;
		  		
		  		}
		  		return ip;
		  	}
		  	
		  	void COntador(){
		  		switch(licencia) {
		  		case 0:
		  			TRecaudado0+=impPago;
			  		canLice0+=can;
			  		CanVent0++;
		  			break;
		  		case 1:
		  			TRecaudado1+=impPago;
			  		canLice1+=can;
			  		CanVent1++;
		  			break;
		  		case 2:
		  			TRecaudado2+=impPago;
			  		canLice2+=can;
			  		CanVent2++;
		  			break;
		  		case 3:
		  			TRecaudado3+=impPago;
			  		canLice3+=can;
			  		CanVent3++;
		  			break;
		  		}	
		  	}
		  	void Salida(){
		  		txtS.setText("Importe a pagar:"+impPago);
                Imprimir("");
                Imprimir("Importe Total recaudado");
                Imprimir("Por licencia de cobre"+TRecaudado0);
                Imprimir("por licencia de bronze"+TRecaudado1);
                Imprimir("por licencia de silver"+TRecaudado2);
                Imprimir("por licencia de gold"+TRecaudado3);
                Imprimir("");
                Imprimir("Cantidad de licenica vendidao");
                Imprimir("Por licencia de cobre"+canLice0);
                Imprimir("por licencia de bronze"+canLice1);
                Imprimir("por licencia de silver"+canLice2);
                Imprimir("por licencia de gold"+canLice3);
                Imprimir("");
                Imprimir("Cantidad de ventas efectudadas");
                Imprimir("Por licencia de cobre"+CanVent0);
                Imprimir("por licencia de bronze"+CanVent1);
                Imprimir("por licencia de silver"+CanVent2);
                Imprimir("por licencia de gold"+CanVent3);
                Imprimir("");
               
		  		
		  		
		  	}
		  	
		  	void Imprimir(String ss) {
		  		txtS.append(ss+"\n");
		  		
		  		
		  	}
			/////////////////////////////////////////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				
				
				
				EntradaCantidad();
				EntradaLicencia();
				impPago=ProcesoImpPAgo(can);
				
				
				COntador();
				
				Salida();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnProcesar.setBounds(402, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(402, 32, 89, 23);
		contentPane.add(btnBorrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 481, 467);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		txtS = new JTextArea();
		scrollPane_1.setViewportView(txtS);
	}
}
