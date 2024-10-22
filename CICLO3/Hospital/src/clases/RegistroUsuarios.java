package clases;
import java.io.*;
import java.util.*;


public class RegistroUsuarios {
	private final String archivoUsuario = "usuarios.txt";
	private List<Usuario> usuarios;
	
	public RegistroUsuarios() 
	{
		usuarios = new ArrayList<>();
		cargarUsuarios();
	}
	
	private void cargarUsuarios() {
		
		File file = new File(archivoUsuario);
		if(file.exists()) 
		{
			try (BufferedReader reader = new BufferedReader(new FileReader(file)))
			{
				String linea;
				while((linea = reader.readLine())!= null)
				{
					 String[] datos = linea.split(",");
	                    if (datos.length == 5) 
	                    {
	                        Usuario usuario = new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4]);
	                        usuarios.add(usuario);
	                    }
				}
			}
			catch (IOException e) {
                e.printStackTrace();
            }
		}
		else 
		{
			crearArchivo();
		}
	}
	
	private void crearArchivo() 
	{
		try 
		{
			new File(archivoUsuario).createNewFile();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void agregarUsuario(Usuario reg) 
	{
		usuarios.add(reg);
		guardarUsuarios();
	}
	
	public void guardarUsuarios() 
	{
		try (PrintWriter writer = new PrintWriter(new FileWriter(archivoUsuario)))
		{
			for (Usuario usuario : usuarios) {
				writer.println(usuario);
			}	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public Usuario buscarPorDni(String dni) 
	{
		for (Usuario usuario : usuarios) {
			if (usuario.getDni().equals(dni)) 
			{
				return usuario;
			}
		}
		return null;
	}
	
	
	
}
