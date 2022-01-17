package ejercicio2;
/* 

@author Víctor Castillo

*/
public class Main {
	public static void main(String[] args) {
		
		Password contraseña = new Password();
		Password contraseña2 = new Password(8);
		
		System.out.println(contraseña.toString());
		System.out.println(contraseña2.toString());
		
	}
}
