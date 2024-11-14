package princial;
import clases.LoginSistema;
import clases.Usuario;
import clases.RegistroUsuarios;
import javax.swing.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtDNIIngreso;
	private JPasswordField txtContraseñaIngreso;
	private JTextField txtDniRegistro;
	private JTextField txtNombreRegistro;
	private JTextField txtApellidoRegistro;
	private JTextField txtEspeciRegistro;
	private JPasswordField textField_2;
	private JPasswordField textField_3;
	private JTextField txtDniActua;
	private JTextField txtNomActua;
	private JTextField txtApeActua;
	private JTextField txtEspeciActua;
	private JPasswordField txtContraActua;
	private JPasswordField txtRepContraActua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(SystemColor.activeCaptionText);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(204, 255, 255));
		tabbedPane.setBounds(0, 0, 595, 355);
		contentPane.add(tabbedPane);
		
		JPanel panelIngreso = new JPanel();
		panelIngreso.setToolTipText("");
		panelIngreso.setBackground(new Color(204, 255, 153));
		tabbedPane.addTab("INGRESO", null, panelIngreso, null);
		panelIngreso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a SalusPro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(203, 11, 200, 14);
		panelIngreso.add(lblNewLabel);
		
		txtDNIIngreso = new JTextField();
		txtDNIIngreso.setColumns(10);
		txtDNIIngreso.setBounds(311, 95, 197, 20);
		panelIngreso.add(txtDNIIngreso);
		
		txtContraseñaIngreso = new JPasswordField();
		txtContraseñaIngreso.setColumns(10);
		txtContraseñaIngreso.setBounds(311, 138, 197, 20);
		panelIngreso.add(txtContraseñaIngreso);
		
		JLabel lblNewLabel_1 = new JLabel("DNI / CE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(69, 95, 88, 17);
		panelIngreso.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(69, 138, 106, 17);
		panelIngreso.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = txtDNIIngreso.getText();
		        String contraseña = txtContraseñaIngreso.getText();
		        
		        LoginSistema loginSistema = new LoginSistema(); 
		        boolean loginExitoso = loginSistema.autentificar(dni, contraseña); 
		        
		        if (loginExitoso) {
		           
		            JOptionPane.showMessageDialog(null, "Ingreso exitoso");
		            HospitalRebagliati h= new HospitalRebagliati();
		            h.setVisible(true);
		            
		            dispose();
		        } else {
		          
		            JOptionPane.showMessageDialog(null, "DNI o contraseña incorrectos");
		        }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setBounds(233, 208, 140, 43);
		panelIngreso.add(btnNewButton);
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(204, 255, 153));
		tabbedPane.addTab("REGISTRO", null, panelRegistro, null);
		panelRegistro.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Registro de Usuarios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(199, 11, 199, 19);
		panelRegistro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(115, 88, 146, 19);
		panelRegistro.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Apellido");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(115, 118, 146, 19);
		panelRegistro.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("DNI o CE");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(115, 57, 146, 19);
		panelRegistro.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Especialidad");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(115, 148, 146, 19);
		panelRegistro.add(lblNewLabel_3_1_1);
		
		txtDniRegistro = new JTextField();
		txtDniRegistro.setBounds(316, 58, 170, 20);
		panelRegistro.add(txtDniRegistro);
		txtDniRegistro.setColumns(10);
		
		txtNombreRegistro = new JTextField();
		txtNombreRegistro.setColumns(10);
		txtNombreRegistro.setBounds(316, 88, 170, 20);
		panelRegistro.add(txtNombreRegistro);
		
		txtApellidoRegistro = new JTextField();
		txtApellidoRegistro.setColumns(10);
		txtApellidoRegistro.setBounds(316, 118, 170, 20);
		panelRegistro.add(txtApellidoRegistro);
		
		txtEspeciRegistro = new JTextField();
		txtEspeciRegistro.setColumns(10);
		txtEspeciRegistro.setBounds(316, 148, 170, 20);
		panelRegistro.add(txtEspeciRegistro);
		
		JButton btnRegistrarUsu = new JButton("Registrar");
		btnRegistrarUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = txtDniRegistro.getText();
		        String nombre = txtNombreRegistro.getText();
		        String apellido = txtApellidoRegistro.getText();
		        String especialidad = txtEspeciRegistro.getText();
		        String contraseña = textField_2.getText();
		        String repContraseña = textField_3.getText();
		        if(contraseña.equals(repContraseña))
		        {
		        	RegistroUsuarios registro = new RegistroUsuarios();
		        	Usuario nuevoUsuario = new Usuario(dni, nombre, apellido, especialidad, contraseña);
		            registro.agregarUsuario(nuevoUsuario);
		            
		         
		            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
		        } else {
		            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
		        
		        }
			}
		});
		btnRegistrarUsu.setBackground(new Color(255, 51, 0));
		btnRegistrarUsu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistrarUsu.setBounds(246, 254, 129, 39);
		panelRegistro.add(btnRegistrarUsu);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1.setBounds(115, 178, 146, 19);
		panelRegistro.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Rep contraseña");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1_1.setBounds(115, 208, 139, 19);
		panelRegistro.add(lblNewLabel_3_1_1_1_1);
		
		textField_2 = new JPasswordField();
		textField_2.setColumns(10);
		textField_2.setBounds(316, 179, 170, 20);
		panelRegistro.add(textField_2);
		
		textField_3 = new JPasswordField();
		textField_3.setColumns(10);
		textField_3.setBounds(316, 208, 170, 20);
		panelRegistro.add(textField_3);
		
		JPanel panelActualizar = new JPanel();
		panelActualizar.setBackground(new Color(204, 255, 153));
		tabbedPane.addTab("ACTUALIZAR", null, panelActualizar, null);
		panelActualizar.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Actualización del Usuario");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(171, 11, 244, 19);
		panelActualizar.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Nombre");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(109, 88, 146, 19);
		panelActualizar.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Apellido");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_2.setBounds(109, 118, 146, 19);
		panelActualizar.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("DNI o CE");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(109, 57, 146, 19);
		panelActualizar.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Especialidad");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_2.setBounds(109, 148, 146, 19);
		panelActualizar.add(lblNewLabel_3_1_1_2);
		
		txtDniActua = new JTextField();
		txtDniActua.setColumns(10);
		txtDniActua.setBounds(310, 58, 170, 20);
		panelActualizar.add(txtDniActua);
		
		txtNomActua = new JTextField();
		txtNomActua.setColumns(10);
		txtNomActua.setBounds(310, 88, 170, 20);
		panelActualizar.add(txtNomActua);
		
		txtApeActua = new JTextField();
		txtApeActua.setColumns(10);
		txtApeActua.setBounds(310, 118, 170, 20);
		panelActualizar.add(txtApeActua);
		
		txtEspeciActua = new JTextField();
		txtEspeciActua.setColumns(10);
		txtEspeciActua.setBounds(310, 148, 170, 20);
		panelActualizar.add(txtEspeciActua);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = txtDniActua.getText();
		        String nombre = txtNomActua.getText();
		        String apellido = txtApeActua.getText();
		        String especialidad = txtEspeciActua.getText();
		        String nuevaContraseña = txtContraActua.getText();
		        String repContraseña = txtRepContraActua.getText();

		        RegistroUsuarios registro = new RegistroUsuarios();
		        Usuario usuario = registro.buscarPorDni(dni);
		        
		        if (usuario != null) {
		            if (!nuevaContraseña.equals(usuario.getContraseña()) && nuevaContraseña.equals(repContraseña)) {
		                usuario.setNombre(nombre);
		                usuario.setApellido(apellido);
		                usuario.setEspecialidad(especialidad);
		                usuario.setContraseña(nuevaContraseña);
		                registro.guardarUsuarios();
		                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
		            } else {
		                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden o es igual a la anterior.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
		        }
			}
		});
		btnActualizar.setBackground(new Color(255, 255, 51));
		btnActualizar.setBounds(357, 256, 94, 29);
		panelActualizar.add(btnActualizar);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("Contraseña");
		lblNewLabel_3_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1_2.setBounds(109, 178, 146, 19);
		panelActualizar.add(lblNewLabel_3_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Rep contraseña");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1_1_1.setBounds(109, 208, 139, 19);
		panelActualizar.add(lblNewLabel_3_1_1_1_1_1);
		
		txtContraActua = new JPasswordField();
		txtContraActua.setColumns(10);
		txtContraActua.setBounds(310, 179, 170, 20);
		panelActualizar.add(txtContraActua);
		
		txtRepContraActua = new JPasswordField();
		txtRepContraActua.setColumns(10);
		txtRepContraActua.setBounds(310, 208, 170, 20);
		panelActualizar.add(txtRepContraActua);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = txtDniActua.getText();
				 RegistroUsuarios registro = new RegistroUsuarios();
			     Usuario usuario = registro.buscarPorDni(dni);
			     if (usuario != null) {
			            txtNomActua.setText(usuario.getNombre());
			            txtApeActua.setText(usuario.getApellido());
			            txtEspeciActua.setText(usuario.getEspecialidad());
			        } else {
			            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
			        }
			}
		});
		btnBuscar.setBackground(new Color(153, 153, 255));
		btnBuscar.setBounds(145, 256, 94, 29);
		panelActualizar.add(btnBuscar);
	}
}
