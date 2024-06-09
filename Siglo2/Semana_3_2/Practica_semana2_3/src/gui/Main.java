package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import codigo.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
    
	DefaultTableModel modelo=new DefaultTableModel();
	ArregloFacturas fac=new ArregloFacturas();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 424, 69);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 414, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		modelo.addColumn("Numero");
		modelo.addColumn("Empresa");
		modelo.addColumn("Ruc");
		modelo.addColumn("Unidades");
		modelo.addColumn("PrecioUnidad");
		modelo.addColumn("Importe Compra");
        table.setModel(modelo);		
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(20, 261, 404, 251);
        contentPane.add(scrollPane_1);
        
        JTextArea txtS = new JTextArea();
        scrollPane_1.setViewportView(txtS);

		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				modelo.setRowCount(0);
				
				for(int i=0;i<fac.Tamaño();i++) {
					int contador=i;
					Object[] fila={
						contador+1,
						fac.Obtener(i).getEmpresa(),
						fac.Obtener(i).getRuc(),
						fac.Obtener(i).getUnidades(),
						fac.Obtener(i).getPrecioUnitario(),
						fac.Obtener(i).ImporteFactura(),
					};
					modelo.addRow(fila);
				}
				
				Listado();
				Imprimir("");
				Imprimir("");
				Imprimir("");
				Imprimir("Suma de todos los importeFac"+fac.SumaImporte());
				Imprimir("Importe Promedii"+fac.PromedioFac());
				Imprimir("Importe Menor"+fac.MenorImporte());
				Imprimir("Importe May"+fac.MayorImporte());
				
				
				
				
				
				
				
			}
			
			public void Imprimir(String s) {
				txtS.append(s+"\n");
			}
			public void Listado() {
			    for(int i=0;i<fac.Tamaño();i++) {
					Imprimir("");
					Imprimir("");
					Imprimir("");
					Imprimir(""+(i+1));
					Imprimir("");

			    	Imprimir(fac.Obtener(i).getEmpresa());
			    	Imprimir(fac.Obtener(i).getRuc());
			    	Imprimir(""+fac.Obtener(i).getUnidades());
			    	Imprimir(""+fac.Obtener(i).getPrecioUnitario());
			    	Imprimir(""+fac.Obtener(i).ImporteFactura());
			    }
			
			    
		   
			}
		});
		}
}
