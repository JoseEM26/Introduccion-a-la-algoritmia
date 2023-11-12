package semana09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.graalvm.compiler.core.common.FieldsScanner.CalcOffset;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

public class Arroz2 extends JFrame implements ActionListener {

	// Declaraci�n de variables
	private static final long serialVersionUID = 9206324162700448001L;
	private JPanel contentPane;
	private JLabel lblMarca;
	private JLabel lblCantidad;
	private JComboBox<String> cboMarca;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	// Lanza la aplicaci�n
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arroz2 frame = new Arroz2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Crea la GUI
	public Arroz2() {
		setFont(new Font("Monospaced", Font.BOLD, 12));
		setTitle("Arroz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMarca = new JLabel("Marca de arroz");
		lblMarca.setBounds(10, 11, 91, 14);
		contentPane.add(lblMarca);

		lblCantidad = new JLabel("Cantidad de bolsas");
		lblCantidad.setBounds(10, 36, 91, 14);
		contentPane.add(lblCantidad);

		cboMarca = new JComboBox<String>();
		cboMarca.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Coste\u00F1o", "Paisana del Norte", "Tropical Superior", "Norte\u00F1o Superior" }));
		cboMarca.setBounds(111, 8, 100, 20);
		contentPane.add(cboMarca);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(111, 33, 100, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 7, 89, 23);
		contentPane.add(btnProcesar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 32, 89, 23);
		contentPane.add(btnBorrar);

		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 61, 414, 190);
		contentPane.add(scpScroll);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scpScroll.setViewportView(txtS);
	}

	// Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	// Procesa la pulsaci�n del bot�n Borrar
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtCantidad.setText("");
		txtS.setText("");
		cboMarca.setSelectedIndex(0);
		txtCantidad.requestFocus();
	}

	// Procesa la pulsaci�n del bot�n Procesar
	// ====================================================================================================================
       int entradaMarca() {
    	   return cboMarca.getSelectedIndex();  
       }
       int entradaCantidad() {
    	   return Integer.parseInt(txtCantidad.getText())  ;
       }
       
      double calcularImpCompra(int marca,int cantidad) {
    	  double impCompra;
    	  switch (marca) {
  		case 0:
  			impCompra = 14.5 * cantidad;
  			break;
  		case 1:
  			impCompra = 12.6 * cantidad;
  			break;
  		case 2:
  			impCompra = 10.0 * cantidad;
  			break;
  		default:
  			impCompra = 12.8 * cantidad;
  		}
    	  return impCompra;
      }
	
      double calcularImpDescuento(int cantidad,double impCompra) {
    	   double impDesc;
    	   switch (cantidad) {
   		case 1:
   		case 2:
   		case 3:
   			impDesc = 0.09 * impCompra;
   			break;
   		case 4:
   		case 5:
   		case 6:
   			impDesc = 0.11 * impCompra;
   			break;
   		case 7:
   		case 8:
   		case 9:
   			impDesc = 0.13 * impCompra;
   			break;
   		default:
   			impDesc = 0.15 * impCompra;
   		}
    	   return impDesc;
       }
       
	  double calcularImpPago( double impCompra,double impDesc) {
			double impPago;
			impPago = impCompra - impDesc;
			
			return impPago;
		}

	  int calcularcaramelos(int marca ,int cantidad) {
		  int caramelos;
		  
		  switch (marca) {
			case 0:
				caramelos = 3;
				break;
			case 1:
				caramelos = 2;
				break;
			case 2:
				caramelos = 2 * cantidad;
				break;
			default:
				caramelos = 1 * cantidad;
			}
		  return caramelos;
	  }
	  
	  int calcularGomitas(double impPago) {
		  int gomitas;
		  
		  if (impPago < 50)
			    gomitas = 5;
			else if (impPago < 100)
				gomitas = 10;
			else if (impPago < 150)
				gomitas = 15;
			else
			    gomitas = 20;
		  
           return gomitas;	
	  }
	  
	  void imprimir(double impCompra ,double impPago,double impDesc,int caramelos,int gomitas) {
		  txtS.setText("Importe compra dsadsadsa   : S/. " + String.format("%,8.2f", impCompra) + "\n");
			txtS.append("Importe descuento : S/. " + String.format("%,8.2f", impDesc) + "\n");
			txtS.append("Importe pagar     : S/. " + String.format("%,8.2f", impPago) + "\n");
			txtS.append("Caramelos         : " + caramelos + "\n");
			txtS.append("Gomitas           : " + gomitas + "\n");
	  }
	  
	  // ====================================================================================================================
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		// Declaraci�n de variables
		int mar, can, car, gom;
		double ic, id, ip;

		mar=entradaMarca();
		can=entradaCantidad();
		
		ic=calcularImpCompra(mar, can);
		
		id=calcularImpDescuento(can, ic);
		
		ip=calcularImpPago(ic, id);
	
		car=calcularcaramelos(mar, can);
	
		gom=calcularGomitas(ip);
	
	    imprimir(ic,ip,id,car,gom);
	    
	}
}