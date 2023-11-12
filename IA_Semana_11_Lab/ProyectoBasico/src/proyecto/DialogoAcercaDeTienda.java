package proyecto;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DialogoAcercaDeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda;
	private JButton btnCerrar;
	private JLabel lblAutor;
	private JLabel lblA�o;
	private JLabel lblLimaPeru;
	private JLabel lblMascotas;

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
		try {
			DialogoAcercaDeTienda dialog = new DialogoAcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAcercaDeTienda() {
		setResizable(false);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 460, 243);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTienda.setBounds(186, 11, 72, 17);
		contentPanel.add(lblTienda);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(177, 171, 89, 23);
		contentPanel.add(btnCerrar);

		lblAutor = new JLabel("Hecho por Laura, D�bora, Raquel y S�fora");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutor.setBounds(107, 53, 230, 15);
		contentPanel.add(lblAutor);

		lblA�o = new JLabel("2020");
		lblA�o.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblA�o.setBounds(208, 104, 28, 15);
		contentPanel.add(lblA�o);

		lblLimaPeru = new JLabel("Lima, Per\u00FA");
		lblLimaPeru.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLimaPeru.setBounds(193, 130, 57, 15);
		contentPanel.add(lblLimaPeru);
		
		lblMascotas = new JLabel("Luca y Paris");
		lblMascotas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMascotas.setBounds(190, 79, 63, 15);
		contentPanel.add(lblMascotas);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
