package clases;

public class LoginSistema {
	private RegistroUsuarios registro;
	private int intentos = 0;
	private final int maxInt = 3;
	
	public LoginSistema() {
        registro = new RegistroUsuarios(); 
    }
	
	public LoginSistema(RegistroUsuarios registro) {
        this.registro = registro;
    }
	
	public boolean autentificar(String dni, String contraseña) 
	{
		Usuario usuario = registro.buscarPorDni(dni);
		if(usuario != null && usuario.getContraseña().equals(contraseña)) 
			{
				return true;
			}
		intentos ++;
		if(intentos >= maxInt) 
		{
			System.out.println("Número máximo de intentos alcanzado. Cerrando sistema.");
            System.exit(0);
		}
		 return false;
	}
	 public void resetearIntentos() {
	        intentos = 0;
	    }
}
