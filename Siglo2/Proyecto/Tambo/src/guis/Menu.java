package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento ");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ingreso");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingreso abrir=new Ingreso();
				abrir.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmProductos = new JMenuItem("Modificaci\u00F3n");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificacion abrir=new Modificacion();
				abrir.setVisible(true);
			}
		});
		mnNewMenu.add(mntmProductos);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consulta");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta abrir=new Consulta();
				abrir.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Eliminaci\u00F3n");
		mntmNewMenuItem_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminacion abrir=new Eliminacion();
				abrir.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_1_1_1 = new JMenuItem("Listado");
		mntmNewMenuItem_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listado abrir=new Listado();
				abrir.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1_1_1);
		
		JMenu mnMantenimieno = new JMenu("Ventas");
		menuBar.add(mnMantenimieno);
		
		JMenu mnAlmacn = new JMenu("Almac\u00E9n");
		menuBar.add(mnAlmacn);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
	}
}
