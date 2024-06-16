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
import javax.swing.table.DefaultTableModel;
import codigo.*;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo=new DefaultTableModel();
	
    ArregloDocente doc=new ArregloDocente();

	/**
	 dsa
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
		setBounds(100, 100, 859, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Botoncito");
		btnNewButton.setBounds(10, 11, 823, 52);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 74, 823, 355);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		/////////////////////////////////////////////////////////////////////
		modelo.addColumn("codigo");
		modelo.addColumn("nombre");
		modelo.addColumn("Hora");
		modelo.addColumn("Tarifa");
		modelo.addColumn("S.Promedio");
		modelo.addColumn("S.Mayor");
		modelo.addColumn("S.Menos");
		modelo.addColumn("T.Mayor");
		modelo.addColumn("T.Menor");

		table.setModel(modelo);
		
		
		
		
		/////////////////////////////////////////////////////////////////////
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.setRowCount(0);
				
				for(int i=0;i<doc.Tamaño();i++) {
					Object[]  fila= {
							doc.Obtener(i).getCodigo(),
							doc.Obtener(i).getHoras(),
							doc.Obtener(i).getNombre(),
							doc.Obtener(i).getTarifa(),
							doc.Obtener(i).Sueldo(),
							doc.sueldoPromedio(),
							doc.SueldoMayor(),
							doc.SueldoMenor(),
							doc.TarifaMayor(),
							doc.TarifaMenor(),
					};
					modelo.addRow(fila);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		
	}
}
