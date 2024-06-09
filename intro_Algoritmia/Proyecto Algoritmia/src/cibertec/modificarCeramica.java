package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class modificarCeramica extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox cboModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			modificarCeramica dialog = new modificarCeramica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modificarCeramica() {
		setTitle("Modificar Ceramica");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 87, 14);
		contentPanel.add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 49, 87, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 91, 87, 14);
		contentPanel.add(lblAncho);
		
		JLabel lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 131, 87, 14);
		contentPanel.add(lblLargo);
		
		JLabel lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 174, 87, 14);
		contentPanel.add(lblEspesor);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 218, 87, 14);
		contentPanel.add(lblContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(107, 46, 218, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa\t"}));
		cboModelo.addActionListener(this);
		cboModelo.setBounds(107, 7, 218, 22);
		contentPanel.add(cboModelo);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(107, 88, 218, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(107, 128, 218, 20);
		contentPanel.add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(107, 171, 218, 20);
		contentPanel.add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setColumns(10);
		txtContenido.setBounds(107, 215, 218, 20);
		contentPanel.add(txtContenido);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		int modelo=cboModelo.getSelectedIndex();
		
		switch(modelo) {
		case 0:
			Ceramicas.precio0= Double.parseDouble(txtPrecio.getText());
		    Ceramicas.ancho0=Double.parseDouble(txtAncho.getText());
		    Ceramicas.largo0=Double.parseDouble(txtLargo.getText());
		    Ceramicas.espesor0=Double.parseDouble(txtEspesor.getText());
		    Ceramicas.contenido0=Integer.parseInt(txtContenido.getText());
		    break;
		case 1:
			Ceramicas.precio1= Double.parseDouble(txtPrecio.getText());
		    Ceramicas.ancho1=Double.parseDouble(txtAncho.getText());
		    Ceramicas.largo1=Double.parseDouble(txtLargo.getText());
		    Ceramicas.espesor1=Double.parseDouble(txtEspesor.getText());
		    Ceramicas.contenido1=Integer.parseInt(txtContenido.getText());
		    break;
		case 2:
			Ceramicas.precio2= Double.parseDouble(txtPrecio.getText());
		    Ceramicas.ancho2=Double.parseDouble(txtAncho.getText());
		    Ceramicas.largo2=Double.parseDouble(txtLargo.getText());
		    Ceramicas.espesor2=Double.parseDouble(txtEspesor.getText());
		    Ceramicas.contenido2=Integer.parseInt(txtContenido.getText());
		    break;
		case 3:
			Ceramicas.precio3= Double.parseDouble(txtPrecio.getText());
		    Ceramicas.ancho3=Double.parseDouble(txtAncho.getText());
		    Ceramicas.largo3=Double.parseDouble(txtLargo.getText());
		    Ceramicas.espesor3=Double.parseDouble(txtEspesor.getText());
		    Ceramicas.contenido3=Integer.parseInt(txtContenido.getText());
		    break;   
		default:
			Ceramicas.precio4= Double.parseDouble(txtPrecio.getText());
		    Ceramicas.ancho4=Double.parseDouble(txtAncho.getText());
		    Ceramicas.largo4=Double.parseDouble(txtLargo.getText());
		    Ceramicas.espesor4=Double.parseDouble(txtEspesor.getText());
		    Ceramicas.contenido4=Integer.parseInt(txtContenido.getText());
		    break;  
		
		
		
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnGrabar.setBounds(335, 45, 89, 23);
		contentPanel.add(btnGrabar);
		
			
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		int valor=cboModelo.getSelectedIndex();
		switch(valor) {
		case 0:
			txtPrecio.setText(""+Ceramicas.precio0);
			txtLargo.setText(""+Ceramicas.largo0);
			txtEspesor.setText(""+Ceramicas.espesor0);
			txtContenido.setText(""+Ceramicas.contenido0);
			txtAncho.setText(""+Ceramicas.ancho0);
			break;
			
		case 1:
			txtPrecio.setText(""+Ceramicas.precio1);
			txtLargo.setText(""+Ceramicas.largo1);
			txtEspesor.setText(""+Ceramicas.espesor1);
			txtContenido.setText(""+Ceramicas.contenido1);
			txtAncho.setText(""+Ceramicas.ancho1);
			break;
			
		case 2:
			txtPrecio.setText(""+Ceramicas.precio2);
			txtLargo.setText(""+Ceramicas.largo2);
			txtEspesor.setText(""+Ceramicas.espesor2);
			txtContenido.setText(""+Ceramicas.contenido2);
			txtAncho.setText(""+Ceramicas.ancho2);
			break;
			
		case 3:
			txtPrecio.setText(""+Ceramicas.precio3);
			txtLargo.setText(""+Ceramicas.largo3);
			txtEspesor.setText(""+Ceramicas.espesor3);
			txtContenido.setText(""+Ceramicas.contenido3);
			txtAncho.setText(""+Ceramicas.ancho3);
			break;	
		
		case 4:
			txtPrecio.setText(""+Ceramicas.precio4);
			txtLargo.setText(""+Ceramicas.largo4);
			txtEspesor.setText(""+Ceramicas.espesor4);
			txtContenido.setText(""+Ceramicas.contenido4);
			txtAncho.setText(""+Ceramicas.ancho4);
			break;
		}	
}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		setVisible(false);
	}
}