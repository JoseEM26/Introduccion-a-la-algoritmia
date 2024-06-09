package ArrayList;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Objetos.ArregloAlumnos;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Listado extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnLista;
	private JButton btnReportes;
	private JScrollPane scrollPane;
	private JTable tbtTabla;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;
	private DefaultTableModel modelo;
	
	ArregloAlumnos aa= new ArregloAlumnos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listado frame = new Listado();
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
	public Listado() {
		setTitle("Ejercicio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLista = new JButton("Lista");
		btnLista.addActionListener(this);
		btnLista.setBounds(107, 11, 89, 23);
		contentPane.add(btnLista);
		
		btnReportes = new JButton("Reportes");
		btnReportes.addActionListener(this);
		btnReportes.setBounds(244, 11, 89, 23);
		contentPane.add(btnReportes);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 424, 159);
		contentPane.add(scrollPane);
		
		tbtTabla = new JTable();
		tbtTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tbtTabla);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("Nota1");
		modelo.addColumn("Nota2");
		modelo.addColumn("Promedio");
		tbtTabla.setModel(modelo);
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 216, 424, 155);
		contentPane.add(scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportes) {
			actionPerformedBtnReportes(arg0);
		}
		if (arg0.getSource() == btnLista) {
			actionPerformedBtnLista(arg0);
		}
	}
	protected void actionPerformedBtnLista(ActionEvent arg0) {
		modelo.setRowCount(0);
		for(int i=0;i<aa.tamaño();i++){
			Object[] fila={
				aa.obtener(i).getCodigo(),
				aa.obtener(i).getNombre(),
				aa.obtener(i).getNota1(),
				aa.obtener(i).getNota2(),
				aa.obtener(i).promedio()
			};
			modelo.addRow(fila);
		}
	}
	protected void actionPerformedBtnReportes(ActionEvent arg0) {
		textArea.setText("");
		imprimir("Cantidad de alumnos: "+aa.tamaño());
		imprimir("Promedio general: "+aa.promedioGeneral());
	}
	
	void imprimir(String s){
		textArea.append(s+"\n");
	}
	
}
