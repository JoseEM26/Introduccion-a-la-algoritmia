package Ceramica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;

public class ConsultarCeramica extends JDialog {
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnCerrar;
	private JComboBox cmbModelo;
	private Menu parentFrame;

	    public ConsultarCeramica(Menu parentFrame) {  
	        this.parentFrame = parentFrame;  
	    }
	   
	
	/**
	 * Launch the application.
	 */
	    
	    double pre = Menu.precio0;
	   	 double pre2 = Menu.ancho0;
	   	 double pre3 = Menu.largo0;
	   	 double pre4 = Menu.espesor0; 
	   	int pre5 = Menu.contenido0; 
	   	 
	   	String po1 = String.valueOf(pre);
	   	String po2 = String.valueOf(pre2);
	   	String po3 = String.valueOf(pre3);
	   	String po4 = String.valueOf(pre4);
	   	String po5 = String.valueOf(pre5);
	    
	public static void main(String[] args) {
		try {
			ConsultarCeramica dialog = new ConsultarCeramica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarCeramica() {
		setBackground(new Color(0, 255, 255));
		getContentPane().setBackground(new Color(152, 251, 152));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto Algoritmia Ceramica\\img\\losas.png"));
		setTitle("Consultar Ceramico");
		setBounds(100, 100, 438, 214);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 21, 99, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 46, 99, 14);
		getContentPane().add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 71, 81, 14);
		getContentPane().add(lblAncho);
		
		JLabel lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 96, 81, 14);
		getContentPane().add(lblLargo);
		
		JLabel lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 121, 81, 14);
		getContentPane().add(lblEspesor);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 146, 81, 14);
		getContentPane().add(lblContenido);
		
		cmbModelo = new JComboBox();
		cmbModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cmbModelo.setBounds(135, 17, 172, 22);
		getContentPane().add(cmbModelo);
		cmbModelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String modeloSeleccionado = cmbModelo.getSelectedItem().toString();
                String precio ;
                String ancho ;
                String largo ;
                String espesor ;
                String contenido ;
                
                
                switch (modeloSeleccionado) {
                    case "Cinza Plus":
                        precio = String.valueOf(parentFrame.precio0);
                        ancho = String.valueOf(parentFrame.ancho0);
                        largo = String.valueOf(parentFrame.largo0);
                        espesor = String.valueOf(parentFrame.espesor0);
                        contenido = String.valueOf(parentFrame.contenido0);

                        txtPrecio.setText(precio);
                        txtAncho.setText(ancho);
                        txtLargo.setText(largo);
                        txtEspesor.setText(espesor);
                        txtContenido.setText(contenido);
                        
                        break;
                        
                        
                    case "Luxury":
                        precio = String.valueOf(parentFrame.precio1);
                        ancho = String.valueOf(parentFrame.ancho1);
                        largo = String.valueOf(parentFrame.largo1);
                        espesor = String.valueOf(parentFrame.espesor1);
                        contenido = String.valueOf(parentFrame.contenido1);

                        txtPrecio.setText(precio);
                        txtAncho.setText(ancho);
                        txtLargo.setText(largo);
                        txtEspesor.setText(espesor);
                        txtContenido.setText(contenido);
                        
                        break;
                        
                        
                    case "Austria":
                        precio = String.valueOf(parentFrame.precio2);
                        ancho = String.valueOf(parentFrame.ancho2);
                        largo = String.valueOf(parentFrame.largo2);
                        espesor = String.valueOf(parentFrame.espesor2);
                        contenido = String.valueOf(parentFrame.contenido2);

                        txtPrecio.setText(precio);
                        txtAncho.setText(ancho);
                        txtLargo.setText(largo);
                        txtEspesor.setText(espesor);
                        txtContenido.setText(contenido);
                        
                        break;
                        
                        
                    case "Yungay Mix":
                        precio = String.valueOf(parentFrame.precio3);
                        ancho = String.valueOf(parentFrame.ancho3);
                        largo = String.valueOf(parentFrame.largo3);
                        espesor = String.valueOf(parentFrame.espesor3);
                        contenido = String.valueOf(parentFrame.contenido3);

                        txtPrecio.setText(precio);
                        txtAncho.setText(ancho);
                        txtLargo.setText(largo);
                        txtEspesor.setText(espesor);
                        txtContenido.setText(contenido);
                        
                        break;
                        
                        
                    case "Thalía":
                        precio = String.valueOf(parentFrame.precio4);
                        ancho = String.valueOf(parentFrame.ancho4);
                        largo = String.valueOf(parentFrame.largo4);
                        espesor = String.valueOf(parentFrame.espesor4);
                        contenido = String.valueOf(parentFrame.contenido4);

                        txtPrecio.setText(precio);
                        txtAncho.setText(ancho);
                        txtLargo.setText(largo);
                        txtEspesor.setText(espesor);
                        txtContenido.setText(contenido);
                        
                        break;
                  
                }
            }
        });
		
		
		txtPrecio = new JTextField();
		txtPrecio.setText(po1);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(135, 43, 172, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setText(po2);
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(135, 68, 172, 20);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setText(po3);
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(135, 93, 172, 20);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setText(po4);
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(135, 118, 172, 20);
		getContentPane().add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setText(po5);
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBounds(135, 143, 172, 20);
		getContentPane().add(txtContenido);
		
		
		btnCerrar = new JButton("Cerrar\r\n");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(317, 17, 89, 23);
		getContentPane().add(btnCerrar);
	}
}

