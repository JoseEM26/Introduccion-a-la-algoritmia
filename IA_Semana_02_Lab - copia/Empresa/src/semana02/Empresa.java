package semana02;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Empresa extends JFrame implements ActionListener {

	private static final long serialVersionUID = 5217119794648260040L;
	private JPanel contentPane;
	private JLabel lblRazonSocial;
	private JLabel lblNumeroEmpleados;
	private JLabel lblUtilidadAnual;
	private JTextField txtRazonSocial;
	private JTextField txtNumeroEmpleados;
	private JTextField txtUtilidadAnual;
	private JScrollPane scpScroll;
	private JTextArea txtS;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa frame = new Empresa();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Empresa() {
		setTitle("Empresa");
		setBounds(new Rectangle(100, 100, 450, 290));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblRazonSocial = new JLabel("Raz\u00F3n social");
		lblRazonSocial.setBounds(10, 11, 106, 14);
		contentPane.add(lblRazonSocial);

		lblNumeroEmpleados = new JLabel("N\u00FAmero de empleados");
		lblNumeroEmpleados.setBounds(10, 36, 106, 14);
		contentPane.add(lblNumeroEmpleados);

		lblUtilidadAnual = new JLabel("Utilidad anual");
		lblUtilidadAnual.setBounds(10, 61, 106, 14);
		contentPane.add(lblUtilidadAnual);

		txtRazonSocial = new JTextField();
		txtRazonSocial.setBounds(126, 8, 135, 20);
		contentPane.add(txtRazonSocial);
		txtRazonSocial.setColumns(10);

		txtNumeroEmpleados = new JTextField();
		txtNumeroEmpleados.setBounds(126, 33, 135, 20);
		contentPane.add(txtNumeroEmpleados);
		txtNumeroEmpleados.setColumns(10);

		txtUtilidadAnual = new JTextField();
		txtUtilidadAnual.setBounds(126, 58, 135, 20);
		contentPane.add(txtUtilidadAnual);
		txtUtilidadAnual.setColumns(10);

		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 86, 414, 156);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		// 1. Declarar la Variable
		String razonZocial;
		int numEmpleados;
		double utiAnual;
		
		// 2. Lectura de Datos
		razonZocial = txtNumeroEmpleados.getText();
		numEmpleados = Integer.parseInt(txtNumeroEmpleados.getText());
		utiAnual = Double.parseDouble(txtUtilidadAnual.getText());
		
		// 3. Proceso : no hay
		
		// 4. Salida de Informaci�n
		txtS.setText("DATOS INGRESADOS\n\n");
		txtS.append("Raz�n Social\t\t: " + razonZocial + "\n");
		txtS.append("N�mero de Empleados\t: " + numEmpleados + "\n");
		txtS.append("Utilidad Anual S/.\t: " + utiAnual);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
