package Guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
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
		
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Productos");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dlg_Productos Abrir=new Dlg_Productos();
				Abrir.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Clientes");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				actionPerformedMntmCliente(e);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMnVentas(e);
			}
		});
		menuBar.add(mnVentas);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("ventas");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmNewMenuItem_2(e);
			}
		});
		mnVentas.add(mntmNewMenuItem_2);
		
		JMenu mnAlmacen = new JMenu("Almacen");
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Almacen");
		mntmNewMenuItem_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmNewMenuItem_2_1(e);
			}
		});
		mnAlmacen.add(mntmNewMenuItem_2_1);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
	}
	protected void actionPerformedMnVentas(ActionEvent e) {
		
	}
	protected void actionPerformedMntmCliente(ActionEvent e) {
		Dlg_Clientes clientes=new Dlg_Clientes();
		clientes.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		Dlg_Ventas ventas=new Dlg_Ventas();
		ventas.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_2_1(ActionEvent e) {
		Dlg_Almacen almacen =new Dlg_Almacen();
		almacen.setVisible(true);
	}
}
