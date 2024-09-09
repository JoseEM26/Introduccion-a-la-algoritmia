package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class consultaCeramica extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox cbmModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			consultaCeramica dialog = new consultaCeramica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public consultaCeramica() {
		setTitle("Consultar Ceramica");
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
		
		cbmModelo = new JComboBox();
		cbmModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa\t"}));
		cbmModelo.addActionListener(this);
		cbmModelo.setBounds(107, 7, 203, 22);
		contentPanel.add(cbmModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(107, 46, 203, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(107, 88, 203, 20);
		contentPanel.add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(107, 128, 203, 20);
		contentPanel.add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(107, 171, 203, 20);
		contentPanel.add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBounds(107, 215, 203, 20);
		contentPanel.add(txtContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == cbmModelo) {
			actionPerformedCbmModelo(e);
		}
	}
	
	protected void actionPerformedCbmModelo(ActionEvent e) {
		

		int valor=cbmModelo.getSelectedIndex();
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
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		setVisible(false);
	}
}
