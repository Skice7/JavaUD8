package ejercicio2;

/* 

@author V�ctor Castillo

*/
import java.util.Random;

public class Password {

	private int longitud;
	private String contrase�a;
	Random ClaseRandom = new Random();
	
	
	//Constructor por defecto
	public Password() {
		
		this.longitud = 8;
		this.contrase�a ="";
		
		
	}
	//Constructor con longitud
	public Password(int longitud) {
		this.longitud = longitud;
		
		for (int i = 0; i < longitud; i++) {
			contrase�a+=Integer.toString(ClaseRandom.nextInt(8));
			
		}
	}

	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
	
}
