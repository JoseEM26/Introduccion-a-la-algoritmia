package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class vender extends JDialog implements ActionListener {
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cboModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;
	private int Contadorrr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			vender dialog = new vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public vender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 391);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 39, 67, 14);
		getContentPane().add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 64, 67, 14);
		getContentPane().add(lblCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalia"}));
		cboModelo.setBounds(77, 7, 149, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(77, 36, 149, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(77, 61, 149, 20);
		getContentPane().add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(323, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(323, 35, 89, 23);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 92, 392, 249);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		//Con esto sale automaticamente el precio con cada producto que selecione del combo
		int modelo=cboModelo.getSelectedIndex();
		switch(modelo) {
		case 0:
			txtPrecio.setText(""+Ceramicas.precio0);
		    break;
		case 1:
			txtPrecio.setText(""+Ceramicas.precio1);
		    break;
		case 2:
			txtPrecio.setText(""+Ceramicas.precio2);
		    break;
		case 3:
			txtPrecio.setText(""+Ceramicas.precio3);
		    break;
		case 4:
			txtPrecio.setText(""+Ceramicas.precio4);
		    break;
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////
	void Contador(String mod,int can,double ip) {
		switch(modelo) {
		case "Cinza Plus":
			Ceramicas.cantVendidas0++;
			Ceramicas.cantCajas0+=cantidad;
			Ceramicas.impAcumulado0+=impPagar;
		    break;
		case "Luxury":
			Ceramicas.cantVendidas1++;
			Ceramicas.cantCajas1+=cantidad;
			Ceramicas.impAcumulado1+=impPagar;
		    break;
		case "Austria":
			Ceramicas.cantVendidas2++;
			Ceramicas.cantCajas2+=cantidad;
			Ceramicas.impAcumulado2+=impPagar;
		    break;
		case "Yungay Mix":
			Ceramicas.cantVendidas3++;
			Ceramicas.cantCajas3+=cantidad;
			Ceramicas.impAcumulado3+=impPagar;
		    break;
		default:
			Ceramicas.cantVendidas4++;
			Ceramicas.cantCajas4+=cantidad;
			Ceramicas.impAcumulado4+=impPagar;
		    break;
		}
	}
	
	
	void Salida() {
		txtS.setText("BOlETA DE VENTA");
		imprimir("");
		imprimir("");
		imprimir("Modelo\t\t\t:"+cboModelo.getSelectedItem().toString());
		imprimir("Precio\t\t\t:"+txtPrecio.getText());
		imprimir("Cantidad Adquirida\t:"+txtCantidad.getText());
		imprimir("Importe de Compra\t:"+String.format("%,8.2f",impCompra));
		imprimir("Importe de Descuento\t:"+String.format("%,8.2f",Ceramicas.id));
		imprimir("Importe a Pagar\t\t:"+String.format("%,8.2f",impPagar));
		imprimir("Tipo de obsequio\t:"+Ceramicas.tipoObsequio);
		imprimir("Unidad Adquirida\t:"+obsequio);
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	protected void actionPerformedBtnVender(ActionEvent e) {
       
		//Entrada
		modelo=cboModelo.getSelectedItem().toString();
		cantidad=Integer.parseInt(txtCantidad.getText());
		
		//Proceso Importe de compra
		switch (modelo) {
		case "Cinza Plus":
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	        break;
		case "Luxury":
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	        break;
		case "Austria":
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	        break;
		case "Yungay Mix":
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	        break;
		default:
			impCompra=cantidad*Double.parseDouble(txtPrecio.getText());
	        break;
		}
		
		//Proceso del Descuento
		switch(cantidad) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			Ceramicas.id=impCompra*(Ceramicas.porcentaje1/100);
			break;
		case 6: 
		case 7: 
		case 8: 
		case 9: 
		case 10: 
			Ceramicas.id=impCompra*(Ceramicas.porcentaje2/100);
			break;	
		case 11: 
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			Ceramicas.id=impCompra*(Ceramicas.porcentaje3/100);
			break;
			
		default:
			Ceramicas.id=impCompra*(Ceramicas.porcentaje4/100);
			break;
			
		}
		
       //obseequio
		switch(cantidad) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			obsequio=Ceramicas.obsequioCantidad1;
			break;
		case 6: 
		case 7: 
		case 8: 
		case 9: 
		case 10: 
			obsequio=Ceramicas.obsequioCantidad2;
			break;
			
		default:
			obsequio=Ceramicas.obsequioCantidad3;
			break;
		
		}
		impPagar=impCompra-Ceramicas.id;
		
		Contador(modelo, cantidad, impPagar);
		Ceramicas.can=cantidad;
		Salida();
		
		
//Comparacion de dos precios 3caso de GenReport
		switch(modelo) {
		case "Cinza Plus":
			if(Ceramicas.cantidadOptima==Ceramicas.cantCajas0) 
				Ceramicas.Cprcn1="Son iguales";
			
			else if(Ceramicas.cantidadOptima>Ceramicas.cantCajas0) 
				Ceramicas.Cprcn1=(Ceramicas.cantidadOptima-Ceramicas.cantCajas0+" menos que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima<Ceramicas.cantCajas0)
				Ceramicas.Cprcn1=(Ceramicas.cantCajas0-Ceramicas.cantidadOptima+" más que la cantidad óptima");
			
			break;	
		case "Luxury":
			if(Ceramicas.cantidadOptima==Ceramicas.cantCajas1)
				Ceramicas.Cprcn2=("igual que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima>Ceramicas.cantCajas1)
				Ceramicas.Cprcn2=(Ceramicas.cantidadOptima-Ceramicas.cantCajas1+" menos que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima<Ceramicas.cantCajas1)
				Ceramicas.Cprcn2=(Ceramicas.cantCajas1-Ceramicas.cantidadOptima+" más que la cantidad óptima");
			break;
			
		case "Austria":
			if(Ceramicas.cantidadOptima==Ceramicas.cantCajas2) 
				Ceramicas.Cprcn3=("igual que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima>Ceramicas.cantCajas2) 
				Ceramicas.Cprcn3=(Ceramicas.cantidadOptima-Ceramicas.cantCajas2+" menos que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima<Ceramicas.cantCajas2)
				Ceramicas.Cprcn3=(Ceramicas.cantCajas2-Ceramicas.cantidadOptima+" más que la cantidad óptima");
			break;
			
		case "Yungay Mix":
			if(Ceramicas.cantidadOptima==Ceramicas.cantCajas3) 
				Ceramicas.Cprcn4=("igual que la cantidad óptima");
			else if(Ceramicas.cantidadOptima>Ceramicas.cantCajas3) 
				Ceramicas.Cprcn4=(Ceramicas.cantidadOptima-Ceramicas.cantCajas3+" menos que la cantidad óptima");
			else if(Ceramicas.cantidadOptima<Ceramicas.cantCajas3)
				Ceramicas.Cprcn4=(Ceramicas.cantCajas3-Ceramicas.cantidadOptima+" más que la cantidad óptima");
			break;
		default:
			if(Ceramicas.cantidadOptima==Ceramicas.cantCajas4) 
				Ceramicas.Cprcn5=("igual que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima>Ceramicas.cantCajas4) 
				Ceramicas.Cprcn5=(Ceramicas.cantidadOptima-Ceramicas.cantCajas4+" menos que la cantidad óptima");
			
			else if(Ceramicas.cantidadOptima<Ceramicas.cantCajas4)
				Ceramicas.Cprcn5=(Ceramicas.cantCajas4-Ceramicas.cantidadOptima+" más que la cantidad óptima");
			
			break;
		
		}
		
		switch(modelo) {
		case "Cinza Plus":
			Ceramicas.ic0=impCompra;
			break;
		case "Luxury":
			Ceramicas.ic1=impCompra;
			break;
		case "Austria":
			Ceramicas.ic2=impCompra;
			break;
		case "Yungay Mix":
			Ceramicas.ic3=impCompra;
			break;	
		default:
			Ceramicas.ic4=impCompra;
			break;
		}
		switch(modelo) {
		case "Cinza Plus":
			Ceramicas.ip0=impPagar;
			break;
		case "Luxury":
			Ceramicas.ip1=impPagar;
			break;
		case "Austria":
			Ceramicas.ip2=impPagar;
			break;
		case "Yungay Mix":
			Ceramicas.ip3=impPagar;
			break;	
		default:
			Ceramicas.ip4=impPagar;
			break;
		}
		//VEntana de notificacion cada 5 ventas
		acumulado+=impPagar;
		contador++;
		if(contador % 5==0) {
			JOptionPane.showMessageDialog(vender.this,
			"Ventana Nro°5\n"
			+"Importe Total general Acumulado:S/. "+acumulado+"\n"
			+"Porcentaje de la cuota Diaria:"+String.format("%.2f%%",(acumulado/Ceramicas.cuotaDiaria)*100)+"%",
					
					"Avence de ventana"
					,JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void imprimir(String ss){
		txtS.append(ss+"\n");
	}
	int cantidad,obsequio,contador,acumulado;
    double impCompra,impPagar;
	String modelo;
	
	
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		setVisible(false);
	}
}
