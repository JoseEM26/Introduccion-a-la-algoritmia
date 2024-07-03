package Listado;

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

public class menu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnListadoDeProgramas;
	private JMenuItem mntmPrograma;
	private JMenuItem mntmPrograma_1;
	private JMenuItem mntmPrograma_2;
	private JMenuItem mntmPrograma_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnListadoDeProgramas = new JMenu("Listado de Programas");
		menuBar.add(mnListadoDeProgramas);
		
		mntmPrograma = new JMenuItem("Programa1");
		mntmPrograma.addActionListener(this);
		mnListadoDeProgramas.add(mntmPrograma);
		
		mntmPrograma_1 = new JMenuItem("Programa2");
		mntmPrograma_1.addActionListener(this);
		mnListadoDeProgramas.add(mntmPrograma_1);
		
		mntmPrograma_2 = new JMenuItem("Programa3");
		mntmPrograma_2.addActionListener(this);
		mnListadoDeProgramas.add(mntmPrograma_2);
		
		mntmPrograma_3 = new JMenuItem("Programa4");
		mntmPrograma_3.addActionListener(this);
		mnListadoDeProgramas.add(mntmPrograma_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmPrograma_3) {
			actionPerformedMntmPrograma_3(arg0);
		}
		if (arg0.getSource() == mntmPrograma_2) {
			actionPerformedMntmPrograma_2(arg0);
		}
		if (arg0.getSource() == mntmPrograma_1) {
			actionPerformedMntmPrograma_1(arg0);
		}
		if (arg0.getSource() == mntmPrograma) {
			actionPerformedMntmPrograma(arg0);
		}
	}
	protected void actionPerformedMntmPrograma(ActionEvent arg0) {
		programa1 Abrir=new programa1();
		Abrir.setVisible(true);
	}
	protected void actionPerformedMntmPrograma_1(ActionEvent arg0) {
		programa2 Abrir=new programa2();
		Abrir.setVisible(true);
		
	}
	protected void actionPerformedMntmPrograma_2(ActionEvent arg0) {
		programa3 Abrir=new programa3();
		Abrir.setVisible(true);
	}
	protected void actionPerformedMntmPrograma_3(ActionEvent arg0) {
		programa4 Abrir=new programa4();
		Abrir.setVisible(true);
	}
}
