import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_inicio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnListaDeEjercicios;
	private JMenuItem mntmEjercicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_inicio frame = new Menu_inicio();
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
	public Menu_inicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 373);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnListaDeEjercicios = new JMenu("Lista de ejercicios");
		menuBar.add(mnListaDeEjercicios);
		
		mntmEjercicio = new JMenuItem("Ejercicio1");
		mntmEjercicio.addActionListener(this);
		mnListaDeEjercicios.add(mntmEjercicio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmEjercicio) {
			actionPerformedMntmEjercicio(arg0);
		}
	}
	protected void actionPerformedMntmEjercicio(ActionEvent arg0) {
		Ejercicio Abrir=new Ejercicio();
		Abrir.setVisible(true);
		
	}
}
