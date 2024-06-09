package menu2;

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

public class menu_inicio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnListaDeEjercicios;
	private JMenuItem mntmEjercicio;
	private JMenuItem mntmEjercicio_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_inicio frame = new menu_inicio();
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
	public menu_inicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnListaDeEjercicios = new JMenu("Lista de ejercicios");
		menuBar.add(mnListaDeEjercicios);
		
		mntmEjercicio = new JMenuItem("Ejercicio1");
		mntmEjercicio.addActionListener(this);
		mnListaDeEjercicios.add(mntmEjercicio);
		
		mntmEjercicio_1 = new JMenuItem("Ejercicio2");
		mntmEjercicio_1.addActionListener(this);
		mnListaDeEjercicios.add(mntmEjercicio_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmEjercicio_1) {
			actionPerformedMntmEjercicio_1(arg0);
		}
		if (arg0.getSource() == mntmEjercicio) {
			actionPerformedMntmEjercicio(arg0);
		}
	}
	protected void actionPerformedMntmEjercicio(ActionEvent arg0) {
		Ejercicio1 Abrir=new Ejercicio1();
		Abrir.setVisible(true);
	}
	protected void actionPerformedMntmEjercicio_1(ActionEvent arg0) {
		Ejercicio2 Abrir=new Ejercicio2();
		Abrir.setVisible(true);
	}
}
