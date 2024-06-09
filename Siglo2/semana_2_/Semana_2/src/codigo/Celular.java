package codigo;

public class Celular {
	//Declarar las variables publicas o privadas
   private int numero;
   private String usuario;
   private int segundos_cons;
   private double precio_seg;
   
   //Crear el constructor
   public Celular(int numero,String usuario,int segundos_cons,double precio_seg) {
	   this.numero=numero;
	   this.usuario=usuario;
	   this.segundos_cons=segundos_cons;
	   this.precio_seg=precio_seg;
   }
   
   //creacion de metodo Set(Colocar o Insertar)
   public void SetNumero(int numero) {
	   this.numero=numero;
   }
   public void SetUsuario(String usuario) {
	   this.usuario=usuario;
   }
   public void SetSegundos_const(int segundos_cons) {
	   this.segundos_cons=segundos_cons;
   }
   public void SetPrecio_seg(double precio_seg) {
	   this.precio_seg=precio_seg;
   }
   
   //Creacion de metodo Get(Coger o llamar)
   public int getNumero() {
	   return numero;
   }
   public String getUsuario() {
	   return usuario;
   }
   public int getSegundos_const() {
	   return segundos_cons;
   }
   public double getPrecio_Seg() {
	   return precio_seg;
   }
   
   
   //metodos de la clase
   
   public double CostoConsumo() {
	   return segundos_cons*precio_seg;
   }
   public double Impuesto() {
	   return CostoConsumo()*0.18;
   }
   public double Totalapagar() {
	   return CostoConsumo()+Impuesto();
   }
   
   
   

   
   
   
   
   
   
   
   
   
   
   
   
}
