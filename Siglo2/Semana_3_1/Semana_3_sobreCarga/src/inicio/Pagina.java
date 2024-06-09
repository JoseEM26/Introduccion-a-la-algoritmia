package inicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.Factura;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Pagina extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagina frame = new Pagina();
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
	public Pagina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(158, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 414, 196);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Factura f1=new Factura("123124124124","Pioner",10,1000);
				  Factura f2=new Factura("999999999999","Nike");
				  Factura f3=new Factura();

				    Lista(f1);
				    Lista(f2);
				    Lista(f3);
				    imprimir("");
					imprimir("");
				    imprimir("Sunat Es:?"+"\t"+Factura.getSunat());
					imprimir("Suma Importe Tatal"+"\t"+Factura.getSumaImporteFac());
					imprimir("Contador:"+"\t"+Factura.getContador());
				
				
			}
			void imprimir(String s) {
				txtS.append(s+"\n");
			}
			
			void Lista(Factura x) {
				imprimir("");imprimir("");imprimir("");
				imprimir("Ruc"+"\t"+"\t"+x.getRuc());
				imprimir("Nombre Empresa"+"\t"+x.getEmpresa());
				imprimir("Cantidad"+"\t"+"\t"+x.getUnidades());
				imprimir("Precio"+"\t"+"\t"+x.getPrecioUnidad());
				imprimir("Precio"+"\t"+"\t"+x.GetImporteFacturado());
				
			}
		});
		
	}
}
