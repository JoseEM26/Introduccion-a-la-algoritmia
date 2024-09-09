package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listarCeramicas extends JDialog implements ActionListener {
	private JButton btnListar;
	private JButton btnCerrar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			listarCeramicas dialog = new listarCeramicas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public listarCeramicas() {
		setTitle("Listar Ceramica");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(234, 232, 89, 23);
		getContentPane().add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(96, 232, 89, 23);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 210);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	
	void Imprimir(String ss){
		txtS.append(ss+"\n");
	}
	void salida() {
		txtS.setText("LISTADO DE CERAMICOS");
		Imprimir("");
		Imprimir("");
		Imprimir("Modelo\t: "+Ceramicas.modelo0);
		Imprimir("Precio\t: "+Ceramicas.precio0);
		Imprimir("Ancho(cm)\t :"+Ceramicas.ancho0);
		Imprimir("largo(cm)\t :"+Ceramicas.largo0);
		Imprimir("Espesor(cm)\t :"+Ceramicas.espesor0);
		Imprimir("Contenido\t :"+Ceramicas.contenido0);
		Imprimir("");
		Imprimir("Modelo\t :"+Ceramicas.modelo1);
		Imprimir("Precio\t :"+Ceramicas.precio1);
		Imprimir("Ancho(cm)\t :"+Ceramicas.ancho1);
		Imprimir("largo(cm)\t :"+Ceramicas.largo1);
		Imprimir("Espesor(cm)\t :"+Ceramicas.espesor1);
		Imprimir("Contenido\t :"+Ceramicas.contenido1);
		Imprimir("");
		Imprimir("Modelo\t :"+Ceramicas.modelo2);
		Imprimir("Precio\t :"+Ceramicas.precio2);
		Imprimir("Ancho(cm)\t :"+Ceramicas.ancho2);
		Imprimir("largo(cm)\t :"+Ceramicas.largo2);
		Imprimir("Espesor(cm)\t :"+Ceramicas.espesor2);
		Imprimir("Contenido\t :"+Ceramicas.contenido2);
		Imprimir("");
		Imprimir("Modelo\t :"+Ceramicas.modelo3);
		Imprimir("Precio\t :"+Ceramicas.precio3);
		Imprimir("Ancho(cm)\t :"+Ceramicas.ancho3);
		Imprimir("largo(cm)\t :"+Ceramicas.largo3);
		Imprimir("Espesor(cm)\t :"+Ceramicas.espesor3);
		Imprimir("Contenido\t :"+Ceramicas.contenido3);
		Imprimir("");
		Imprimir("Modelo\t :"+Ceramicas.modelo4);
		Imprimir("Precio\t :"+Ceramicas.precio4);
		Imprimir("Ancho(cm)\t :"+Ceramicas.ancho4);
		Imprimir("largo(cm)\t :"+Ceramicas.largo4);
		Imprimir("Espesor(cm)\t :"+Ceramicas.espesor4);
		Imprimir("Contenido\t :"+Ceramicas.contenido4);
		Imprimir("");
	
	}
	protected void actionPerformedBtnListar(ActionEvent e) {	
		salida();
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		setVisible(false);
	}
}
