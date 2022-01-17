package ejercicio2;

/* 

@author Víctor Castillo

*/
import java.util.Random;

public class Password {

	private int longitud;
	private String contraseña;
	Random ClaseRandom = new Random();
	
	
	//Constructor por defecto
	public Password() {
		
		this.longitud = 8;
		this.contraseña ="";
		
		
	}
	//Constructor con longitud
	public Password(int longitud) {
		this.longitud = longitud;
		
		for (int i = 0; i < longitud; i++) {
			contraseña+=Integer.toString(ClaseRandom.nextInt(8));
			
		}
	}

	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
}
