package semana4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Salarios extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JButton btnEliminar;
	private JLabel lblCategoria;
	private JLabel lblHoras;
	private JTextField txtHoras;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox cmbCategorias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salarios frame = new Salarios();
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
	public Salarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 45, 89, 23);
		contentPane.add(btnEliminar);
		
		lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 15, 46, 14);
		contentPane.add(lblCategoria);
		
		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(20, 49, 46, 14);
		contentPane.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(85, 46, 86, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 87, 359, 163);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		cmbCategorias = new JComboBox();
		cmbCategorias.setModel(new DefaultComboBoxModel(new String[] {"C1", "C2", "C3", "C4"}));
		cmbCategorias.setBounds(86, 11, 122, 22);
		contentPane.add(cmbCategorias);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	//determinacion de variables
		 int  categorias;
	     double TarifaHora = 0,SuelBruto,Descuento,SueldoNeto,HoraTrab;
	     
     //Entrada
	     HoraTrab = Integer.parseInt(txtHoras.getText());
	     categorias = cmbCategorias.getSelectedIndex();
	     
	 //Proceso
	  if (categorias == 0) 
		  TarifaHora = 45.0;
	  
	  if (categorias == 1) 
		  TarifaHora = 37.5;
	  
	  if (categorias == 2) 
		  TarifaHora=35.0;
	  
	  if (categorias == 3) 
		  TarifaHora = 32.5;
	
	     SuelBruto = HoraTrab*TarifaHora;
	    Descuento = SuelBruto*0.15;
	    SueldoNeto = SuelBruto-Descuento;
	    
	   //Salida
	    txtS.setText("Tarifa horaria : S/." + HoraTrab + "\n");
	    txtS.append ("Sueldo bruto : S/." + SuelBruto + "\n");
	    txtS.append ("Descuento : S/." + Descuento + "\n");
	    txtS.append ("Sueldo neto : S/." + SueldoNeto);

	    
	     
	    
	     
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
