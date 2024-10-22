	package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringJoiner;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Paciente {
    public int DNI;
    public String nombre;
    public String Apellido;
    public String Emfermedad;
    
    
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getEmfermedad() {
		return Emfermedad;
	}
	public void setEmfermedad(String emfermedad) {
		Emfermedad = emfermedad;
	}
    
public Paciente() {
		
	}

	public Paciente(int dNI, String nombre, String apellido, String emfermedad) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
		this.Apellido = apellido;
		this.Emfermedad = emfermedad;
	}
	
	//Esto me sirve para poder crear un archivo txt como base de dato
	public void CreateArchivoTXT() {
		try {
			File PacienteBD=new File("Paciente.txt");
			if(PacienteBD.createNewFile()) {
				System.out.println("se creo el archivo "+ PacienteBD.getName() +PacienteBD.getAbsolutePath());
			}else {
				System.out.println("Archivo ya existe"+ PacienteBD.getName()+PacienteBD.getAbsolutePath());
			}
		} catch (Exception e) {
			System.out.println("Ocurrio un erro");
			
		
		}
	}
	
	public void MostrarRegistroTabla(JTable tabla) {
		DefaultTableModel model=new DefaultTableModel();
		
		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("Apellido");
		model.addColumn("Enfermedad");
        tabla.setModel(model);
        
        String nombreruta="Paciente.txt";
        File ruta=new File(nombreruta);
        
        try {
            BufferedReader br=new BufferedReader(new FileReader(ruta)); 	
//            String firstLine= br.readLine().trim();
            
            Object[] tableLines= br.lines().toArray();
            
            for(int i=0; i<tableLines.length ;i++) {
            	String line =tableLines[i].toString().trim();
            	String[] datarow=line.split(",");
            	model.addRow(datarow);
            	
            }

		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null,e.getMessage());
		}        
        
		
	}
	
	
	
	
	public void EliminarRegistrotabla(JTable tabla,JTextField Codigo) {
		
		DefaultTableModel model=(DefaultTableModel)tabla.getModel();		
		
		for(int i=0; i<model.getRowCount();i++) {
			if(((String)model.getValueAt(i, 0)).equals(Codigo.getText())) {
				model.removeRow(i);
				break;
			}
		}
		
		try {
			PrintWriter write = new PrintWriter("Paciente.txt");
			write.print("");
			write.close();
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
		}
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Paciente.txt")))){
			
			for(int row=0; row<tabla.getRowCount();row++) {
				StringJoiner  joiner= new StringJoiner(",");

				 for(int i=0; i<tabla.getColumnCount();i++) {
					 Object obj = tabla.getValueAt(row, i);
					 String values= obj==null? "null":obj.toString();
					 joiner.add(values);
				 }
				 System.out.println(joiner.toString());
				 bw.write(joiner.toString());
				 bw.newLine();
			}
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
		}
	}

	
	public void Seleccionar(JTable tabla) {
		try {
			int fila= tabla.getSelectedRow();
			
			if(fila>=0) {
				setDNI(Integer.parseInt(tabla.getValueAt(fila, 0).toString()));
				setNombre(tabla.getValueAt(fila, 1).toString());
				setApellido(tabla.getValueAt(fila, 2).toString());
				setEmfermedad(tabla.getValueAt(fila, 3).toString());
			
			}
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
		}
	}
	
	public void EditarCita(JTable tabla) {

		try {
			PrintWriter write = new PrintWriter("Paciente.txt");
			write.print("");
			write.close();
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
		}
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Paciente.txt")))){
			
			for(int row=0; row<tabla.getRowCount();row++) {
				StringJoiner  joiner= new StringJoiner(",");

				 for(int i=0; i<tabla.getColumnCount();i++) {
					 Object obj = tabla.getValueAt(row, i);
					 String values= obj==null? "null":obj.toString();
					 joiner.add(values);
				 }
				 System.out.println(joiner.toString());
				 bw.write(joiner.toString());
				 bw.newLine();
			}
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
		}
	}
	
	
	}
	
	
	
	